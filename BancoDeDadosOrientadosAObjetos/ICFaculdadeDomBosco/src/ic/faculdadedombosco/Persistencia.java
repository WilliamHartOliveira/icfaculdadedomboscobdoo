/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author Anderson
 */
public class Persistencia {

    ObjectContainer db;

    public void Salvar(Equipamento equip){
       db.set(equip);
    }

    public void Excluir(){

    }

    public void Pesquisar(){

    }

    public void AbrirConexao(){

        db = Db4o.openFile("facdombosco.dbo");
        
        try{
            System.out.println("Conexão aberta...");
        }
        catch(Exception ex){
            System.out.println("Erro em abrir conexão: "+ex);
        }
        finally{
            db.close();
        }
    }

    public void FecharConexao(){
       db.close();
    }
}
