/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class EquipamentoService {

    public Equipamento incluir(Equipamento equipamento){

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.incluir(equipamento);
    }

    public Equipamento atualizar(Equipamento equipamento){

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.atualizar(equipamento);
    }

    public Equipamento excluir(Equipamento equipamento){

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.excluir(equipamento);
    }

    public Equipamento buscar(Equipamento equipamento){

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.buscar(equipamento);
    }

    public List<Equipamento> listar(Equipamento equipamento){

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        return equipamentoDao.listar();
    }
}
