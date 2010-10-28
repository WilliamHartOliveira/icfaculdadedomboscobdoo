
package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Agendamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class AgendamentoTableModel extends AbstractTableModel{

    private List<Agendamento> agendamentos;
    private String[] columnNames = {"Data", "Horário", "Disciplina", "Usuário"};

    public AgendamentoTableModel(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public int getRowCount() {
        return this.agendamentos.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }


    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Agendamento agendamento = this.getAgendamentos().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = agendamento.getDataInicial();
                break;
            case 1:
                value = agendamento.getHoraInicial();
                break;
            case 2:
                value = agendamento.getDisciplina();
                break;
            case 3:
                value = agendamento.getUsuario();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

}
