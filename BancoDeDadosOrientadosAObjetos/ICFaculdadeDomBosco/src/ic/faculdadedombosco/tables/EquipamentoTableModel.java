/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Equipamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class EquipamentoTableModel extends AbstractTableModel{

    private List<Equipamento> equipamentos;
    private String[] columnNames = {"Código", "Descrição"};

    public EquipamentoTableModel(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public int getRowCount() {
        return this.equipamentos.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }


    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Equipamento equipamento = this.getEquipamentos().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = equipamento.getCd_equipamento();
                break;
            case 1:
                value = equipamento.getDs_equipamento();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

}
