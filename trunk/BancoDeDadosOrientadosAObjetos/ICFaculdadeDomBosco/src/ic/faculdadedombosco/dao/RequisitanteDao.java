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

    private Conexao oConexao;

    public Requisitante incluir(Requisitante requisitante)
    {
        oConexao = new Conexao();

        try{
            oConexao.getDb().store(requisitante);
            oConexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        return requisitante;
    }

    public Requisitante atualizar(Requisitante requisitante)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").constrain(requisitante.getRequisitante_nome());

        Requisitante req = (Requisitante) query.execute().get(0);
        req.setRequisitante_matricula(requisitante.getRequisitante_matricula());
        req.setRequisitante_status(requisitante.getRequisitante_status());
        req.setRequisitante_nome(requisitante.getRequisitante_nome());
        req.setRequisitante_tipo(requisitante.getRequisitante_tipo());
        req.setRequisitante_telefone(requisitante.getRequisitante_telefone());

        oConexao.getDb().store(req);
        oConexao.getDb().commit();

        return requisitante;
    }

    public Requisitante excluir(Requisitante requisitante)
    {
        oConexao = new Conexao();

        ObjectSet<Requisitante> lista = oConexao.getDb().get(requisitante);
        Requisitante req = lista.next();
        oConexao.getDb().delete(req);
        oConexao.getDb().commit();

        return requisitante;
    }

    public Requisitante buscar(String nome)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
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
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").orderAscending();
        ObjectSet<Requisitante> lista = query.execute();

        return lista;
    }

}
