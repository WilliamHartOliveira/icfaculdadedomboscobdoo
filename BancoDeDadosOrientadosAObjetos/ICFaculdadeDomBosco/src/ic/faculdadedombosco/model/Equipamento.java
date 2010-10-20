package ic.faculdadedombosco.model;

/*
 * @author Anderson
 */
public class Equipamento{

    private String cdEquipamento;
    private String dsEquipamento;
    private String stEquipamento;
    private String inCaboRede;

    public Equipamento(){

    }

    public Equipamento(String cdEquipamento, String dsEquipamento, String stEquipamento, String inCaboRede) {
        this.cdEquipamento = cdEquipamento;
        this.dsEquipamento = dsEquipamento;
        this.stEquipamento = stEquipamento;
        this.inCaboRede = inCaboRede;
    }

    public String getCdEquipamento() {
        return cdEquipamento;
    }

    public void setCdEquipamento(String cdEquipamento) {
        this.cdEquipamento = cdEquipamento;
    }

    public String getDsEquipamento() {
        return dsEquipamento;
    }

    public void setDsEquipamento(String dsEquipamento) {
        this.dsEquipamento = dsEquipamento;
    }

    public String getInCaboRede() {
        return inCaboRede;
    }

    public void setInCaboRede(String inCaboRede) {
        this.inCaboRede = inCaboRede;
    }

    public String getStEquipamento() {
        return stEquipamento;
    }

    public void setStEquipamento(String stEquipamento) {
        this.stEquipamento = stEquipamento;
    }
    
}
