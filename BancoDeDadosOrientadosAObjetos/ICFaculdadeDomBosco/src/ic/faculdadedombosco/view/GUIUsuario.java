/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIUsuario.java
 *
 * Created on 20/09/2010, 16:07:48
 */

package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Usuario;
import ic.faculdadedombosco.service.UsuarioService;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class GUIUsuario extends javax.swing.JInternalFrame {

    Usuario usuario;
    UsuarioService usuarioService;
    UsuarioDao usuarioDao;


    /** Creates new form GUIUsuario */
    public GUIUsuario() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }


    private void limparCampos()
    {
        tfnomeGerenciamento.setText(null);
        tfusuarioGerenciamento.setText(null);
        pfsenhaGerenciamento.setText(null);
        cbadministradorGerenciamento.setSelectedItem("Selecione...");
    }//Método responsável para limpar campos do frame

    private Usuario capturaDados()
    {
        usuario.setNome_usuario(tfnomeGerenciamento.getText());
        usuario.setUsuario_usuario(tfusuarioGerenciamento.getText());
        usuario.setSenha_usuario(pfsenhaGerenciamento.getText());
        usuario.setAdminstrador_usuario(cbadministradorGerenciamento.getSelectedItem().toString());

        return usuario;
    }//Método responsável para capturar dadas do frame

    private void montarTabela( )
    {

        usuarioDao = new UsuarioDao();

        ObjectSet<Usuario> listaatual = usuarioDao.montarTabelaEquip();
        String [][] tabela = new String[listaatual.size()][4];

        for(int i = 0; i < listaatual.size(); i++){
            tabela[i][0] = String.valueOf(listaatual.get(i).getNome_usuario());
            tabela[i][1] = listaatual.get(i).getUsuario_usuario();
            tabela[i][2] = listaatual.get(i).getSenha_usuario();
            tabela[i][3] = listaatual.get(i).getAdminstrador_usuario();
        }

        this.tabelaUsuario.setModel(
            new DefaultTableModel(
                tabela,
                new String[] {"Nome", "Usuário", "Senha", "Administrador"}
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });

    }//Método responsável para montar tabela

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfusuarioGerenciamento = new javax.swing.JTextField();
        pfsenhaGerenciamento = new javax.swing.JPasswordField();
        bSalvarGerencUsuario = new javax.swing.JButton();
        bExcluirGerencUsuario = new javax.swing.JButton();
        bAtualizarGerencUsuario = new javax.swing.JButton();
        bListarGerencUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbadministradorGerenciamento = new javax.swing.JComboBox();
        bLimparGerencUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfnomeGerenciamento = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Gerenciamento de Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuário:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Senha:");

        bSalvarGerencUsuario.setText("Salvar");
        bSalvarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarGerencUsuarioActionPerformed(evt);
            }
        });

        bExcluirGerencUsuario.setText("Excluir");
        bExcluirGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirGerencUsuarioActionPerformed(evt);
            }
        });

        bAtualizarGerencUsuario.setText("Atualizar");
        bAtualizarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarGerencUsuarioActionPerformed(evt);
            }
        });

        bListarGerencUsuario.setText("Listar");
        bListarGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarGerencUsuarioActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Usuário", "Senha", "Administrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        jLabel3.setText("Administrador:");

        cbadministradorGerenciamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));

        bLimparGerencUsuario.setText("Limpar");
        bLimparGerencUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparGerencUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnomeGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(tfusuarioGerenciamento)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pfsenhaGerenciamento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbadministradorGerenciamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bLimparGerencUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bListarGerencUsuario)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAtualizarGerencUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExcluirGerencUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSalvarGerencUsuario)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfnomeGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfusuarioGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfsenhaGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbadministradorGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvarGerencUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluirGerencUsuario)
                    .addComponent(bAtualizarGerencUsuario)
                    .addComponent(bListarGerencUsuario)
                    .addComponent(bLimparGerencUsuario))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarGerencUsuarioActionPerformed
        montarTabela();
    }//GEN-LAST:event_bListarGerencUsuarioActionPerformed

    private void bAtualizarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarGerencUsuarioActionPerformed
       usuario = new Usuario();
       usuarioService = new UsuarioService();

       usuario = capturaDados();
       usuarioService.atualizar(usuario);
       montarTabela();
    }//GEN-LAST:event_bAtualizarGerencUsuarioActionPerformed

    private void bExcluirGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirGerencUsuarioActionPerformed
        usuario = new Usuario();
        usuarioService = new UsuarioService();

        usuario = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este usuário: " + usuario.getNome_usuario(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            usuarioService.excluir(usuario);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum usuário foi excluído...", "Excluir - Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirGerencUsuarioActionPerformed

    private void bSalvarGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarGerencUsuarioActionPerformed
        usuario = new Usuario();
        usuarioService = new UsuarioService();

        usuario = capturaDados();
        usuarioService.incluir(usuario);
        montarTabela();
    }//GEN-LAST:event_bSalvarGerencUsuarioActionPerformed

    private void bLimparGerencUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparGerencUsuarioActionPerformed
       limparCampos();
    }//GEN-LAST:event_bLimparGerencUsuarioActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked

        this.tfnomeGerenciamento.setText(String.valueOf(
                this.tabelaUsuario.getModel().getValueAt(this.tabelaUsuario.getSelectedRow(), 0)));
        this.tfusuarioGerenciamento.setText(String.valueOf(
                this.tabelaUsuario.getModel().getValueAt(this.tabelaUsuario.getSelectedRow(), 1)));
        this.pfsenhaGerenciamento.setText(String.valueOf(
                this.tabelaUsuario.getModel().getValueAt(this.tabelaUsuario.getSelectedRow(), 2)));
        this.cbadministradorGerenciamento.setSelectedItem(String.valueOf(
                this.tabelaUsuario.getModel().getValueAt(this.tabelaUsuario.getSelectedRow(), 3)));

        this.tfusuarioGerenciamento.requestFocus();
    }//GEN-LAST:event_tabelaUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarGerencUsuario;
    private javax.swing.JButton bExcluirGerencUsuario;
    private javax.swing.JButton bLimparGerencUsuario;
    private javax.swing.JButton bListarGerencUsuario;
    private javax.swing.JButton bSalvarGerencUsuario;
    private javax.swing.JComboBox cbadministradorGerenciamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pfsenhaGerenciamento;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField tfnomeGerenciamento;
    private javax.swing.JTextField tfusuarioGerenciamento;
    // End of variables declaration//GEN-END:variables

}
