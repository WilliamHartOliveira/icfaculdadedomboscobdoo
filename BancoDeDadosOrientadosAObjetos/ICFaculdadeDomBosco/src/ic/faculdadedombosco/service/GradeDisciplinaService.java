
package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.model.GradeDisciplina;
import javax.swing.JOptionPane;


public class GradeDisciplinaService {

    public GradeDisciplina incluir(GradeDisciplina oGradeDisciplina)
    {
       GradeDisciplina validaGradeDisciplina = new GradeDisciplina();
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       validaGradeDisciplina = oGradeDisciplinaDao.buscar(oGradeDisciplina.getDisciplina_gradeDisciplina());
       if(validaGradeDisciplina.getDisciplina_gradeDisciplina().equals(oGradeDisciplina.getDisciplina_gradeDisciplina())){
            JOptionPane.showMessageDialog(null, "Disciplina "+oGradeDisciplina.getDisciplina_gradeDisciplina()+" já existe!", "Grade Disciplina", JOptionPane.WARNING_MESSAGE);
        }else{
            return oGradeDisciplinaDao.incluir(oGradeDisciplina);
        }
        return oGradeDisciplina;
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

    public GradeDisciplina buscar(String disciplina)
    {
       GradeDisciplinaDao oGradeDisciplinaDao = new GradeDisciplinaDao();

       return oGradeDisciplinaDao.buscar(disciplina);
    }

}
