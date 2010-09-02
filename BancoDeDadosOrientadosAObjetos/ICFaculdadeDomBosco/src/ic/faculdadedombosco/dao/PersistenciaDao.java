/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.dao;

import com.db4o.*;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.model.Equipamento;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;


/**
 *
 * @author Anderson
 */
public class PersistenciaDao {

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

    public void Excluir(Equipamento equip){
        Query consulta = db.query();
        consulta.constrain(Equipamento.class);
        consulta.descend("codigo").constrain(equip.getCd_equipamento());
        ObjectSet lista = consulta.execute();
        if (lista.size() > 0) {
            Equipamento equip = (Equi) lista.get(0);
            db.delete(equip);
        }
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

    public List<Equipamento> listar(){

        List list = new List();

        try{
            Equipamento equip = new Equipamento
        }finally{

        }
    }
}
