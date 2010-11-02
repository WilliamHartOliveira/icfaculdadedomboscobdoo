package ic.faculdadedombosco.tables;

import ic.faculdadedombosco.model.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anderson
 */
public class UsuarioTableModel extends AbstractTableModel{

    private List<Usuario> usuarios;
    private String[] columnNames = {"Nome", "Usuário", "Administrador"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getRowCount() {
        return this.usuarios.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Usuario usuario = this.getUsuarios().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = usuario.getNome_usuario();
                break;
            case 1:
                value = usuario.getUsuario_usuario();
                break;
            case 2:
                value = usuario.getAdminstrador_usuario();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
