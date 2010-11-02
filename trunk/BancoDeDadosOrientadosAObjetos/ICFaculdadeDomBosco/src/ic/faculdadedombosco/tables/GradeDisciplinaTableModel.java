package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.GradeDisciplina;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class GradeDisciplinaTableModel  extends AbstractTableModel{

    private List<GradeDisciplina> gradeDisciplinas;
    private String[] columnNames = {"Disciplina", "Curso", "Recurso"};

    public GradeDisciplinaTableModel(List<GradeDisciplina> gradeDisciplinas) {
        this.gradeDisciplinas = gradeDisciplinas;
    }

    public int getRowCount() {
        return this.gradeDisciplinas.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }


    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        GradeDisciplina gradeDisciplina = this.getGradeDisciplinas().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = gradeDisciplina.getDisciplina_gradeDisciplina();
                break;
            case 1:
                value = gradeDisciplina.getCurso_gradeDisciplina();
                break;
            case 2:
                value = gradeDisciplina.getRecurso__gradeDisciplina().getDs_recurso();
                break;
            default:
                break;
        }

        return value;
    }

    public List<GradeDisciplina> getGradeDisciplinas() {
        return gradeDisciplinas;
    }

    public void setGradeDisciplinas(List<GradeDisciplina> gradeDisciplinas) {
        this.gradeDisciplinas = gradeDisciplinas;
    }
}