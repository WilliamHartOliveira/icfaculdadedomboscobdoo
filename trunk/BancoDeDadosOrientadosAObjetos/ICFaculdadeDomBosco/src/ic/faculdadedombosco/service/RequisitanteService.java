package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Requisitante;

/*
 * @author Anderson
 */
public class RequisitanteService {

    public Requisitante incluir(Requisitante oRequisitante)
    {

       RequisitanteDao oRequisitanteDao = new RequisitanteDao();

       return oRequisitanteDao.incluir(oRequisitante);
    }

    public Requisitante atualizar(Requisitante oRequisitante)
    {

       RequisitanteDao oRequisitanteDao = new RequisitanteDao();

       return oRequisitanteDao.atualizar(oRequisitante);
    }

    public Requisitante excluir(Requisitante oRequisitante)
    {

       RequisitanteDao oRequisitanteDao = new RequisitanteDao();

       return oRequisitanteDao.excluir(oRequisitante);
    }

    public Requisitante buscar(String nome)
    {

       RequisitanteDao oRequisitanteDao = new RequisitanteDao();

       return oRequisitanteDao.buscar(nome);
    }

}