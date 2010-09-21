/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Usuario;

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

    public Usuario buscar(String nome)
    {

       UsuarioDao usuarioDao = new UsuarioDao();

       return usuarioDao.buscar(nome);
    }

}
