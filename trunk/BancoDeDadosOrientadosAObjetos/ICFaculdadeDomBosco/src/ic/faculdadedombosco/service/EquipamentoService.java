package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */
public class EquipamentoService {

    public Equipamento incluir(Equipamento oEquipamento)
    {

        Equipamento validaEquipamento = new Equipamento();
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();

        validaEquipamento = oEquipamentoDao.buscar(oEquipamento.getCdEquipamento());
        if(validaEquipamento.getCdEquipamento().equals(oEquipamento.getCdEquipamento())){
            JOptionPane.showMessageDialog(null, "Código Equipamento "+oEquipamento.getCdEquipamento()+" já existe!", "Equipamento", JOptionPane.WARNING_MESSAGE);
        }else{
            return oEquipamentoDao.incluir(oEquipamento);
        }

        return oEquipamento;
    }


    public Equipamento atualizar(Equipamento oEquipamento)
    {

        EquipamentoDao oEquipamentoDao = new EquipamentoDao();

        return oEquipamentoDao.atualizar(oEquipamento);
    }

    public Equipamento excluir(Equipamento oEquipamento)
    {

        EquipamentoDao oEquipamentoDao = new EquipamentoDao();

        return oEquipamentoDao.excluir(oEquipamento);
    }

    public Equipamento buscar(String codigo)
    {
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();

        return oEquipamentoDao.buscar(codigo);
    }
}
