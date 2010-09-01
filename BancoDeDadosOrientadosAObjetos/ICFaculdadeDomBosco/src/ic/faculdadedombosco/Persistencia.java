/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import com.db4o.*;
import com.db4o.ObjectSet;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Anderson
 */
public class Persistencia {



    static ObjectContainer db = null;

    public void AbrirConexao(){
       db = Db4o.openFile("facdombosco.dbo"); 
       System.out.println("Conexão aberta...");
    }

    public  void FecharConexao(){
        db.close();
        try{
            System.out.println("Conexão fechada...");
        }
        catch(Exception ex){
            System.out.println("Erro em fechar conexão: "+ex);
        }
    }
    public void Salvar(Equipamento equip){
        try{
            db.store(equip);            
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar o objeto!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void alterar(){

    }

    public void Excluir(){

    }

    /*public static Equipamento Pesquisar(String ds_equipamento){

        Query consulta = db.query();
        consulta.constrain(Equipamento.class);
        consulta.descend("ds_equipamento").constrain(ds_equipamento);

        ObjectSet lista = consulta.execute();


        if (lista.size() > 0) {
            return (Equipamento) lista.toString();

        } else {
            return null;
        }
    }*/

    /*public List<Equipamento> listarEquipamento(Equipamento equipamento){

      ObjectSet<Equipamento> lista = db.get(equipamento);

        while(lista.hasNext()){
           System.out.println(lista.next);
        }
        return listarEquipamento(equipamento);

    }*/
}
