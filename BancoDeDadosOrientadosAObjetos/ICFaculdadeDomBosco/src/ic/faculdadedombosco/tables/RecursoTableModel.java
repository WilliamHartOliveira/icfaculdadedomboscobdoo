package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Recurso;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class RecursoTableModel extends AbstractTableModel{

    private List<Recurso> recursos;
    private String[] columnNames = {"Descrição", "Tipo", "Localização"};

    public RecursoTableModel(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public int getRowCount() {
        return this.recursos.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }


    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Recurso recurso = this.getRecursos().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = recurso.getDs_recurso();
                break;
            case 1:
                value = recurso.getTp_recurso();
                break;
            case 2:
                value = recurso.getLc_recurso();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
}
