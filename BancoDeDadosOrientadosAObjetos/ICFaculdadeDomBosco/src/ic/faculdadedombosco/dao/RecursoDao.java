package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Recurso;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class RecursoDao {

    private Conexao conexao;

    public Recurso incluir(Recurso recurso)
    {
        conexao = new Conexao();

        try{
            conexao.getDb().store(recurso);
            conexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso...", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar recurso!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
        return recurso;
    }

    public Recurso atualizar(Recurso recurso)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").constrain(recurso.getDs_recurso());

        Recurso rec = (Recurso) query.execute().get(0);
        rec.setDs_recurso(recurso.getDs_recurso());
        rec.setTp_recurso(recurso.getTp_recurso());
        rec.setLc_recurso(recurso.getLc_recurso());
        rec.setSt_usuario(recurso.getSt_usuario());
        rec.setQt_ocupante(recurso.getQt_ocupante());
        conexao.getDb().store(rec);
        conexao.getDb().commit();

        return recurso;
    }

    public Recurso excluir(Recurso recurso)
    {
        conexao = new Conexao();

        ObjectSet<Recurso> lista = conexao.getDb().get(recurso);
        Recurso rec = lista.next();
        conexao.getDb().delete(rec);
        conexao.getDb().commit();

        return recurso;
    }

    public Recurso buscar(String descricao)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
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
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").orderAscending();
        ObjectSet<Recurso> lista = query.execute();

        return lista;
    }

}
