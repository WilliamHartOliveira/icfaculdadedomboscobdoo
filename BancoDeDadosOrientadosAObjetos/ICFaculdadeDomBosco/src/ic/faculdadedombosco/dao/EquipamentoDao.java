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

    private Conexao conexao;
    
    public Equipamento incluir(Equipamento equipamento)
    {
        conexao = new Conexao();

        try{
            conexao.getDb().store(equipamento);
            conexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso...", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar o equipamento!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
        return equipamento;
    }

    public Equipamento atualizar(Equipamento equipamento)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").constrain(equipamento.getCdEquipamento());

        Equipamento equip = (Equipamento) query.execute().get(0);
        equip.setCdEquipamento(equipamento.getCdEquipamento());
        equip.setDsEquipamento(equipamento.getDsEquipamento());
        equip.setInCaboRede(equipamento.getInCaboRede());
        equip.setStEquipamento(equipamento.getStEquipamento());
        conexao.getDb().store(equip);
        conexao.getDb().commit();

        return equipamento;
    }

    public Equipamento excluir(Equipamento equipamento)
    {
        conexao = new Conexao();

        ObjectSet<Equipamento> lista = conexao.getDb().get(equipamento);
        Equipamento equipamento1 = lista.next();
        conexao.getDb().delete(equipamento1);
        conexao.getDb().commit();

        return equipamento;
    }

    public Equipamento buscar(String codigo)
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").constrain(codigo);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Equipamento) lista.get(0);
        }else{
            return null;
        }
        
    }

    public ObjectSet<Equipamento> montarTabelaEquip()
    {
        conexao = new Conexao();

        Query query = conexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").orderAscending();
        ObjectSet<Equipamento> lista = query.execute();

        return lista;
    }


    public List<Equipamento> listarEquip()
    {
        conexao = new Conexao();
        List<Equipamento> lista=new ArrayList();
        Query consulta= conexao.getDb().query();
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