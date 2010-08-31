/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
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

    public void Pesquisar(String cd_equipamento){
        /*Query consulta = db.query();
        consulta.constrain(Equipamento.class);
        consulta.descend("cd_equipamento").constrain(cd_equipamento);

        ObjectSet lista = consulta.execute();

        if (lista.size() > 0) {
            return (Equipamento) lista.get(0);

        } else {
            return null;
        }*/
    }
    
}
