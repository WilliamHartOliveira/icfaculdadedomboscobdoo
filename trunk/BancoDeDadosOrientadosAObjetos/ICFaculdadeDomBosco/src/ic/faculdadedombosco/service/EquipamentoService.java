package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;
import javax.swing.JOptionPane;

public class EquipamentoService {

    public Equipamento incluir(Equipamento oEquipamento){
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();
        return oEquipamentoDao.incluir(oEquipamento);

        //William arranquei as regras de negócio... porque era ali que estava dando pau, temos que ver bem isso.
        //O erro é porque está retornando null quando ele vai fazer a busca no banco e dai estoura "Exception in thread "AWT-EventQueu-0" java.lang.NullPointerException"
        /*Equipamento validaEquipamento = new Equipamento();
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();
        validaEquipamento = oEquipamentoDao.buscar(oEquipamento.getCdEquipamento());
        if(validaEquipamento.getCdEquipamento().equals(oEquipamento.getCdEquipamento())){
            JOptionPane.showMessageDialog(null, "Código Equipamento "+oEquipamento.getCdEquipamento()+" já existe!", "Equipamento", JOptionPane.WARNING_MESSAGE);
        }else{
            return oEquipamentoDao.incluir(oEquipamento);
        }

        return oEquipamento;*/
    }

    public Equipamento atualizar(Equipamento oEquipamento){
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();
        return oEquipamentoDao.atualizar(oEquipamento);
    }

    public Equipamento excluir(Equipamento oEquipamento){
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();
        return oEquipamentoDao.excluir(oEquipamento);
    }

    public Equipamento buscar(String codigo){
        EquipamentoDao oEquipamentoDao = new EquipamentoDao();
        return oEquipamentoDao.buscar(codigo);
    }
}
