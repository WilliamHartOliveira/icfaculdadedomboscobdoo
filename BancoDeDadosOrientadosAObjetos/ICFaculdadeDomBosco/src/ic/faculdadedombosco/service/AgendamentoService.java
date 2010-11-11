package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.AgendamentoDao;
import ic.faculdadedombosco.model.Agendamento;
import ic.faculdadedombosco.model.GradeDisciplina;

/*
 * @author Anderson
 */
public class AgendamentoService {

    public Agendamento incluir(Agendamento oAgendamento)
    {

        AgendamentoDao oAgendamentoDao = new AgendamentoDao();

        return oAgendamentoDao.incluir(oAgendamento);
    }

    public Agendamento atualizar(Agendamento oAgendamento)
    {

        AgendamentoDao oAgendamentoDao = new AgendamentoDao();

        return oAgendamentoDao.atualizar(oAgendamento);
    }

    public Agendamento excluir(Agendamento oAgendamento)
    {

        AgendamentoDao oAgendamentoDao = new AgendamentoDao();

        return oAgendamentoDao.excluir(oAgendamento);
    }

    public Agendamento buscar(String dataInicial, String dataFinal)
    {

        AgendamentoDao oAgendamentoDao = new AgendamentoDao();

        return oAgendamentoDao.buscar(dataInicial, dataFinal);
    }

    public Agendamento buscarObjetoDisciplina(GradeDisciplina gradeDisciplina)
    {

        AgendamentoDao oAgendamentoDao = new AgendamentoDao();

        return oAgendamentoDao.buscarObjetoDisciplina(gradeDisciplina);
    }

}
