package ic.faculdadedombosco.model;

import java.io.Serializable;
import java.util.ArrayList;
import ic.faculdadedombosco.model.Equipamento;
import java.text.SimpleDateFormat;

/*
 * @author Anderson
 * @author William
 */
public class Agendamento implements Serializable{

    private int codigoAgendamento;
    private String statusAgendamento;
    private GradeDisciplina oGradeDisciplinaAgendamento;
    private Requisitante oRequisitanteAgendamento;
    private Recurso oRecursoAgendamento;
    private SimpleDateFormat dDataInicialAgendamento = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dDataFinalAgendamento = new SimpleDateFormat("dd/MM/yyyy");
    private String hHoraInicialAgendamento;
    private String hHoraFinalAgendamento;
    private String sObservacaoAgendamento;
    private ArrayList<Equipamento> listEquipamentoAgendamento = new ArrayList<Equipamento>();

    public int getCodigoAgendamento() {
        return codigoAgendamento;
    }

    public void setCodigoAgendamento(int codigoAgendamento) {
        this.codigoAgendamento = codigoAgendamento;
    }

    public SimpleDateFormat getdDataFinalAgendamento() {
        return dDataFinalAgendamento;
    }

    public void setdDataFinalAgendamento(SimpleDateFormat dDataFinalAgendamento) {
        this.dDataFinalAgendamento = dDataFinalAgendamento;
    }

    public SimpleDateFormat getdDataInicialAgendamento() {
        return dDataInicialAgendamento;
    }

    public void setdDataInicialAgendamento(SimpleDateFormat dDataInicialAgendamento) {
        this.dDataInicialAgendamento = dDataInicialAgendamento;
    }

    public String gethHoraFinalAgendamento() {
        return hHoraFinalAgendamento;
    }

    public void sethHoraFinalAgendamento(String hHoraFinalAgendamento) {
        this.hHoraFinalAgendamento = hHoraFinalAgendamento;
    }

    public String gethHoraInicialAgendamento() {
        return hHoraInicialAgendamento;
    }

    public void sethHoraInicialAgendamento(String hHoraInicialAgendamento) {
        this.hHoraInicialAgendamento = hHoraInicialAgendamento;
    }

    public GradeDisciplina getoGradeDisciplinaAgendamento() {
        return oGradeDisciplinaAgendamento;
    }

    public void setoGradeDisciplinaAgendamento(GradeDisciplina oGradeDisciplinaAgendamento) {
        this.oGradeDisciplinaAgendamento = oGradeDisciplinaAgendamento;
    }

    public Recurso getoRecursoAgendamento() {
        return oRecursoAgendamento;
    }

    public void setoRecursoAgendamento(Recurso oRecursoAgendamento) {
        this.oRecursoAgendamento = oRecursoAgendamento;
    }

    public Requisitante getoRequisitanteAgendamento() {
        return oRequisitanteAgendamento;
    }

    public void setoRequisitanteAgendamento(Requisitante oRequisitanteAgendamento) {
        this.oRequisitanteAgendamento = oRequisitanteAgendamento;
    }

    public String getsObservacaoAgendamento() {
        return sObservacaoAgendamento;
    }

    public void setsObservacaoAgendamento(String sObservacaoAgendamento) {
        this.sObservacaoAgendamento = sObservacaoAgendamento;
    }

    public String getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(String statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public ArrayList<Equipamento> getListEquipamentoAgendamento() {
        return listEquipamentoAgendamento;
    }

    public void setListEquipamentoAgendamento(ArrayList<Equipamento> listEquipamentoAgendamento) {
        this.listEquipamentoAgendamento = listEquipamentoAgendamento;
    }

    public void setEquipamentoItem(Equipamento oEquipamento) {
       this.listEquipamentoAgendamento.add(oEquipamento);
    }

}
