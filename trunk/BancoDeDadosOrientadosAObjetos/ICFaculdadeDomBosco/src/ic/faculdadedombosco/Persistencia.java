/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;


/**
 *
 * @author Anderson
 */
public class Persistencia {

    static ObjectContainer db = null;

   public static void AbrirConexao(){
        try{
            Persistencia.db = Db4o.openFile("facdombosco.dbo");
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
        equip.setRegistro(codigoProximoInserido());
        db.set(equip);
    }

    public static int codigoProximoInserido() {
        Query consulta = db.query();
        consulta.constrain(Equipamento.class);
        consulta.descend("registro").orderDescending(); // pega o maior codigo e ordena(redundante)

        ObjectSet lista = consulta.execute();
        
        if (lista.size() > 0) {
            Equipamento equip = (Equipamento) lista;//.get(0);
            return equip.getRegistro() + 1;// ultimo codigo mais 1
        } else {
            return 1;
        }
    }

    public void Excluir(){

    }

    public void Pesquisar(){

    }
}
