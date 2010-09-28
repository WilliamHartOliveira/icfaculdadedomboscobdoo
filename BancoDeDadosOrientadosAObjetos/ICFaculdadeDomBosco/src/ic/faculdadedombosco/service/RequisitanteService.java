/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Requisitante;

/**
 *
 * @author Anderson
 */
public class RequisitanteService {

    public Requisitante incluir(Requisitante requisitante)
    {

       RequisitanteDao requisitanteDao = new RequisitanteDao();

       return requisitanteDao.incluir(requisitante);
    }

    public Requisitante atualizar(Requisitante requisitante)
    {

       RequisitanteDao requisitanteDao = new RequisitanteDao();

       return requisitanteDao.atualizar(requisitante);
    }

    public Requisitante excluir(Requisitante requisitante)
    {

       RequisitanteDao requisitanteDao = new RequisitanteDao();

       return requisitanteDao.excluir(requisitante);
    }

    public Requisitante buscar(String nome)
    {

       RequisitanteDao requisitanteDao = new RequisitanteDao();

       return requisitanteDao.buscar(nome);
    }

}