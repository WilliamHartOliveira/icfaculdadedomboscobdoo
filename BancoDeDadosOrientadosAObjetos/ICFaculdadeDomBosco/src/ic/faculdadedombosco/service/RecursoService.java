package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.model.Recurso;

/*
 * @author Anderson
 */
public class RecursoService {


    public Recurso incluir(Recurso oRecurso)
    {

       RecursoDao oRecursoDao = new RecursoDao();

       return oRecursoDao.incluir(oRecurso);
    }

    public Recurso atualizar(Recurso oRecurso)
    {

       RecursoDao oRecursoDao = new RecursoDao();

       return oRecursoDao.atualizar(oRecurso);
    }

    public Recurso excluir(Recurso oRecurso)
    {

       RecursoDao oRecursoDao = new RecursoDao();

       return oRecursoDao.excluir(oRecurso);
    }

    public Recurso buscar(String descricao)
    {

       RecursoDao oRecursoDao = new RecursoDao();

       return oRecursoDao.buscar(descricao);
    }
}
