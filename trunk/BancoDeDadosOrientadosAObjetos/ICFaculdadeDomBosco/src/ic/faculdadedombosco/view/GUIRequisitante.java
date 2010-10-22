package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.RequisitanteService;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Anderson
 */

public class GUIRequisitante extends javax.swing.JInternalFrame {

    Requisitante oRequisitante;
    RequisitanteService oRequisitanteService;
    RequisitanteDao oRequisitanteDao;
    
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
    }

    private Requisitante capturaDados()
    {
        oRequisitante.setRequisitante_matricula(tfMatriculaRequisitante.getText());
        oRequisitante.setRequisitante_status(cbStatusRequisitante.getSelectedItem().toString());
        oRequisitante.setRequisitante_nome(tfNomeRequisitante.getText());
        oRequisitante.setRequisitante_tipo(cbTipoRequisitante.getSelectedItem().toString());
        oRequisitante.setRequisitante_telefone(tfTelefoneRequisitante.getText());

        return oRequisitante;
    }

    private void montarTabela( )
    {
        oRequisitanteDao = new RequisitanteDao();

        ObjectSet<Requisitante> listaatual = oRequisitanteDao.montarTabelaEquip();
        String [][] tabela = new String[listaatual.size()][5];

        for(int i = 0; i < listaatual.size(); i++){
            tabela[i][0] = String.valueOf(listaatual.get(i).getRequisitante_matricula());
            tabela[i][1] = listaatual.get(i).getRequisitante_status();
            tabela[i][2] = listaatual.get(i).getRequisitante_nome();
            tabela[i][3] = listaatual.get(i).getRequisitante_tipo();
            tabela[i][4] = listaatual.get(i).getRequisitante_telefone();
        }

        this.tabelaRequisitante.setModel(
            new DefaultTableModel(
                tabela,
                new String[] {"Matrícula", "Status", "Nome", "Tipo", "Telefone"}
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
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
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Status:");
        jPanel1.add(jLabel4);
        jPanel1.add(tfNomeRequisitante);

        bExcluirRequisitante.setText("Excluir");
        bExcluirRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirRequisitanteActionPerformed(evt);
            }
        });
        jPanel1.add(bExcluirRequisitante);

        bSalvarRequisitante.setText("Salvar");
        bSalvarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarRequisitanteActionPerformed(evt);
            }
        });
        jPanel1.add(bSalvarRequisitante);

        cbTipoRequisitante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Funcionário(a)", "Professor(a)", "Aluno(a)" }));
        jPanel1.add(cbTipoRequisitante);

        cbStatusRequisitante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo" }));
        jPanel1.add(cbStatusRequisitante);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6);

        try {
            tfTelefoneRequisitante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfTelefoneRequisitante);

        bLimparRequisitante.setText("Limpar");
        bLimparRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparRequisitanteActionPerformed(evt);
            }
        });
        jPanel1.add(bLimparRequisitante);

        bListarRequisitante.setText("Listar");
        bListarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarRequisitanteActionPerformed(evt);
            }
        });
        jPanel1.add(bListarRequisitante);

        bAtualizarRequisitante.setText("Atualizar");
        bAtualizarRequisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarRequisitanteActionPerformed(evt);
            }
        });
        jPanel1.add(bAtualizarRequisitante);

        tabelaRequisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Status", "Nome", "Tipo", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRequisitante.getTableHeader().setReorderingAllowed(false);
        tabelaRequisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRequisitanteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRequisitante);
        tabelaRequisitante.getColumnModel().getColumn(0).setResizable(false);
        tabelaRequisitante.getColumnModel().getColumn(1).setResizable(false);
        tabelaRequisitante.getColumnModel().getColumn(2).setResizable(false);
        tabelaRequisitante.getColumnModel().getColumn(3).setResizable(false);
        tabelaRequisitante.getColumnModel().getColumn(4).setResizable(false);

        jPanel1.add(jScrollPane1);

        bPesquisarRequisitante.setText("Pesquisar");
        jPanel1.add(bPesquisarRequisitante);
        jPanel1.add(tfNomePesqRequisitante);

        jLabel5.setText("Nome:");
        jPanel1.add(jLabel5);

        try {
            tfMatriculaRequisitante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfMatriculaRequisitante);

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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalvarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarRequisitanteActionPerformed
        oRequisitante = new Requisitante();
        oRequisitanteService = new RequisitanteService();

        oRequisitante = capturaDados();
        oRequisitanteService.incluir(oRequisitante);
        montarTabela();
        limparCampos();
    }//GEN-LAST:event_bSalvarRequisitanteActionPerformed

    private void bExcluirRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirRequisitanteActionPerformed
        oRequisitante = new Requisitante();
        oRequisitanteService = new RequisitanteService();

        oRequisitante = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este requisitante: " + oRequisitante.getRequisitante_nome(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            oRequisitanteService.excluir(oRequisitante);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum requisitante foi excluído...", "Excluir - Requisitante", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirRequisitanteActionPerformed

    private void bAtualizarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarRequisitanteActionPerformed

       oRequisitante = new Requisitante();
       oRequisitanteService = new RequisitanteService();

       oRequisitante = capturaDados();
       oRequisitanteService.atualizar(oRequisitante);
       montarTabela();
    }//GEN-LAST:event_bAtualizarRequisitanteActionPerformed

    private void bListarRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarRequisitanteActionPerformed
        montarTabela();
    }//GEN-LAST:event_bListarRequisitanteActionPerformed

    private void bLimparRequisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparRequisitanteActionPerformed
        limparCampos();
    }//GEN-LAST:event_bLimparRequisitanteActionPerformed

    private void tabelaRequisitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRequisitanteMouseClicked
        this.tfMatriculaRequisitante.setText(String.valueOf(
                this.tabelaRequisitante.getModel().getValueAt(this.tabelaRequisitante.getSelectedRow(), 0)));
        this.cbStatusRequisitante.setSelectedItem(String.valueOf(
                this.tabelaRequisitante.getModel().getValueAt(this.tabelaRequisitante.getSelectedRow(), 1)));
        this.tfNomeRequisitante.setText(String.valueOf(
                this.tabelaRequisitante.getModel().getValueAt(this.tabelaRequisitante.getSelectedRow(), 2)));
        this.cbTipoRequisitante.setSelectedItem(String.valueOf(
                this.tabelaRequisitante.getModel().getValueAt(this.tabelaRequisitante.getSelectedRow(), 3)));
        this.tfTelefoneRequisitante.setText(String.valueOf(
                this.tabelaRequisitante.getModel().getValueAt(this.tabelaRequisitante.getSelectedRow(), 4)));
        this.tfNomeRequisitante.requestFocus();
    }//GEN-LAST:event_tabelaRequisitanteMouseClicked


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
