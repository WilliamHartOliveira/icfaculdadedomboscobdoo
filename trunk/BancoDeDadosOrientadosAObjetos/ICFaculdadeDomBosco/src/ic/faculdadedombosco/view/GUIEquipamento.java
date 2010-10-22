
package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.model.Equipamento;
import ic.faculdadedombosco.service.EquipamentoService;
import ic.faculdadedombosco.tables.EquipamentoTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIEquipamento extends javax.swing.JInternalFrame {

    Equipamento oEquipamento;
    EquipamentoService oEquipamentoService;
    EquipamentoDao oEquipamentoDao;

    public GUIEquipamento() {
        initComponents();
    }

     public void setPosicao()
     {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDadosEquipamentos = new javax.swing.JPanel();
        lCodigo = new javax.swing.JLabel();
        tfCodigoEquipamento = new javax.swing.JTextField();
        tfDescricaoEquipamento = new javax.swing.JTextField();
        lDescricao = new javax.swing.JLabel();
        lUtilizaRede = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        bPesquisarEquipamento = new javax.swing.JButton();
        bSalvarEquipamento = new javax.swing.JButton();
        cbStatusEquipamento = new javax.swing.JComboBox();
        cbRedeEquipamento = new javax.swing.JComboBox();
        bExcluirEquipamento = new javax.swing.JButton();
        bAtualizarEquipamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEquipamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisaCodigoEquipamento = new javax.swing.JTextField();
        bListarEquipamento = new javax.swing.JButton();
        bLimparEquipamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Equipamento");

        pDadosEquipamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Equipamento"));

        lCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lCodigo.setText("Código:");

        lDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lDescricao.setText("Descrição:");

        lUtilizaRede.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUtilizaRede.setText("Utiliza Rede:");

        lStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lStatus.setText("Status:");

        bPesquisarEquipamento.setText("Pesquisar");
        bPesquisarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarEquipamentoActionPerformed(evt);
            }
        });

        bSalvarEquipamento.setText("Salvar");
        bSalvarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarEquipamentoActionPerformed(evt);
            }
        });

        cbStatusEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo", "Reserva", "Emprestado", "Manutenção" }));

        cbRedeEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));

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

        tabelaEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
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

        javax.swing.GroupLayout pDadosEquipamentosLayout = new javax.swing.GroupLayout(pDadosEquipamentos);
        pDadosEquipamentos.setLayout(pDadosEquipamentosLayout);
        pDadosEquipamentosLayout.setHorizontalGroup(
            pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                        .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                                .addComponent(cbStatusEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lUtilizaRede, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbRedeEquipamento, 0, 178, Short.MAX_VALUE))
                            .addComponent(tfDescricaoEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(tfCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosEquipamentosLayout.createSequentialGroup()
                        .addComponent(bLimparEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bListarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAtualizarEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluirEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvarEquipamento))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosEquipamentosLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisaCodigoEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisarEquipamento)))
                .addContainerGap())
        );
        pDadosEquipamentosLayout.setVerticalGroup(
            pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tfCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescricao)
                    .addComponent(tfDescricaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStatus)
                    .addComponent(cbStatusEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUtilizaRede)
                    .addComponent(cbRedeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvarEquipamento)
                    .addComponent(bExcluirEquipamento)
                    .addComponent(bAtualizarEquipamento)
                    .addComponent(bListarEquipamento)
                    .addComponent(bLimparEquipamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarEquipamento)
                    .addComponent(tfPesquisaCodigoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        oEquipamento.setCdEquipamento(tfCodigoEquipamento.getText());
        oEquipamento.setDsEquipamento(tfDescricaoEquipamento.getText());
        oEquipamento.setStEquipamento(cbStatusEquipamento.getSelectedItem().toString());
        oEquipamento.setInCaboRede(cbRedeEquipamento.getSelectedItem().toString());

        return oEquipamento;
    }

    private void carregarFormulario (Equipamento equipamento) {
        tfCodigoEquipamento.setText(String.valueOf(equipamento.getCdEquipamento()));
        tfDescricaoEquipamento.setText(equipamento.getDsEquipamento());
        cbStatusEquipamento.setSelectedItem(equipamento.getStEquipamento());
        cbRedeEquipamento.setSelectedItem(equipamento.getInCaboRede());
    }

    private void montarTabela( )
    {
        oEquipamentoDao = new EquipamentoDao();

        ObjectSet<Equipamento> listEquipamento = oEquipamentoDao.montarTabelaEquip();

        EquipamentoTableModel equipamentoTableModel = new EquipamentoTableModel(listEquipamento);
        this.tabelaEquipamento.setModel(equipamentoTableModel);
    }

    private void bSalvarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarEquipamentoActionPerformed

        oEquipamento = new Equipamento();
        oEquipamentoService = new EquipamentoService();

        oEquipamento = capturaDados();
        oEquipamentoService.incluir(oEquipamento);
        montarTabela();
        limparCampos();
    }//GEN-LAST:event_bSalvarEquipamentoActionPerformed

    private void bPesquisarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarEquipamentoActionPerformed
        oEquipamento = new Equipamento();
        oEquipamentoService = new EquipamentoService();

        oEquipamento = oEquipamentoService.buscar(tfPesquisaCodigoEquipamento.getText());
        
        if(oEquipamento != null){
            JOptionPane.showMessageDialog(null, "Equipamento encontrado", "Pesquisa Equipamento", JOptionPane.INFORMATION_MESSAGE);
            tfCodigoEquipamento.setText(""+oEquipamento.getCdEquipamento());
            tfDescricaoEquipamento.setText(""+oEquipamento.getDsEquipamento());
            cbStatusEquipamento.setSelectedItem(""+oEquipamento.getStEquipamento());
            cbRedeEquipamento.setSelectedItem(""+oEquipamento.getInCaboRede());
        }else{
             JOptionPane.showMessageDialog(null, "Equipamento não encontrado", "Pesquisa Equipamento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarEquipamentoActionPerformed

    private void bExcluirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirEquipamentoActionPerformed

        oEquipamento = new Equipamento();
        oEquipamentoService = new EquipamentoService();

        oEquipamento = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este equipamento: " + oEquipamento.getCdEquipamento(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0){
            oEquipamentoService.excluir(oEquipamento);
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
        oEquipamento = new Equipamento();
        oEquipamentoService = new EquipamentoService();

        oEquipamento = capturaDados();
        oEquipamentoService.atualizar(oEquipamento);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lUtilizaRede;
    private javax.swing.JPanel pDadosEquipamentos;
    public javax.swing.JTable tabelaEquipamento;
    private javax.swing.JTextField tfCodigoEquipamento;
    private javax.swing.JTextField tfDescricaoEquipamento;
    private javax.swing.JTextField tfPesquisaCodigoEquipamento;
    // End of variables declaration//GEN-END:variables

}
