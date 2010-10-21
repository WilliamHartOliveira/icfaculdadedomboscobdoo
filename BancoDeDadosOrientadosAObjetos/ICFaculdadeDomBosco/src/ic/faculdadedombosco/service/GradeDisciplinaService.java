
package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.model.GradeDisciplina;


public class GradeDisciplinaService {

    public GradeDisciplina incluir(GradeDisciplina oGradeDisciplina)
    {
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       return oGradeDisciplinaDao.incluir(oGradeDisciplina);
    }

    public GradeDisciplina atualizar(GradeDisciplina oGradeDisciplina)
    {
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       return oGradeDisciplinaDao.atualizar(oGradeDisciplina);
    }

    public GradeDisciplina excluir(GradeDisciplina oGradeDisciplina)
    {
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       return oGradeDisciplinaDao.excluir(oGradeDisciplina);
    }

    public GradeDisciplina buscar(String curso)
    {
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       return oGradeDisciplinaDao.buscar(curso);
    }

}
