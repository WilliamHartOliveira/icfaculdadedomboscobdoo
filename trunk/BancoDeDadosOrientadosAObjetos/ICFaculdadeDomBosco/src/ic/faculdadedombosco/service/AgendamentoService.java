package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.AgendamentoDao;
import ic.faculdadedombosco.model.Agendamento;

/*
 * @author Anderson
 */
public class AgendamentoService {

    public Agendamento incluir(Agendamento agendamento)
    {

        AgendamentoDao agendamentoDao = new AgendamentoDao();

        return agendamentoDao.incluir(agendamento);
    }

    public Agendamento atualizar(Agendamento agendamento)
    {

        AgendamentoDao agendamentoDao = new AgendamentoDao();

        return agendamentoDao.atualizar(agendamento);
    }

    public Agendamento excluir(Agendamento agendamento)
    {

        AgendamentoDao agendamentoDao = new AgendamentoDao();

        return agendamentoDao.excluir(agendamento);
    }

    public Agendamento buscar(String dataInicial, String dataFinal)
    {

        AgendamentoDao agendamentoDao = new AgendamentoDao();

        return agendamentoDao.buscar(dataInicial, dataFinal);
    }

}
