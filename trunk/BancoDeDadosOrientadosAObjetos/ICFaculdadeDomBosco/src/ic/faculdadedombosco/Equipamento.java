/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco;

/**
 *
 * @author Anderson
 */
public class Equipamento {

    private int cd_equipamento;
    private String ds_equipamento;
    private int st_equipamento;
    private char in_cabo_rede;

    public int getSt_equipamento() {
        return st_equipamento;
    }

    public void setSt_equipamento(int st_equipamento) {
        this.st_equipamento = st_equipamento;
    }
    
    public int getCd_equipamento() {
        return cd_equipamento;
    }

    public void setCd_equipamento(int cd_equipamento) {
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
}
