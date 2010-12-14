
package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Agendamento;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AgendamentoTableModel extends AbstractTableModel{

    private List<Agendamento> agendamentos;
    private String[] columnNames = {"Código","Data Inicial", "Hora Inicial", "Data Final", "Hora Final", "Recurso", "Usuário"};

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
                value = agendamento.getCodigoAgendamento();
                break;
            case 1:
                value = new SimpleDateFormat("dd/MM/yyyy").format(( agendamento.getdDataInicialAgendamento()));
                break;
            case 2:
                value = agendamento.gethHoraInicialAgendamento();
                break;
            case 3:
                value = new SimpleDateFormat("dd/MM/yyyy").format(( agendamento.getdDataFinalAgendamento()));
                break;
            case 4:
                value = agendamento.gethHoraFinalAgendamento();
                break;
            case 5:
                value = agendamento.getoRecursoAgendamento().getDs_recurso();
                break;
            case 6:
                value = agendamento.getoRequisitanteAgendamento().getRequisitante_nome().toString();
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