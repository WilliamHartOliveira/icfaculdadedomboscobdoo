package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Requisitante;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class RequisitanteService {

    public Requisitante incluir(Requisitante oRequisitante)
    {
        Requisitante validaRequisitante = new Requisitante();
        Requisitante validaMatriculaRequisitante = new Requisitante();
        RequisitanteDao oRequisitanteDao = new RequisitanteDao();

        validaMatriculaRequisitante = oRequisitanteDao.buscarMatricula(oRequisitante.getRequisitante_matricula());
        validaRequisitante = oRequisitanteDao.buscar(oRequisitante.getRequisitante_nome());
        if(validaRequisitante.getRequisitante_nome().equals(oRequisitante.getRequisitante_nome())){
            JOptionPane.showMessageDialog(null, "Nome Requisitante "+oRequisitante.getRequisitante_nome()+" já existe!", "Requisitante", JOptionPane.WARNING_MESSAGE);
        }else if(validaMatriculaRequisitante.getRequisitante_matricula().equals(oRequisitante.getRequisitante_matricula())){
            JOptionPane.showMessageDialog(null, "Matrícula Requisitante "+oRequisitante.getRequisitante_matricula()+" já existe!", "Requisitante", JOptionPane.WARNING_MESSAGE);
        }
        else{
            return oRequisitanteDao.incluir(oRequisitante);
        }
        return oRequisitante;
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