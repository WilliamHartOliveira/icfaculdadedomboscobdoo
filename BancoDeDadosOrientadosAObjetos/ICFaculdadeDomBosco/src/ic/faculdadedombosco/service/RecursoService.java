package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.model.Recurso;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class RecursoService {


    public Recurso incluir(Recurso oRecurso)
    {
        Recurso validaRecurso = new Recurso();
        RecursoDao oRecursoDao = new RecursoDao();

        validaRecurso = oRecursoDao.buscar(oRecurso.getDs_recurso());
        if(validaRecurso.getDs_recurso().equals(oRecurso.getDs_recurso())){
             JOptionPane.showMessageDialog(null, "Recurso "+oRecurso.getDs_recurso()+" já existe!", "Recurso", JOptionPane.WARNING_MESSAGE);
         }else{
             return oRecursoDao.incluir(oRecurso);
         }
         return oRecurso;
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
