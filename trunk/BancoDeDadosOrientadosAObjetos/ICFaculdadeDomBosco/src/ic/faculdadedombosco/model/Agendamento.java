/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.model;

import java.util.Date;

/**
 *
 * @author Anderson
 */
public class Agendamento {

    private int cd_agendamento;
    private java.util.Date hr_inicial;
    private java.util.Date hr_final;
    private int cd_usuario;
    private int cd_recurso;

    public int getCd_agendamento() {
        return cd_agendamento;
    }

    public void setCd_agendamento(int cd_agendamento) {
        this.cd_agendamento = cd_agendamento;
    }

    public int getCd_recurso() {
        return cd_recurso;
    }

    public void setCd_recurso(int cd_recurso) {
        this.cd_recurso = cd_recurso;
    }

    public int getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public Date getHr_final() {
        return hr_final;
    }

    public void setHr_final(Date hr_final) {
        this.hr_final = hr_final;
    }

    public Date getHr_inicial() {
        return hr_inicial;
    }

    public void setHr_inicial(Date hr_inicial) {
        this.hr_inicial = hr_inicial;
    }
    
}
