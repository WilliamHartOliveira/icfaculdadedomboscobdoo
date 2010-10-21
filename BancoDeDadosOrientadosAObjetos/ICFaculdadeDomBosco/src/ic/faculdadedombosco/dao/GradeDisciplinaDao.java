package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.GradeDisciplina;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class GradeDisciplinaDao {

    private Conexao oConexao;

    public GradeDisciplina incluir(GradeDisciplina gradeDisciplina)
    {
        oConexao = new Conexao();

        try{
            oConexao.getDb().store(gradeDisciplina);
            oConexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        return gradeDisciplina;
    }

    public GradeDisciplina atualizar(GradeDisciplina gradeDisciplina)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("curso_gradeDisciplina").constrain(gradeDisciplina.getCurso_gradeDisciplina());

        GradeDisciplina graddisc = (GradeDisciplina) query.execute().get(0);

        graddisc.setDisciplina_gradeDisciplina(gradeDisciplina.getDisciplina_gradeDisciplina());
        graddisc.setCurso_gradeDisciplina(gradeDisciplina.getCurso_gradeDisciplina());
        graddisc.setRecurso_gradeDisciplina(gradeDisciplina.getRecurso_gradeDisciplina());
        graddisc.setProfessor__gradeDisciplina(gradeDisciplina.getProfessor__gradeDisciplina());
        graddisc.setStatus_gradeDisciplina(gradeDisciplina.getStatus_gradeDisciplina());

        oConexao.getDb().store(graddisc);
        oConexao.getDb().commit();

        return gradeDisciplina;
    }

    public GradeDisciplina excluir(GradeDisciplina gradeDisciplina)
    {
        oConexao = new Conexao();

        ObjectSet<GradeDisciplina> lista = oConexao.getDb().get(gradeDisciplina);
        GradeDisciplina graddisc = lista.next();
        oConexao.getDb().delete(graddisc);
        oConexao.getDb().commit();

        return gradeDisciplina;
    }

    public GradeDisciplina buscar(String curso)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("curso_gradeDisciplina").constrain(curso);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (GradeDisciplina) lista.get(0);
        }else{
            return null;
        }
    }

    public ObjectSet<GradeDisciplina> montarTabelaEquip()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("curso_gradeDisciplina").orderAscending();
        ObjectSet<GradeDisciplina> lista = query.execute();

        return lista;
    }
}
