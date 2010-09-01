/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.model;

/**
 *
 * @author Anderson
 */
public class Recurso {

    private int cd_recurso;
    private String ds_recurso;
    private char id_tp_recurso;
    private int cd_usuario;

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

    public String getDs_recurso() {
        return ds_recurso;
    }

    public void setDs_recurso(String ds_recurso) {
        this.ds_recurso = ds_recurso;
    }

    public char getId_tp_recurso() {
        return id_tp_recurso;
    }

    public void setId_tp_recurso(char id_tp_recurso) {
        this.id_tp_recurso = id_tp_recurso;
    }
    
}
