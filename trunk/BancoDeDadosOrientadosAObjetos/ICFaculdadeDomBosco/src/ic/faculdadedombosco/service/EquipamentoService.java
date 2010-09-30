package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;

/*
 * @author Anderson
 */
public class EquipamentoService {

    public Equipamento incluir(Equipamento equipamento)
    {

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.incluir(equipamento);
    }

    public Equipamento atualizar(Equipamento equipamento)
    {

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.atualizar(equipamento);
    }

    public Equipamento excluir(Equipamento equipamento)
    {

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.excluir(equipamento);
    }

    public Equipamento buscar(String codigo)
    {

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.buscar(codigo);
    }
}
