package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Requisitante;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class RequisitanteDao {

    private Conexao conexao;

    public Requisitante incluir(Requisitante requisitante)
    {
        conexao = new Conexao();

        try{
            conexao.getDb().store(requisitante);
            conexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso...", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar requisitante!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
        return requisitante;
    }

    public Requisitante atualizar(Requisitante requisitante)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").constrain(requisitante.getRequisitante_nome());

        Requisitante req = (Requisitante) query.execute().get(0);
        req.setRequisitante_matricula(requisitante.getRequisitante_matricula());
        req.setRequisitante_status(requisitante.getRequisitante_status());
        req.setRequisitante_nome(requisitante.getRequisitante_nome());
        req.setRequisitante_tipo(requisitante.getRequisitante_tipo());
        req.setRequisitante_telefone(requisitante.getRequisitante_telefone());

        conexao.getDb().store(req);
        conexao.getDb().commit();

        return requisitante;
    }

    public Requisitante excluir(Requisitante requisitante)
    {
        conexao = new Conexao();

        ObjectSet<Requisitante> lista = conexao.getDb().get(requisitante);
        Requisitante req = lista.next();
        conexao.getDb().delete(req);
        conexao.getDb().commit();

        return requisitante;
    }

    public Requisitante buscar(String nome)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").constrain(nome);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Requisitante) lista.get(0);
        }else{
            return null;
        }

    }

    public ObjectSet<Requisitante> montarTabelaEquip()
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").orderAscending();
        ObjectSet<Requisitante> lista = query.execute();

        return lista;
    }

}
