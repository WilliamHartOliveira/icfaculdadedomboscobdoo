/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Requisitante;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class RequisitanteTableModel   extends AbstractTableModel{

    private List<Requisitante> requisitante;
    private String[] columnNames = {"Matrícula", "Nome", "Tipo"};

    public RequisitanteTableModel(List<Requisitante> requisitante) {
        this.requisitante= requisitante;
    }

    public int getRowCount() {
        return this.requisitante.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }


    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Requisitante requisitante = this.getRequisitante().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = requisitante.getRequisitante_matricula();
                break;
            case 1:
                value = requisitante.getRequisitante_nome();
                break;
            case 2:
                value = requisitante.getRequisitante_tipo();
                break;
            default:
                break;
        }
        return value;
    }

    public List<Requisitante> getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(List<Requisitante> requisitante) {
        this.requisitante = requisitante;
    }
}
