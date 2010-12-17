package ic.faculdadedombosco.dao;

import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class UsuarioDao {
    
     private Conexao oConexao;

     public Usuario incluir(Usuario usuario)
     {

         oConexao = new Conexao();

         try{
             oConexao.getDb().store(usuario);
             oConexao.getDb().commit();
             JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Informar", JOptionPane.INFORMATION_MESSAGE);
         }
         catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Erro ao salvar o objeto.\n"+ex, "Atenção!", JOptionPane.ERROR_MESSAGE);
         }
         return usuario;
     }

     public Usuario atualizar(Usuario usuario)
     {
         oConexao = new Conexao();

         Query query = oConexao.getDb().query();
         query.constrain(Usuario.class);
         query.descend("nome_usuario").constrain(usuario.getNome_usuario());

         Usuario usu = (Usuario) query.execute().get(0);
         usu.setNome_usuario(usu.getNome_usuario());
         usu.setUsuario_usuario(usu.getUsuario_usuario());
         usu.setSenha_usuario(usu.getSenha_usuario());
         usu.setAdminstrador_usuario(usu.getAdminstrador_usuario());
         oConexao.getDb().store(usu);
         oConexao.getDb().commit();

         return usuario;
     }

    public Usuario excluir(Usuario usuario)
    {
        oConexao = new Conexao();

        ObjectSet<Usuario> lista = oConexao.getDb().get(usuario);
        Usuario usu = lista.next();
        oConexao.getDb().delete(usu);
        oConexao.getDb().commit();

        return usuario;
    }

    public Usuario buscar(String nome, String senha)
    {
        oConexao = new Conexao();
        oConexao.abrirConexao();

        Query query = oConexao.getDb().query();
        query.constrain(Usuario.class);
        Constraint secondConstr = query.descend("senha_usuario").constrain(senha);
        query.descend("usuario_usuario").constrain(nome).and(secondConstr);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Usuario) lista.get(0);
        }else{
            return null;
        }

    }

    public Usuario buscarNome(String nome)
    {
        oConexao = new Conexao();
        oConexao.abrirConexao();

        Query query = oConexao.getDb().query();
        query.constrain(Usuario.class);
        query.descend("nome_usuario").constrain(nome);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Usuario) lista.get(0);
        }else{
            return null;
        }
    }

      public Usuario buscarUsuario(String usuario)
    {
        oConexao = new Conexao();
        oConexao.abrirConexao();

        Query query = oConexao.getDb().query();
        query.constrain(Usuario.class);
        query.descend("usuario_usuario").constrain(usuario);

        ObjectSet lista = query.execute();

        if(lista.hasNext()){
            return (Usuario) lista.get(0);
        }else{
            return null;
        }
    }

    public ObjectSet<Usuario> montarTabelaUsuario()
    {
        oConexao = new Conexao();

        Query query = oConexao.getDb().query();
        query.constrain(Usuario.class);
        query.descend("nome_usuario").orderAscending();
        ObjectSet<Usuario> lista = query.execute();

        return lista;
    }

     public List<Usuario> listarUsuario()
    {
        oConexao = new Conexao();
        List<Usuario> lista=new ArrayList();
        Query consulta= oConexao.getDb().query();
        consulta.constrain(Usuario.class);
        consulta.descend("nome_usuario").orderAscending();

        ObjectSet resultado=consulta.execute();

        while(resultado.hasNext())
        {
              lista.add((Usuario)resultado.next());
        }
        return lista;
    }
}
