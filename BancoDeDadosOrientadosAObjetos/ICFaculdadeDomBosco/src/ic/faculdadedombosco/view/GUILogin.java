package ic.faculdadedombosco.view;

import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Usuario;
import ic.faculdadedombosco.service.UsuarioService;
import javax.swing.JOptionPane;

/*
 * @author William
 * @author Anderson
 */
public class GUILogin extends javax.swing.JFrame {

    private String user;
    private String password;
    static GUILogin guilogin;

    Usuario usuario;
    UsuarioService usuarioService;
    UsuarioDao usuarioDao;

    public GUILogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        pLogindados = new javax.swing.JPanel();
        lUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        lSenha = new javax.swing.JLabel();
        bOk = new javax.swing.JButton();
        bTrocarSenha = new javax.swing.JButton();
        lImagemLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lSistemaGerRecursos = new javax.swing.JLabel();
        lBemVindo = new javax.swing.JLabel();
        lDomBosco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        pLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pLogindados.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUsuario.setText("Usuário:");

        tfUsuario.setText("admin");

        tfSenha.setText("admin");

        lSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lSenha.setText("Senha:");

        bOk.setText("Ok");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        bTrocarSenha.setText("Troca Senha");
        bTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTrocarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLogindadosLayout = new javax.swing.GroupLayout(pLogindados);
        pLogindados.setLayout(pLogindadosLayout);
        pLogindadosLayout.setHorizontalGroup(
            pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogindadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lUsuario)
                    .addComponent(lSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLogindadosLayout.createSequentialGroup()
                        .addComponent(bOk, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bTrocarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(tfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap())
        );
        pLogindadosLayout.setVerticalGroup(
            pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogindadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOk)
                    .addComponent(bTrocarSenha))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        lImagemLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/login.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lSistemaGerRecursos.setFont(new java.awt.Font("Tahoma", 0, 12));
        lSistemaGerRecursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSistemaGerRecursos.setText("Sistema de Gerenciamento de Resursos");

        lBemVindo.setFont(new java.awt.Font("Tahoma", 1, 14));
        lBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBemVindo.setText("Seja bem-vindo!");

        lDomBosco.setFont(new java.awt.Font("Tahoma", 0, 12));
        lDomBosco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDomBosco.setText("Faculdade Dom Bosco de Porto Alegre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addComponent(lSistemaGerRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addComponent(lDomBosco, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSistemaGerRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDomBosco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lImagemLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pLogindados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImagemLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pLogindados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed

        usuario = new Usuario();
        usuarioDao = new UsuarioDao();
        usuarioService = new UsuarioService();

        user = new String (tfUsuario.getText());
        password = new String(tfSenha.getPassword());

        //usuarioService.buscar(user, user);
        //user.equals("admin") && password.equals("admin")
        if(user.equals("admin") && password.equals("admin")){
            GUIPrincipal guiPrincipal = new GUIPrincipal();//cria uma instância de GUIPrincipal
            guiPrincipal.setLocationRelativeTo(null);//posicionam essa instância no centro do desktop
            guiPrincipal.setVisible(true);//exibem a instância
            this.setVisible(false);
        }else{
            System.out.println(user);
            System.out.println(password);
            JOptionPane.showMessageDialog(null, "O usuário ou a senha estão incorretos. Tente novamente.", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
            tfUsuario.setText(null);
            tfSenha.setText(null);
            tfUsuario.requestFocus();
        }

    }//GEN-LAST:event_bOkActionPerformed

    private void bTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTrocarSenhaActionPerformed
         JOptionPane.showMessageDialog(null, "Módulo em construção...", "Atenção!!!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bTrocarSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JButton bTrocarSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBemVindo;
    private javax.swing.JLabel lDomBosco;
    private javax.swing.JLabel lImagemLogin;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lSistemaGerRecursos;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pLogindados;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

}
