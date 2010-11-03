package ic.faculdadedombosco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/*
 * @author Anderson
 * @author William
 */
public class Agendamento implements Serializable{

    private GradeDisciplina oGradeDisciplina;
    private Requisitante oRequisitante;
    private Recurso oRecurso;
    private java.util.Date dDataInicial;
    private java.util.Date dDataFinal;
    private String hHoraInicial;
    private String hHoraFinal;
    private String sObservacao;
    private ArrayList<String> listaEquipamentosAntesAgendamento = new ArrayList<String>();
    private ArrayList<String> listaEquipamentosDepoisAgendamento = new ArrayList<String>();

    public Date getDataFinal() {
        return dDataFinal;
    }

    public void setDataFinal(Date dDataFinal) {
        this.dDataFinal = dDataFinal;
    }

    public Date getDataInicial() {
        return dDataInicial;
    }

    public void setDataInicial(Date dDataInicial) {
        this.dDataInicial = dDataInicial;
    }

    public GradeDisciplina getDisciplina() {
        return oGradeDisciplina;
    }

    public void setDisciplina(GradeDisciplina oGradeDisciplina) {
        this.oGradeDisciplina = oGradeDisciplina;
    }

    public String getHoraFinal() {
        return hHoraFinal;
    }

    public void setHoraFinal(String hHoraFinal) {
        this.hHoraFinal = hHoraFinal;
    }

    public String getHoraInicial() {
        return hHoraInicial;
    }

    public void setHoraInicial(String hHoraInicial) {
        this.hHoraInicial = hHoraInicial;
    }

    public String getObservacao() {
        return sObservacao;
    }

    public void setObservacao(String sObservacao) {
        this.sObservacao = sObservacao;
    }

    public Recurso getRecurso() {
        return oRecurso;
    }

    public void setRecurso(Recurso oRecurso) {
        this.oRecurso = oRecurso;
    }

    public Requisitante getUsuario() {
        return oRequisitante;
    }

    public void setUsuario(Requisitante oRequisitante) {
        this.oRequisitante = oRequisitante;
    }

    public ArrayList<String> getListaEquipamentosAntesAgendamento() {
        return listaEquipamentosAntesAgendamento;
    }

    public void setListaEquipamentosAntesAgendamento(ArrayList<String> listaEquipamentosAntesAgendamento) {
        this.listaEquipamentosAntesAgendamento = listaEquipamentosAntesAgendamento;
    }

    public ArrayList<String> getListaEquipamentosDepoisAgendamento() {
        return listaEquipamentosDepoisAgendamento;
    }

    public void setListaEquipamentosDepoisAgendamento(ArrayList<String> listaEquipamentosDepoisAgendamento) {
        this.listaEquipamentosDepoisAgendamento = listaEquipamentosDepoisAgendamento;
    }
}
