package ic.faculdadedombosco.service;

import ic.faculdadedombosco.dao.AgendamentoDao;
import ic.faculdadedombosco.model.Agendamento;
import ic.faculdadedombosco.model.GradeDisciplina;
import java.text.SimpleDateFormat;

public class AgendamentoService {

    public Agendamento incluir(Agendamento oAgendamento){
        AgendamentoDao oAgendamentoDao = new AgendamentoDao();
        return oAgendamentoDao.incluir(oAgendamento);
    }

    public Agendamento atualizar(Agendamento oAgendamento){
        AgendamentoDao oAgendamentoDao = new AgendamentoDao();
        return oAgendamentoDao.atualizar(oAgendamento);
    }

    public Agendamento excluir(Agendamento oAgendamento){
        AgendamentoDao oAgendamentoDao = new AgendamentoDao();
        return oAgendamentoDao.excluir(oAgendamento);
    }

    public Agendamento buscar(SimpleDateFormat dataInicial, SimpleDateFormat dataFinal){
        AgendamentoDao oAgendamentoDao = new AgendamentoDao();
        return oAgendamentoDao.buscar(dataInicial, dataFinal);
    }
    
    public Agendamento buscarObjetoDisciplina(GradeDisciplina gradeDisciplina){
        AgendamentoDao oAgendamentoDao = new AgendamentoDao();
        return oAgendamentoDao.buscarObjetoDisciplina(gradeDisciplina);
    }
}
