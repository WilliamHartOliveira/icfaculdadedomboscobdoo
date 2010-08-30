/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

import java.io.Serializable;

/**
 *
 * @author Anderson
 */
public class Equipamento implements Serializable {

    private int registro;
    private String cd_equipamento;
    private String ds_equipamento;
    private int st_equipamento;
    private char in_cabo_rede;

    public Equipamento(){

    }

    public Equipamento(int registro, String cd_equipamento, String ds_equipamento, int st_equipamento, char in_cabo_rede){
        this.registro = registro;
        this.cd_equipamento = cd_equipamento;
        this.ds_equipamento = ds_equipamento;
        this.st_equipamento = st_equipamento;
        this.in_cabo_rede = in_cabo_rede;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCd_equipamento() {
        return cd_equipamento;
    }

    public void setCd_equipamento(String cd_equipamento) {
        this.cd_equipamento = cd_equipamento;
    }

    public String getDs_equipamento() {
        return ds_equipamento;
    }

    public void setDs_equipamento(String ds_equipamento) {
        this.ds_equipamento = ds_equipamento;
    }

    public char getIn_cabo_rede() {
        return in_cabo_rede;
    }

    public void setIn_cabo_rede(char in_cabo_rede) {
        this.in_cabo_rede = in_cabo_rede;
    }

    public int getSt_equipamento() {
        return st_equipamento;
    }

    public void setSt_equipamento(int st_equipamento) {
        this.st_equipamento = st_equipamento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipamento other = (Equipamento) obj;
        if (this.registro != other.registro) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.registro;
    }



    @Override
    public String toString() {
        return registro+","+cd_equipamento+","+ds_equipamento+","+st_equipamento+","+in_cabo_rede;
    }
}
