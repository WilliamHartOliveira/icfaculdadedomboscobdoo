package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.Conexao;
import java.util.ArrayList;
import java.util.List;
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
        query.descend("disciplina_gradeDisciplina").constrain(gradeDisciplina.getDisciplina_gradeDisciplina());

        GradeDisciplina graddisc = (GradeDisciplina) query.execute().get(0);

        graddisc.setDisciplina_gradeDisciplina(gradeDisciplina.getDisciplina_gradeDisciplina());
        graddisc.setCurso_gradeDisciplina(gradeDisciplina.getCurso_gradeDisciplina());
        graddisc.setRecurso__gradeDisciplina(gradeDisciplina.getRecurso__gradeDisciplina());
        graddisc.setProfessor_gradeDisciplina(gradeDisciplina.getProfessor_gradeDisciplina());
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

    public GradeDisciplina buscar(String disciplina)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("disciplina_gradeDisciplina").constrain(disciplina);

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
        query.descend("disciplina_gradeDisciplina").orderAscending();
        ObjectSet<GradeDisciplina> lista = query.execute();

        return lista;
    }

    public List<GradeDisciplina> listarGradeDisciplina()
    {
        oConexao = new Conexao();
        List<GradeDisciplina> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(GradeDisciplina.class);
        consulta.descend("disciplina_gradeDisciplina").orderAscending();

        ObjectSet resultado=consulta.execute();

        while(resultado.hasNext())
        {
              lista.add((GradeDisciplina)resultado.next());
        }

        return lista;
    }
}
