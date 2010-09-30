package ic.faculdadedombosco.model;

/*
 * @author Anderson
 */
public class Equipamento{

    private String cd_equipamento;
    private String ds_equipamento;
    private String st_equipamento;
    private String in_cabo_rede;

    public Equipamento(){

    }

    public Equipamento(String cd_equipamento, String ds_equipamento, String st_equipamento, String in_cabo_rede){
        this.cd_equipamento = cd_equipamento;
        this.ds_equipamento = ds_equipamento;
        this.st_equipamento = st_equipamento;
        this.in_cabo_rede = in_cabo_rede;
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

    public String getIn_cabo_rede() {
        return in_cabo_rede;
    }

    public void setIn_cabo_rede(String in_cabo_rede) {
        this.in_cabo_rede = in_cabo_rede;
    }

    public String getSt_equipamento() {
        return st_equipamento;
    }

    public void setSt_equipamento(String st_equipamento) {
        this.st_equipamento = st_equipamento;
    }   
}
