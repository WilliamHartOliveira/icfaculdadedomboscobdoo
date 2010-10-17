package ic.faculdadedombosco.model;

import java.io.Serializable;
import java.util.Date;

/*
 * @author Anderson
 */
public class Agendamento implements Serializable{

    private GradeDisciplina disciplina_Agendamento;
    private Requisitante usuario_Agendamento;
    private Recurso recurso_Agendamento;
    private java.util.Date dataInicial_Agendamento;
    private java.util.Date dataFinal_Agendamento;
    private String horaInicial_Agendamento;
    private String horaFinal_Agendamento;
    private String observacao_Agendamento;

    public Date getDataFinal_Agendamento() {
        return dataFinal_Agendamento;
    }

    public void setDataFinal_Agendamento(Date dataFinal_Agendamento) {
        this.dataFinal_Agendamento = dataFinal_Agendamento;
    }

    public Date getDataInicial_Agendamento() {
        return dataInicial_Agendamento;
    }

    public void setDataInicial_Agendamento(Date dataInicial_Agendamento) {
        this.dataInicial_Agendamento = dataInicial_Agendamento;
    }

    public GradeDisciplina getDisciplina_Agendamento() {
        return disciplina_Agendamento;
    }

    public void setDisciplina_Agendamento(GradeDisciplina disciplina_Agendamento) {
        this.disciplina_Agendamento = disciplina_Agendamento;
    }

    public String getHoraFinal_Agendamento() {
        return horaFinal_Agendamento;
    }

    public void setHoraFinal_Agendamento(String horaFinal_Agendamento) {
        this.horaFinal_Agendamento = horaFinal_Agendamento;
    }

    public String getHoraInicial_Agendamento() {
        return horaInicial_Agendamento;
    }

    public void setHoraInicial_Agendamento(String horaInicial_Agendamento) {
        this.horaInicial_Agendamento = horaInicial_Agendamento;
    }

    public String getObservacao_Agendamento() {
        return observacao_Agendamento;
    }

    public void setObservacao_Agendamento(String observacao_Agendamento) {
        this.observacao_Agendamento = observacao_Agendamento;
    }

    public Recurso getRecurso_Agendamento() {
        return recurso_Agendamento;
    }

    public void setRecurso_Agendamento(Recurso recurso_Agendamento) {
        this.recurso_Agendamento = recurso_Agendamento;
    }

    public Requisitante getUsuario_Agendamento() {
        return usuario_Agendamento;
    }

    public void setUsuario_Agendamento(Requisitante usuario_Agendamento) {
        this.usuario_Agendamento = usuario_Agendamento;
    }

}
