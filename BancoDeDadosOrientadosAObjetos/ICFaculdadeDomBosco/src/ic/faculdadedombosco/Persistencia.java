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

    public void Salvar(){

    }

    public void Excluir(){

    }

    public void Pesquisar(){

    }

    public void AbrirConexao(){
        ObjectContainer db = Db4o.openFile("facdombosco.dbo");
        try{

        }
        finally{
            db.close();
        }


    }

    public void FecharConexao(){

    }
}
