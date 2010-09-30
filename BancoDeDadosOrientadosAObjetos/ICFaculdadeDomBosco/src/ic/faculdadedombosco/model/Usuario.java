package ic.faculdadedombosco.model;

/*
 * @author Anderson
 */
public class Usuario{

    private String nome_usuario;
    private String usuario_usuario;
    private String senha_usuario;
    private String adminstrador_usuario;

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getUsuario_usuario() {
        return usuario_usuario;
    }

    public void setUsuario_usuario(String usuario_usuario) {
        this.usuario_usuario = usuario_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getAdminstrador_usuario() {
        return adminstrador_usuario;
    }

    public void setAdminstrador_usuario(String adminstrador_usuario) {
        this.adminstrador_usuario = adminstrador_usuario;
    }

}
