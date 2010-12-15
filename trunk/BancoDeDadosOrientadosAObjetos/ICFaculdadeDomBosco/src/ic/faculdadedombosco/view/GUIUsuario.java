package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.framework.LimitarTamanhoTexto;
import ic.faculdadedombosco.model.Usuario;
import ic.faculdadedombosco.service.UsuarioService;
import ic.faculdadedombosco.tables.UsuarioTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 * @author William
 */

public class GUIUsuario extends javax.swing.JInternalFrame {

    Usuario oUsuario;
    UsuarioService oUsuarioService;
    UsuarioDao oUsuarioDao;

    public GUIUsuario()
    {
        initComponents();
        tfnomeGerenciamento.setDocument(new LimitarTamanhoTexto(35));
        tfusuarioGerenciamento.setDocument(new LimitarTamanhoTexto(10));
        pfsenhaGerenciamento.setDocument(new LimitarTamanhoTexto(10));
        txtNomePesquisaUsuario.setDocument(new LimitarTamanhoTexto(35));
    }

    public void setPosicao()
    {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }

    private void limparCampos()
    {
        tfnomeGerenciamento.setText(null);
        tfusuarioGerenciamento.setText(null);
        pfsenhaGerenciamento.setText(null);
        cbadministradorGerenciamento.setSelectedItem("Selecione...");
        this.tabelaUsuario.setModel(new UsuarioTableModel(new ArrayList<Usuario>()));
    }

    private Usuario capturaDados()
    {
        oUsuario.setNome_usuario(tfnomeGerenciamento.getText());
        oUsuario.setUsuario_usuario(tfusuarioGerenciamento.getText());
        oUsuario.setSenha_usuario(pfsenhaGerenciamento.getText());
        oUsuario.setAdminstrador_usuario(cbadministradorGerenciamento.getSelectedItem().toString());
        return oUsuario;
    }

    private void carregarFormulario (Usuario usuario)
    {
        tfnomeGerenciamento.setText(usuario.getNome_usuario());
        tfusuarioGerenciamento.setText(usuario.getUsuario_usuario());
        pfsenhaGerenciamento.setText(usuario.getSenha_usuario());
        cbadministradorGerenciamento.setSelectedItem(usuario.getAdminstrador_usuario());
    }

    private void montarTabela( )
    {
        oUsuarioDao = new UsuarioDao();
        ObjectSet<Usuario> listUsuario = oUsuarioDao.montarTabelaUsuario();
        UsuarioTableModel usuarioTableModel = new UsuarioTableModel(listUsuario);
        this.tabelaUsuario.setModel(usuarioTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfnomeGerenciamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfusuarioGerenciamento = new javax.swing.JTextField();
        pfsenhaGerenciamento = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbadministradorGerenciamento = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        bLimparGerencUsuario = new javax.swing.JButton();
        bListarGerencUsuario = new javax.swing.JButton();
        bAtualizarGerencUsuario = new javax.swing.JButton();
        bExcluirGerencUsuario = new javax.swing.JButton();
        bSalvarGerencUsuario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNomePesquisaUsuario = new javax.swing.JTextField();
        bPesquisarGerencUsuario = new javax.swing.JButton();

        setClosable(true);
        setTitle("Usuário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuário:");

        tfusuarioGerenciamento.setToolTipText("Usuário com máximo de 10 dígitos");

        pfsenhaGerenciamento.setToolTipText("Senha com máximo de 10 dígitos");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Senha:");

        jLabel3.setText("Administrador:");

        cbadministradorGerenciamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfusuarioGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(tfnomeGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pfsenhaGerenciamento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbadministradorGerenciamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfnomeGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfusuarioGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfsenhaGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbadministradorGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bLimparGerencUsuario.setText("Limpar");
        bLimparGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparGerencUsuarioActionPerformed(evt);
            }
        });

        bListarGerencUsuario.setText("Listar");
        bListarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarGerencUsuarioActionPerformed(evt);
            }
        });

        bAtualizarGerencUsuario.setText("Atualizar");
        bAtualizarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarGerencUsuarioActionPerformed(evt);
            }
        });

        bExcluirGerencUsuario.setText("Excluir");
        bExcluirGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirGerencUsuarioActionPerformed(evt);
            }
        });

        bSalvarGerencUsuario.setText("Salvar");
        bSalvarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarGerencUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(bLimparGerencUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListarGerencUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAtualizarGerencUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluirGerencUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarGerencUsuario)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvarGerencUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluirGerencUsuario)
                    .addComponent(bAtualizarGerencUsuario)
                    .addComponent(bListarGerencUsuario)
                    .addComponent(bLimparGerencUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        jLabel5.setText("Nome:");

        bPesquisarGerencUsuario.setText("Pesquisar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePesquisaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisarGerencUsuario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomePesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisarGerencUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarGerencUsuarioActionPerformed
        montarTabela();
    }//GEN-LAST:event_bListarGerencUsuarioActionPerformed

    private void bAtualizarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarGerencUsuarioActionPerformed
       oUsuario = new Usuario();
       oUsuarioService = new UsuarioService();
       oUsuario = capturaDados();
       oUsuarioService.atualizar(oUsuario);
       montarTabela();
    }//GEN-LAST:event_bAtualizarGerencUsuarioActionPerformed

    private void bExcluirGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirGerencUsuarioActionPerformed
        oUsuario = new Usuario();
        oUsuarioService = new UsuarioService();
        oUsuario = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este usuário: " + oUsuario.getNome_usuario(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            oUsuarioService.excluir(oUsuario);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum usuário foi excluído...", "Excluir - Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirGerencUsuarioActionPerformed

    private void bSalvarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarGerencUsuarioActionPerformed
        oUsuario = new Usuario();
        oUsuarioService = new UsuarioService();
        oUsuario = capturaDados();
        oUsuarioService.incluir(oUsuario);
        montarTabela();
    }//GEN-LAST:event_bSalvarGerencUsuarioActionPerformed

    private void bLimparGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparGerencUsuarioActionPerformed
       limparCampos();
    }//GEN-LAST:event_bLimparGerencUsuarioActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        if (this.tabelaUsuario.getSelectedRow() != -1) {
            UsuarioTableModel usuarioTableModel = (UsuarioTableModel)this.tabelaUsuario.getModel();
            this.carregarFormulario(usuarioTableModel.getUsuarios().get(this.tabelaUsuario.getSelectedRow()));
        }
        this.tfnomeGerenciamento.requestFocus();
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarGerencUsuario;
    private javax.swing.JButton bExcluirGerencUsuario;
    private javax.swing.JButton bLimparGerencUsuario;
    private javax.swing.JButton bListarGerencUsuario;
    private javax.swing.JButton bPesquisarGerencUsuario;
    private javax.swing.JButton bSalvarGerencUsuario;
    private javax.swing.JComboBox cbadministradorGerenciamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pfsenhaGerenciamento;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField tfnomeGerenciamento;
    private javax.swing.JTextField tfusuarioGerenciamento;
    private javax.swing.JTextField txtNomePesquisaUsuario;
    // End of variables declaration//GEN-END:variables
}
