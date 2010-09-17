/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.model.Recurso;

/**
 *
 * @author Anderson
 */
public class RecursoService {


    public Recurso incluir(Recurso recurso)
    {

       RecursoDao recursoDao = new RecursoDao();

       return recursoDao.incluir(recurso);
    }

    public Recurso atualizar(Recurso recurso)
    {

       RecursoDao recursoDao = new RecursoDao();

       return recursoDao.atualizar(recurso);
    }

    public Recurso excluir(Recurso recurso)
    {

       RecursoDao recursoDao = new RecursoDao();

       return recursoDao.excluir(recurso);
    }

    public Recurso buscar(String descricao)
    {

       RecursoDao recursoDao = new RecursoDao();

       return recursoDao.buscar(descricao);
    }
}
