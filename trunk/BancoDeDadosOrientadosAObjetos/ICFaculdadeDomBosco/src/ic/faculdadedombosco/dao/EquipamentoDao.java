package ic.faculdadedombosco.dao;

import ic.faculdadedombosco.Conexao;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.model.Equipamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class EquipamentoDao {

    private Conexao oConexao;
    
    public Equipamento incluir(Equipamento equipamento)
    {
        oConexao = new Conexao();

        try{
            oConexao.getDb().store(equipamento);
            oConexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){            
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        return equipamento;
    }

    public Equipamento atualizar(Equipamento equipamento)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").constrain(equipamento.getCdEquipamento());

        Equipamento equip = (Equipamento) query.execute().get(0);
        equip.setCdEquipamento(equipamento.getCdEquipamento());
        equip.setDsEquipamento(equipamento.getDsEquipamento());
        equip.setInCaboRede(equipamento.getInCaboRede());
        equip.setStEquipamento(equipamento.getStEquipamento());
        oConexao.getDb().store(equip);
        oConexao.getDb().commit();

        return equipamento;
    }

    public Equipamento excluir(Equipamento equipamento)
    {
        oConexao = new Conexao();

        ObjectSet<Equipamento> lista = oConexao.getDb().get(equipamento);
        Equipamento equipamento1 = lista.next();
        oConexao.getDb().delete(equipamento1);
        oConexao.getDb().commit();

        return equipamento;
    }

    public Equipamento buscar(String codigo)
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").constrain(codigo);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Equipamento) lista.get(0);
        }else{
            return null;
        }
        
    }

    public ObjectSet<Equipamento> montarTabelaEquipamento()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").orderAscending();
        ObjectSet<Equipamento> lista = query.execute();

        return lista;
    }


    public List<Equipamento> listarEquipamento()
    {
        oConexao = new Conexao();
        List<Equipamento> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(Equipamento.class);
        consulta.descend("cdEquipamento").orderAscending();

        ObjectSet resultado=consulta.execute();

        while(resultado.hasNext())
        {
              lista.add((Equipamento)resultado.next());
        }

        return lista;
    }
}