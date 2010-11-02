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

       UsuarioDao oUsuarioDao = new UsuarioDao();

       return oUsuarioDao.incluir(oUsuario);
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
        }else{
            JOptionPane.showMessageDialog(null, "O usuário ou a senha estão incorretos. Tente novamente.", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }

        return oUsuarioDao.buscar(nome, senha);      
    }
}
