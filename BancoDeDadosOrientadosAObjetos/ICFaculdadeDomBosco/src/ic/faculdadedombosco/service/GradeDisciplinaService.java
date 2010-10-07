
package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.model.GradeDisciplina;


public class GradeDisciplinaService {

    public GradeDisciplina incluir(GradeDisciplina gradeDisciplina)
    {
       GradeDisciplinaDao gradeDisciplinaDao = new GradeDisciplinaDao();

       return gradeDisciplinaDao.incluir(gradeDisciplina);
    }

    public GradeDisciplina atualizar(GradeDisciplina gradeDisciplina)
    {
       GradeDisciplinaDao gradeDisciplinaDao = new GradeDisciplinaDao();

       return gradeDisciplinaDao.atualizar(gradeDisciplina);
    }

    public GradeDisciplina excluir(GradeDisciplina gradeDisciplina)
    {
       GradeDisciplinaDao gradeDisciplinaDao = new GradeDisciplinaDao();

       return gradeDisciplinaDao.excluir(gradeDisciplina);
    }

    public GradeDisciplina buscar(String curso)
    {
       GradeDisciplinaDao gradeDisciplinaDao = new GradeDisciplinaDao();

       return gradeDisciplinaDao.buscar(curso);
    }

}
