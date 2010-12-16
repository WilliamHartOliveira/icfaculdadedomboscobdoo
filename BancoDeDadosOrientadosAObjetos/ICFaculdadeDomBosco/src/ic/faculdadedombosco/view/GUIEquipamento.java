
package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.framework.LimitarTamanhoTexto;
import ic.faculdadedombosco.model.Equipamento;
import ic.faculdadedombosco.service.EquipamentoService;
import ic.faculdadedombosco.tables.EquipamentoTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIEquipamento extends javax.swing.JInternalFrame {

    Equipamento equipamento;
    EquipamentoService equipamentoService;
    EquipamentoDao equipamentoDao;

    public GUIEquipamento() {
        initComponents();
        tfCodigoEquipamento.setDocument(new LimitarTamanhoTexto(7));
        tfDescricaoEquipamento.setDocument(new LimitarTamanhoTexto(50));
        tfPesquisaCodigoEquipamento.setDocument(new LimitarTamanhoTexto(7));
    }

     public void setPosicao()
     {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEquipamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisaCodigoEquipamento = new javax.swing.JTextField();
        bPesquisarEquipamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bSalvarEquipamento = new javax.swing.JButton();
        bExcluirEquipamento = new javax.swing.JButton();
        bAtualizarEquipamento = new javax.swing.JButton();
        bListarEquipamento = new javax.swing.JButton();
        bLimparEquipamento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfCodigoEquipamento = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        lDescricao = new javax.swing.JLabel();
        tfDescricaoEquipamento = new javax.swing.JTextField();
        cbStatusEquipamento = new javax.swing.JComboBox();
        lStatus = new javax.swing.JLabel();
        lUtilizaRede = new javax.swing.JLabel();
        cbRedeEquipamento = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Equipamento");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        tabelaEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaEquipamento.getTableHeader().setReorderingAllowed(false);
        tabelaEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEquipamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEquipamento);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código:");

        bPesquisarEquipamento.setText("Pesquisar");
        bPesquisarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisaCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPesquisarEquipamento)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarEquipamento)
                    .addComponent(tfPesquisaCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bSalvarEquipamento.setText("Salvar");
        bSalvarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarEquipamentoActionPerformed(evt);
            }
        });

        bExcluirEquipamento.setText("Excluir");
        bExcluirEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirEquipamentoActionPerformed(evt);
            }
        });

        bAtualizarEquipamento.setText("Atualizar");
        bAtualizarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarEquipamentoActionPerformed(evt);
            }
        });

        bListarEquipamento.setText("Listar");
        bListarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarEquipamentoActionPerformed(evt);
            }
        });

        bLimparEquipamento.setText("Limpar");
        bLimparEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(bLimparEquipamento)
                .addGap(10, 10, 10)
                .addComponent(bListarEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAtualizarEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluirEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarEquipamento)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvarEquipamento)
                    .addComponent(bExcluirEquipamento)
                    .addComponent(bAtualizarEquipamento)
                    .addComponent(bListarEquipamento)
                    .addComponent(bLimparEquipamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        lCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lCodigo.setText("Código:");

        lDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lDescricao.setText("Descrição:");

        cbStatusEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo", "Reserva", "Emprestado", "Manutenção" }));

        lStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lStatus.setText("Status:");

        lUtilizaRede.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUtilizaRede.setText("Utiliza Rede:");

        cbRedeEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(lDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbStatusEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lUtilizaRede, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRedeEquipamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfDescricaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tfCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescricao)
                    .addComponent(tfDescricaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStatus)
                    .addComponent(cbStatusEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUtilizaRede)
                    .addComponent(cbRedeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos()
    {
        tfCodigoEquipamento.setText(null);
        tfDescricaoEquipamento.setText(null);
        cbStatusEquipamento.setSelectedItem("Selecione...");
        cbRedeEquipamento.setSelectedItem("Selecione...");
        tfPesquisaCodigoEquipamento.setText("");

    }

    private Equipamento capturaDados()
    {
        equipamento.setCdEquipamento(tfCodigoEquipamento.getText());
        equipamento.setDsEquipamento(tfDescricaoEquipamento.getText());
        equipamento.setStEquipamento(cbStatusEquipamento.getSelectedItem().toString());
        equipamento.setInCaboRede(cbRedeEquipamento.getSelectedItem().toString());
        return equipamento;
    }

    private void carregarFormulario (Equipamento equipamento) {
        tfCodigoEquipamento.setText(String.valueOf(equipamento.getCdEquipamento()));
        tfDescricaoEquipamento.setText(equipamento.getDsEquipamento());
        cbStatusEquipamento.setSelectedItem(equipamento.getStEquipamento());
        cbRedeEquipamento.setSelectedItem(equipamento.getInCaboRede());
    }

    private void montarTabela( )
    {
        equipamentoDao = new EquipamentoDao();

        ObjectSet<Equipamento> listEquipamento = equipamentoDao.montarTabelaEquipamento();

        EquipamentoTableModel equipamentoTableModel = new EquipamentoTableModel(listEquipamento);
        this.tabelaEquipamento.setModel(equipamentoTableModel);
    }

    private void bSalvarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarEquipamentoActionPerformed

        equipamento = new Equipamento();
        equipamentoService = new EquipamentoService();

        equipamento = capturaDados();
        equipamentoService.incluir(equipamento);
        montarTabela();
        limparCampos();
    }//GEN-LAST:event_bSalvarEquipamentoActionPerformed

    private void bPesquisarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarEquipamentoActionPerformed
        equipamento = new Equipamento();
        equipamentoService = new EquipamentoService();

        equipamento = equipamentoService.buscar(tfPesquisaCodigoEquipamento.getText().toUpperCase());
        
        if(equipamento != null){
            JOptionPane.showMessageDialog(null, "Equipamento encontrado", "Pesquisa Equipamento", JOptionPane.INFORMATION_MESSAGE);
            tfCodigoEquipamento.setText(""+equipamento.getCdEquipamento());
            tfDescricaoEquipamento.setText(""+equipamento.getDsEquipamento());
            cbStatusEquipamento.setSelectedItem(""+equipamento.getStEquipamento());
            cbRedeEquipamento.setSelectedItem(""+equipamento.getInCaboRede());
            
        }else{
             JOptionPane.showMessageDialog(null, "Equipamento não encontrado", "Pesquisa Equipamento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarEquipamentoActionPerformed

    private void bExcluirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirEquipamentoActionPerformed

        equipamento = new Equipamento();
        equipamentoService = new EquipamentoService();

        equipamento = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este equipamento: " + equipamento.getCdEquipamento(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0){
            equipamentoService.excluir(equipamento);
            limparCampos();
            this.tabelaEquipamento.setModel(new EquipamentoTableModel(new ArrayList<Equipamento>()));
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum equipamento foi excluído...", "Excluir - Equipamento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirEquipamentoActionPerformed

    private void bListarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarEquipamentoActionPerformed
        montarTabela();
    }//GEN-LAST:event_bListarEquipamentoActionPerformed

    private void bLimparEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparEquipamentoActionPerformed
        limparCampos();
        this.tabelaEquipamento.setModel(new EquipamentoTableModel(new ArrayList<Equipamento>()));
    }//GEN-LAST:event_bLimparEquipamentoActionPerformed

    private void tabelaEquipamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEquipamentoMouseClicked
        if (this.tabelaEquipamento.getSelectedRow() != -1) {

            EquipamentoTableModel equipamentoTableModel = (EquipamentoTableModel)this.tabelaEquipamento.getModel();
            this.carregarFormulario(equipamentoTableModel.getEquipamentos().get(this.tabelaEquipamento.getSelectedRow()));

        }
        this.tfCodigoEquipamento.requestFocus();
    }//GEN-LAST:event_tabelaEquipamentoMouseClicked

    private void bAtualizarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarEquipamentoActionPerformed
        equipamento = new Equipamento();
        equipamentoService = new EquipamentoService();

        equipamento = capturaDados();
        equipamentoService.atualizar(equipamento);

        montarTabela();
    }//GEN-LAST:event_bAtualizarEquipamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarEquipamento;
    private javax.swing.JButton bExcluirEquipamento;
    private javax.swing.JButton bLimparEquipamento;
    private javax.swing.JButton bListarEquipamento;
    private javax.swing.JButton bPesquisarEquipamento;
    private javax.swing.JButton bSalvarEquipamento;
    private javax.swing.JComboBox cbRedeEquipamento;
    private javax.swing.JComboBox cbStatusEquipamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lUtilizaRede;
    public javax.swing.JTable tabelaEquipamento;
    private javax.swing.JTextField tfCodigoEquipamento;
    private javax.swing.JTextField tfDescricaoEquipamento;
    private javax.swing.JTextField tfPesquisaCodigoEquipamento;
    // End of variables declaration//GEN-END:variables

}
