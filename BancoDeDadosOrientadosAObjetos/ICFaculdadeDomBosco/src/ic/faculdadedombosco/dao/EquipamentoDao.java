/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.dao;

import com.db4o.ObjectContainer;
import ic.faculdadedombosco.model.Equipamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class EquipamentoDao {

    //private static ObjectContainer db;
    private Conexao conexao;
    
    public Equipamento incluir(Equipamento equipamento){
        try{
            conexao.getDb().store(equipamento);
            conexao.getDb().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso...", "Informar", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar o objeto!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }
        return equipamento;
    }

    public Equipamento atualizar(Equipamento equipamento){

        return equipamento;
    }

    public Equipamento excluir(Equipamento equipamento){

        return equipamento;
    }

    public Equipamento buscar(Equipamento equipamento){

        return equipamento;
    }

    public List<Equipamento> listar(){

        List<Equipamento> listaEquipamento = new ArrayList<Equipamento>();

        return listaEquipamento;
    }

}
