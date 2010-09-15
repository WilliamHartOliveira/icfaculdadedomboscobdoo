/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.dao;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author Anderson
 */
public class Conexao {

    private ObjectContainer db;

    public void abrirConexao(){
        db = Db4o.openFile("facdombosco.dbo");
        System.out.println("Conexão aberta...");
    }

    public void fecharConexao(){
        db.close();
        try{
            System.out.println("Conexão fechada...");
        }
        catch(Exception ex){
            System.out.println("Erro em fechar conexão: "+ex);
        }
    }

    public ObjectContainer getDb()
    {
        return this.db;
    }
}
