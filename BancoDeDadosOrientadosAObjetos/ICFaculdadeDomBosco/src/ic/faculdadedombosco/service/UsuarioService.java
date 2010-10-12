/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Usuario;
import ic.faculdadedombosco.view.GUIPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class UsuarioService {

    public Usuario incluir(Usuario usuario)
    {

       UsuarioDao usuarioDao = new UsuarioDao();

       return usuarioDao.incluir(usuario);
    }

    public Usuario atualizar(Usuario usuario)
    {

       UsuarioDao usuarioDao = new UsuarioDao();

       return usuarioDao.atualizar(usuario);
    }

    public Usuario excluir(Usuario usuario)
    {

       UsuarioDao usuarioDao = new UsuarioDao();

       return usuarioDao.excluir(usuario);
    }

    public Usuario buscar(String nome, String senha)
    {
        UsuarioDao usuarioDao = new UsuarioDao();
        if(usuarioDao.buscar(nome, senha).equals(true)){
            
            return usuarioDao.buscar(nome, senha);
        }else{
            JOptionPane.showMessageDialog(null, "O usuário ou a senha estão incorretos. Tente novamente.", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }

        return usuarioDao.buscar(nome, senha);

       
    }

}
