package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;

/*
 * @author Anderson
 */
public class EquipamentoService {

    public Equipamento incluir(Equipamento oEquipamento)
    {

        EquipamentoDao oEquipamentoDao = new EquipamentoDao();

        return oEquipamentoDao.incluir(oEquipamento);
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
