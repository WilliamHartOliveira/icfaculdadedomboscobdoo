package ic.faculdadedombosco;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/*
 * @author Anderson
 * @author William
 */

public class Conexao {

    private static ObjectContainer oObjectContainer;
    private static StringBuilder sb = new StringBuilder();

    public void abrirConexao(){
        try {
            oObjectContainer = Db4o.openFile("facdombosco.dbo");
            sb.append("Conexão Realizada com Sucesso.");
        }catch(Exception ex){
            sb.append("Erro ao abrir conexão: "+ex);
        }
        finally{

            if (sb.length() > 0) {
                try {
                    throw new Exception(sb.toString());
                }
                catch (Exception ex) {
                    //Ninguém precisa saber que deu erro
                }
            }
        }
    }

    public void fecharConexao(){
        
        try{
            oObjectContainer.close();
            sb.append("Conexão fechada");
        }catch(Exception ex){
            sb.append("Erro em fechar conexão: "+ex);
        }
        finally{

            if (sb.length() > 0) {
                try {
                    throw new Exception(sb.toString());
                }
                catch (Exception ex) {
                    //Ninguém precisa saber que deu erro
                }
            }
        }
    }

    public ObjectContainer getDb()
    {
        return oObjectContainer;
    }
}
