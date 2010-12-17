package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Usuario;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class UsuarioService {

    public Usuario incluir(Usuario oUsuario)
    {

        Usuario validaUsuario = new Usuario();
        UsuarioDao oUsuarioDao = new UsuarioDao();

        validaUsuario = oUsuarioDao.buscarNome(oUsuario.getNome_usuario());
        if(validaUsuario.getNome_usuario().equals(oUsuario.getNome_usuario())){
            JOptionPane.showMessageDialog(null, "Nome do Usuário "+oUsuario.getNome_usuario()+" já existe!", "Usuário", JOptionPane.WARNING_MESSAGE);
        } else if(validaUsuario.getUsuario_usuario().equals(oUsuario.getUsuario_usuario())){
            JOptionPane.showMessageDialog(null, "Login do Usuário "+oUsuario.getUsuario_usuario()+" já existe!", "Usuário", JOptionPane.WARNING_MESSAGE);
        }else{
            return oUsuarioDao.incluir(oUsuario);
        }

        return oUsuario;
    }

    public Usuario atualizar(Usuario oUsuario)
    {

       UsuarioDao oUsuarioDao = new UsuarioDao();

       return oUsuarioDao.atualizar(oUsuario);
    }

    public Usuario excluir(Usuario oUsuario)
    {

       UsuarioDao oUsuarioDao = new UsuarioDao();

       return oUsuarioDao.excluir(oUsuario);
    }

    public Usuario buscar(String nome, String senha)
    {
        UsuarioDao oUsuarioDao = new UsuarioDao();
        if(oUsuarioDao.buscar(nome, senha)!=null){
            
            return oUsuarioDao.buscar(nome, senha);
        }else
            System.out.println("Existe");

        return oUsuarioDao.buscar(nome, senha);

    }
}
