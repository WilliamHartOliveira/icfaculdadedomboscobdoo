package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Recurso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class RecursoDao {

    private Conexao oConexao;

    public Recurso incluir(Recurso recurso)
    {
        oConexao = new Conexao();

        try{
            oConexao.getDb().store(recurso);
            oConexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        return recurso;
    }

    public Recurso atualizar(Recurso recurso)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").constrain(recurso.getDs_recurso());

        Recurso rec = (Recurso) query.execute().get(0);
        rec.setDs_recurso(recurso.getDs_recurso());
        rec.setTp_recurso(recurso.getTp_recurso());
        rec.setLc_recurso(recurso.getLc_recurso());
        rec.setSt_usuario(recurso.getSt_usuario());
        rec.setQt_ocupante(recurso.getQt_ocupante());
        oConexao.getDb().store(rec);
        oConexao.getDb().commit();

        return recurso;
    }

    public Recurso excluir(Recurso recurso)
    {
        oConexao = new Conexao();

        ObjectSet<Recurso> lista = oConexao.getDb().get(recurso);
        Recurso rec = lista.next();
        oConexao.getDb().delete(rec);
        oConexao.getDb().commit();

        return recurso;
    }

    public Recurso buscar(String descricao)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").constrain(descricao);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Recurso) lista.get(0);
        }else{
            return null;
        }

    }

    public ObjectSet<Recurso> montarTabelaEquip()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").orderAscending();
        ObjectSet<Recurso> lista = query.execute();

        return lista;
    }

    public List<Recurso> listarRecurso()
    {
        oConexao = new Conexao();
        List<Recurso> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(Recurso.class);
        consulta.descend("ds_recurso").orderAscending();

        ObjectSet resultado = consulta.execute();

        while(resultado.hasNext())
        {
              lista.add((Recurso)resultado.next());
        }

        return lista;
    }

}
