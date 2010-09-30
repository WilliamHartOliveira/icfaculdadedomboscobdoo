package ic.faculdadedombosco.model;

import java.io.Serializable;

/*
 * @author Anderson
 */
public class Recurso implements Serializable{

    private String ds_recurso;
    private String tp_recurso;
    private String st_usuario;
    private String lc_recurso;
    private String qt_ocupante;


    public String getDs_recurso() {
        return ds_recurso;
    }

    public void setDs_recurso(String ds_recurso) {
        this.ds_recurso = ds_recurso;
    }

    public String getSt_usuario() {
        return st_usuario;
    }

    public void setSt_usuario(String st_usuario) {
        this.st_usuario = st_usuario;
    }

    public String getTp_recurso() {
        return tp_recurso;
    }

    public void setTp_recurso(String tp_recurso) {
        this.tp_recurso = tp_recurso;
    }

    public String getLc_recurso() {
        return lc_recurso;
    }

    public void setLc_recurso(String lc_recurso) {
        this.lc_recurso = lc_recurso;
    }

    public String getQt_ocupante() {
        return qt_ocupante;
    }

    public void setQt_ocupante(String qt_ocupante) {
        this.qt_ocupante = qt_ocupante;
    }

}
