package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.service.RecursoService;
import ic.faculdadedombosco.tables.RecursoTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Anderson
 */

public class GUIRecurso extends javax.swing.JInternalFrame {

    Recurso oRecurso;
    RecursoService oRecursoService;
    RecursoDao oRecursoDao;
   
    public GUIRecurso() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/5, (d.height - this.getSize().height)/5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfDescricaoRecurso = new javax.swing.JTextField();
        cbTipoRecurso = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pDadosEquipamentos = new javax.swing.JPanel();
        lCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        lDescricao = new javax.swing.JLabel();
        lUtilizaRede = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        bPesquisar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox();
        jcbRede = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbStatusRecurso = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbLocalizacaoRecurso = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        tfQuantidadeOcupRecurso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bSalvarRecurso = new javax.swing.JButton();
        bExcluirRecurso = new javax.swing.JButton();
        bAtualizarRecurso = new javax.swing.JButton();
        bLimparRecurso = new javax.swing.JButton();
        bListarRecurso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRecurso = new javax.swing.JTable();
        bPesquisarRecurso = new javax.swing.JButton();
        tfDescricaoPesquisaRecurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Recurso");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição:");

        cbTipoRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sala de Aula", "Sala de Reunião", "Auditório", "Outros" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo:");

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Equipamento");

        pDadosEquipamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Equipamento"));

        lCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lCodigo.setText("Código:");

        lDescricao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lDescricao.setText("Descrição:");

        lUtilizaRede.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUtilizaRede.setText("Utiliza Rede:");

        lStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lStatus.setText("Status:");

        bPesquisar.setText("Pesquisar");

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo", "Reserva", "Emprestado", "Manutenção" }));

        javax.swing.GroupLayout pDadosEquipamentosLayout = new javax.swing.GroupLayout(pDadosEquipamentos);
        pDadosEquipamentos.setLayout(pDadosEquipamentosLayout);
        pDadosEquipamentosLayout.setHorizontalGroup(
            pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSalvar))
                            .addGroup(pDadosEquipamentosLayout.createSequentialGroup()
                                .addComponent(lUtilizaRede, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRede)))
                        .addGap(2, 2, 2))
                    .addComponent(tfDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pDadosEquipamentosLayout.setVerticalGroup(
            pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosEquipamentosLayout.createSequentialGroup()
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUtilizaRede)
                    .addComponent(jcbRede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDadosEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisar)
                    .addComponent(bSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Status:");

        cbStatusRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo" }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Localização:");

        cbLocalizacaoRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Primeiro Andar", "Segundo Andar", "Terceiro Andar", "Quarto Andar", "Laboratórios", "Outro" }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Quant.Lugares:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbStatusRecurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTipoRecurso, 0, 129, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLocalizacaoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuantidadeOcupRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfDescricaoRecurso))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 435, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescricaoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbLocalizacaoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbStatusRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfQuantidadeOcupRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bSalvarRecurso.setText("Salvar");
        bSalvarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarRecursoActionPerformed(evt);
            }
        });

        bExcluirRecurso.setText("Excluir");
        bExcluirRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirRecursoActionPerformed(evt);
            }
        });

        bAtualizarRecurso.setText("Atualizar");
        bAtualizarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarRecursoActionPerformed(evt);
            }
        });

        bLimparRecurso.setText("Limpar");
        bLimparRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparRecursoActionPerformed(evt);
            }
        });

        bListarRecurso.setText("Listar");
        bListarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarRecursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(bLimparRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bListarRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAtualizarRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluirRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarRecurso)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAtualizarRecurso)
                    .addComponent(bExcluirRecurso)
                    .addComponent(bSalvarRecurso)
                    .addComponent(bListarRecurso)
                    .addComponent(bLimparRecurso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        tabelaRecurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaRecurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRecursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRecurso);

        bPesquisarRecurso.setText("Pesquisar");
        bPesquisarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarRecursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricaoPesquisaRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisarRecurso)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarRecurso)
                    .addComponent(tfDescricaoPesquisaRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos()
    {
        tfDescricaoRecurso.setText(null);
        cbTipoRecurso.setSelectedItem("Selecione...");
        cbLocalizacaoRecurso.setSelectedItem("Selecione...");
        cbStatusRecurso.setSelectedItem("Selecione...");
        tfQuantidadeOcupRecurso.setText(null);
        tfDescricaoPesquisaRecurso.setText(null);
    }

    private Recurso capturaDados()
    {
        oRecurso.setDs_recurso(tfDescricaoRecurso.getText());
        oRecurso.setTp_recurso(cbTipoRecurso.getSelectedItem().toString());
        oRecurso.setLc_recurso(cbLocalizacaoRecurso.getSelectedItem().toString());
        oRecurso.setSt_usuario(cbStatusRecurso.getSelectedItem().toString());
        oRecurso.setQt_ocupante(tfQuantidadeOcupRecurso.getText());

        return oRecurso;
    }

    private void carregarFormulario(Recurso recurso) {
        tfDescricaoRecurso.setText(String.valueOf(recurso.getDs_recurso()));
        cbTipoRecurso.setSelectedItem(recurso.getTp_recurso());
        cbLocalizacaoRecurso.setSelectedItem(recurso.getLc_recurso());
        cbStatusRecurso.setSelectedItem(recurso.getSt_usuario());
        tfQuantidadeOcupRecurso.setText(recurso.getQt_ocupante());
    }

    private void montarTabela( )
    {
        oRecursoDao = new RecursoDao();

        ObjectSet<Recurso> listRecurso = oRecursoDao.montarTabelaRecurso();

        RecursoTableModel recursoTableModel = new RecursoTableModel(listRecurso);
        this.tabelaRecurso.setModel(recursoTableModel);

    }

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed

      
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bLimparRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparRecursoActionPerformed
        limparCampos();
        this.tabelaRecurso.setModel(new RecursoTableModel(new ArrayList<Recurso>()));
    }//GEN-LAST:event_bLimparRecursoActionPerformed

    private void bAtualizarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarRecursoActionPerformed
       oRecurso = new Recurso();
       oRecursoService = new RecursoService();

       oRecurso = capturaDados();
       oRecursoService.atualizar(oRecurso);
       montarTabela();
    }//GEN-LAST:event_bAtualizarRecursoActionPerformed

    private void bListarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarRecursoActionPerformed
       montarTabela();
    }//GEN-LAST:event_bListarRecursoActionPerformed

    private void bExcluirRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirRecursoActionPerformed
        oRecurso = new Recurso();
        oRecursoService = new RecursoService();

        oRecurso = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este recurso: " + oRecurso.getDs_recurso(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            oRecursoService.excluir(oRecurso);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum recurso foi excluído...", "Excluir - Recurso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirRecursoActionPerformed

    private void bSalvarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarRecursoActionPerformed
        oRecurso = new Recurso();
        oRecursoService = new RecursoService();

        oRecurso = capturaDados();
        oRecursoService.incluir(oRecurso);
        montarTabela();
    }//GEN-LAST:event_bSalvarRecursoActionPerformed

    private void bPesquisarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarRecursoActionPerformed
       oRecurso = new Recurso();
       oRecursoService = new RecursoService();

       oRecurso = oRecursoService.buscar(tfDescricaoPesquisaRecurso.getText());

       if(oRecurso != null){
            JOptionPane.showMessageDialog(null, "Recurso encontrado", "Pesquisa Recurso", JOptionPane.INFORMATION_MESSAGE);
            tfDescricaoRecurso.setText(""+oRecurso.getDs_recurso());
            cbTipoRecurso.setSelectedItem(""+oRecurso.getTp_recurso());
            cbLocalizacaoRecurso.setSelectedItem(""+oRecurso.getLc_recurso());
            cbStatusRecurso.setSelectedItem(""+oRecurso.getSt_usuario());
            tfQuantidadeOcupRecurso.setText(""+oRecurso.getQt_ocupante());
        }else{
             JOptionPane.showMessageDialog(null, "Recurso não encontrado", "Pesquisa Recurso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarRecursoActionPerformed

    private void tabelaRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRecursoMouseClicked
        if (this.tabelaRecurso.getSelectedRow() != -1) {

            RecursoTableModel recursoTableModel = (RecursoTableModel)this.tabelaRecurso.getModel();
            this.carregarFormulario(recursoTableModel.getRecursos().get(this.tabelaRecurso.getSelectedRow()));

        }

        this.tfDescricaoRecurso.requestFocus();
    }//GEN-LAST:event_tabelaRecursoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarRecurso;
    private javax.swing.JButton bExcluirRecurso;
    private javax.swing.JButton bLimparRecurso;
    private javax.swing.JButton bListarRecurso;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bPesquisarRecurso;
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton bSalvarRecurso;
    private javax.swing.JComboBox cbLocalizacaoRecurso;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JComboBox cbStatusRecurso;
    private javax.swing.JComboBox cbTipoRecurso;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbRede;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lUtilizaRede;
    private javax.swing.JPanel pDadosEquipamentos;
    private javax.swing.JTable tabelaRecurso;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfDescricaoPesquisaRecurso;
    private javax.swing.JTextField tfDescricaoRecurso;
    private javax.swing.JTextField tfQuantidadeOcupRecurso;
    // End of variables declaration//GEN-END:variables

}
