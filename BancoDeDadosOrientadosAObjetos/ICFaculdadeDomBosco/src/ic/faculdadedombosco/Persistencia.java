/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class Persistencia {

   static ObjectContainer db = null;

   public static void AbrirConexao(){    
        try{
            db = Db4o.openFile("facdombosco.dbo");
            System.out.println("Conexão aberta...");
        }
        catch(Exception ex){
            System.out.println("Erro em abrir conexão: "+ex);
        }
        finally{
            db.close();
        }
    }

    public static void FecharConexao(){
        try{
            db.close();
            System.out.println("Conexão fechada...");
        }
        catch(Exception ex){
            System.out.println("Erro em fechar conexão: "+ex);
        }
        finally{
            db.close();
        }
    }
    public static void Salvar(Equipamento equip){
        try{
            db.store(equip);            
        }
        catch(Exception ex){
            System.out.println("Erro ao salvar o objeto!!!\n"+ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto...\n"+ex, "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Excluir(){

    }

    public void Pesquisar(){

    }
}
