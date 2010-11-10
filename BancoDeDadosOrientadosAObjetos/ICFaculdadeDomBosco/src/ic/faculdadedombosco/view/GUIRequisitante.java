package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.RequisitanteService;
import ic.faculdadedombosco.tables.RequisitanteTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class GUIRequisitante extends javax.swing.JInternalFrame {

    Requisitante requisitante;
    RequisitanteService requisitanteService;
    RequisitanteDao requisitanteDao;
    
    public GUIRequisitante() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/3, (d.height - this.getSize().height)/3);
    }

    private void limparCampos()
    {
        tfMatriculaRequisitante.setText(null);
        cbStatusRequisitante.setSelectedItem("Selecione...");
        tfNomeRequisitante.setText(null);
        cbTipoRequisitante.setSelectedItem("Selecione...");
        tfTelefoneRequisitante.setText(null);
        tfNomePesqRequisitante.setText(null);
         this.tabelaRequisitante.setModel(new RequisitanteTableModel(new ArrayList<Requisitante>()));
    }

    private Requisitante capturaDados()
    {
        requisitante.setRequisitante_matricula(tfMatriculaRequisitante.getText());
        requisitante.setRequisitante_status(cbStatusRequisitante.getSelectedItem().toString());
        requisitante.setRequisitante_nome(tfNomeRequisitante.getText());
        requisitante.setRequisitante_tipo(cbTipoRequisitante.getSelectedItem().toString());
        requisitante.setRequisitante_telefone(tfTelefoneRequisitante.getText());
        return requisitante;
    }

    private void carregarFormulario (Requisitante requisitante) {
        tfMatriculaRequisitante.setText(String.valueOf(requisitante.getRequisitante_matricula()));
        cbStatusRequisitante.setSelectedItem(requisitante.getRequisitante_status());
        tfNomeRequisitante.setText(requisitante.getRequisitante_nome());
        cbTipoRequisitante.setSelectedItem(requisitante.getRequisitante_tipo());
        tfTelefoneRequisitante.setText(requisitante.getRequisitante_telefone());
    }

    private void montarTabela( )
    {
        requisitanteDao = new RequisitanteDao();

        ObjectSet<Requisitante> listRequisitante = requisitanteDao.montarTabelaRequisitante();

        RequisitanteTableModel requisitanteTableModel = new RequisitanteTableModel(listRequisitante);
        this.tabelaRequisitante.setModel(requisitanteTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNomeRequisitante = new javax.swing.JTextField();
        bExcluirRequisitante = new javax.swing.JButton();
        bSalvarRequisitante = new javax.swing.JButton();
        cbTipoRequisitante = new javax.swing.JComboBox();
        cbStatusRequisitante = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        tfTelefoneRequisitante = new javax.swing.JFormattedTextField();
        bLimparRequisitante = new javax.swing.JButton();
        bListarRequisitante = new javax.swing.JButton();
        bAtualizarRequisitante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRequisitante = new javax.swing.JTable();
        bPesquisarRequisitante = new javax.swing.JButton();
        tfNomePesqRequisitante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMatriculaRequisitante = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Requisitante");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Requisitante"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Matrícula:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Status:");

        bExcluirRequisitante.setText("Excluir");
        bExcluirRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirRequisitanteActionPerformed(evt);
            }
        });

        bSalvarRequisitante.setText("Salvar");
        bSalvarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarRequisitanteActionPerformed(evt);
            }
        });

        cbTipoRequisitante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Funcionário(a)", "Professor(a)", "Aluno(a)" }));

        cbStatusRequisitante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo" }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone:");

        try {
            tfTelefoneRequisitante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bLimparRequisitante.setText("Limpar");
        bLimparRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparRequisitanteActionPerformed(evt);
            }
        });

        bListarRequisitante.setText("Listar");
        bListarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarRequisitanteActionPerformed(evt);
            }
        });

        bAtualizarRequisitante.setText("Atualizar");
        bAtualizarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarRequisitanteActionPerformed(evt);
            }
        });

        tabelaRequisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaRequisitante.getTableHeader().setReorderingAllowed(false);
        tabelaRequisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRequisitanteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRequisitante);

        bPesquisarRequisitante.setText("Pesquisar");
        bPesquisarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarRequisitanteActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome:");

        try {
            tfMatriculaRequisitante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTipoRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTelefoneRequisitante))
                                    .addComponent(tfNomeRequisitante, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfMatriculaRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbStatusRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bLimparRequisitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bListarRequisitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bAtualizarRequisitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bExcluirRequisitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bSalvarRequisitante))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNomePesqRequisitante, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addGap(34, 34, 34)
                                        .addComponent(bPesquisarRequisitante)))
                                .addGap(25, 25, 25)))
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatusRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(tfMatriculaRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipoRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfTelefoneRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLimparRequisitante)
                    .addComponent(bListarRequisitante)
                    .addComponent(bAtualizarRequisitante)
                    .addComponent(bExcluirRequisitante)
                    .addComponent(bSalvarRequisitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomePesqRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bPesquisarRequisitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalvarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarRequisitanteActionPerformed
        requisitante = new Requisitante();
        requisitanteService = new RequisitanteService();

        requisitante = capturaDados();
        requisitanteService.incluir(requisitante);
        montarTabela();
        limparCampos();
    }//GEN-LAST:event_bSalvarRequisitanteActionPerformed

    private void bExcluirRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirRequisitanteActionPerformed
        requisitante = new Requisitante();
        requisitanteService = new RequisitanteService();

        requisitante = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este requisitante: " + requisitante.getRequisitante_nome(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            requisitanteService.excluir(requisitante);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum requisitante foi excluído...", "Excluir - Requisitante", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirRequisitanteActionPerformed

    private void bAtualizarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarRequisitanteActionPerformed

       requisitante = new Requisitante();
       requisitanteService = new RequisitanteService();

       requisitante = capturaDados();
       requisitanteService.atualizar(requisitante);
       montarTabela();
    }//GEN-LAST:event_bAtualizarRequisitanteActionPerformed

    private void bListarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarRequisitanteActionPerformed
        montarTabela();
    }//GEN-LAST:event_bListarRequisitanteActionPerformed

    private void bLimparRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparRequisitanteActionPerformed
        limparCampos();
    }//GEN-LAST:event_bLimparRequisitanteActionPerformed

    private void tabelaRequisitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRequisitanteMouseClicked
         if (this.tabelaRequisitante.getSelectedRow() != -1) {
            RequisitanteTableModel requisitanteTableModel = (RequisitanteTableModel)this.tabelaRequisitante.getModel();
            this.carregarFormulario(requisitanteTableModel.getRequisitante().get(this.tabelaRequisitante.getSelectedRow()));
        }
        this.tfNomeRequisitante.requestFocus();
    }//GEN-LAST:event_tabelaRequisitanteMouseClicked

    private void bPesquisarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarRequisitanteActionPerformed
        requisitante = new Requisitante();
        requisitanteService = new RequisitanteService();

        requisitante = requisitanteService.buscar(tfNomePesqRequisitante.getText());

        if(requisitante != null){
            JOptionPane.showMessageDialog(null, "Requisitante encontrado", "Pesquisa Requisitante", JOptionPane.INFORMATION_MESSAGE);
            tfMatriculaRequisitante.setText(""+requisitante.getRequisitante_matricula());
            cbStatusRequisitante.setSelectedItem(""+requisitante.getRequisitante_status());
            tfNomeRequisitante.setText(""+requisitante.getRequisitante_nome());
            cbTipoRequisitante.setSelectedItem(""+requisitante.getRequisitante_telefone());
            tfTelefoneRequisitante.setText(""+requisitante.getRequisitante_telefone());
        }else{
             JOptionPane.showMessageDialog(null, "Requisitante não encontrado", "Pesquisa Requisitante", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarRequisitanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarRequisitante;
    private javax.swing.JButton bExcluirRequisitante;
    private javax.swing.JButton bLimparRequisitante;
    private javax.swing.JButton bListarRequisitante;
    private javax.swing.JButton bPesquisarRequisitante;
    private javax.swing.JButton bSalvarRequisitante;
    private javax.swing.JComboBox cbStatusRequisitante;
    private javax.swing.JComboBox cbTipoRequisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRequisitante;
    private javax.swing.JFormattedTextField tfMatriculaRequisitante;
    private javax.swing.JTextField tfNomePesqRequisitante;
    private javax.swing.JTextField tfNomeRequisitante;
    private javax.swing.JFormattedTextField tfTelefoneRequisitante;
    // End of variables declaration//GEN-END:variables

}
