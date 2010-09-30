/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUICadastroRecurso.java
 *
 * Created on 03/08/2010, 23:59:48
 */

package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.service.RecursoService;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class GUIRecurso extends javax.swing.JInternalFrame {

    Recurso recurso;
    RecursoService recursoService;
    RecursoDao recursoDao;
    /** Creates new form GUICadastroRecurso */
    public GUIRecurso() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/5, (d.height - this.getSize().height)/5);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfDescricaoRecurso = new javax.swing.JTextField();
        cbTipoRecurso = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        bExcluirRecurso = new javax.swing.JButton();
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
        bAtualizarRecurso = new javax.swing.JButton();
        bListarRecurso = new javax.swing.JButton();
        bLimparRecurso = new javax.swing.JButton();
        bPesquisarRecurso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfDescricaoPesquisaRecurso = new javax.swing.JTextField();
        bSalvarRecurso = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbLocalizacaoRecurso = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        tfQuantidadeOcupRecurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRecurso = new javax.swing.JTable();

        setClosable(true);
        setTitle("Recurso");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do recurso"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição:");

        cbTipoRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sala de Aula", "Sala de Reunião", "Auditório", "Outros" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo:");

        bExcluirRecurso.setText("Excluir");
        bExcluirRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirRecursoActionPerformed(evt);
            }
        });

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

        bAtualizarRecurso.setText("Atualizar");
        bAtualizarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarRecursoActionPerformed(evt);
            }
        });

        bListarRecurso.setText("Listar");
        bListarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarRecursoActionPerformed(evt);
            }
        });

        bLimparRecurso.setText("Limpar");
        bLimparRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparRecursoActionPerformed(evt);
            }
        });

        bPesquisarRecurso.setText("Pesquisar");
        bPesquisarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarRecursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição:");

        bSalvarRecurso.setText("Salvar");
        bSalvarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarRecursoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Localização:");

        cbLocalizacaoRecurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Primeiro Andar", "Segundo Andar", "Terceiro Andar", "Quarto Andar", "Laboratórios", "Outro" }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Quant.Lugares:");

        tabelaRecurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaRecurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo", "Localização", "Quant. Lugares"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRecursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRecurso);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bListarRecurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLimparRecurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAtualizarRecurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExcluirRecurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSalvarRecurso))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbStatusRecurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbTipoRecurso, 0, 129, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfQuantidadeOcupRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                .addGap(83, 83, 83))
                                            .addComponent(cbLocalizacaoRecurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tfDescricaoRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfDescricaoPesquisaRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(bPesquisarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                        .addGap(220, 220, 220)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 557, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 110, Short.MAX_VALUE)))
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
                    .addComponent(cbLocalizacaoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbStatusRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfQuantidadeOcupRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bListarRecurso)
                            .addComponent(bLimparRecurso)
                            .addComponent(bAtualizarRecurso)
                            .addComponent(bExcluirRecurso)
                            .addComponent(bSalvarRecurso))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPesquisarRecurso)
                            .addComponent(tfDescricaoPesquisaRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 146, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 146, Short.MAX_VALUE)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    }//Método responsável para limpar campos do frame

    private Recurso capturaDados()
    {
        recurso.setDs_recurso(tfDescricaoRecurso.getText());
        recurso.setTp_recurso(cbTipoRecurso.getSelectedItem().toString());
        recurso.setLc_recurso(cbLocalizacaoRecurso.getSelectedItem().toString());
        recurso.setSt_usuario(cbStatusRecurso.getSelectedItem().toString());
        recurso.setQt_ocupante(tfQuantidadeOcupRecurso.getText());

        return recurso;
    }//Método responsável para capturar dadas do frame

    private void montarTabela( )
    {

        recursoDao = new RecursoDao();

        ObjectSet<Recurso> listaatual = recursoDao.montarTabelaEquip();
        String [][] tabela = new String[listaatual.size()][5];

        for(int i = 0; i < listaatual.size(); i++){
            tabela[i][0] = String.valueOf(listaatual.get(i).getDs_recurso());
            tabela[i][1] = listaatual.get(i).getTp_recurso();
            tabela[i][2] = listaatual.get(i).getLc_recurso();
            tabela[i][3] = listaatual.get(i).getSt_usuario();
            tabela[i][4] = listaatual.get(i).getQt_ocupante();
        }

        this.tabelaRecurso.setModel(
            new DefaultTableModel(
                tabela,
                new String[] {"Descrição", "Tipo", "Localização", "Status", "Quant. Lugares"}
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
    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed

      
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bLimparRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparRecursoActionPerformed
        limparCampos();
    }//GEN-LAST:event_bLimparRecursoActionPerformed

    private void bAtualizarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarRecursoActionPerformed
       recurso = new Recurso();
       recursoService = new RecursoService();

       recurso = capturaDados();
       recursoService.atualizar(recurso);
       montarTabela();
    }//GEN-LAST:event_bAtualizarRecursoActionPerformed

    private void bListarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarRecursoActionPerformed
       montarTabela();
    }//GEN-LAST:event_bListarRecursoActionPerformed

    private void bExcluirRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirRecursoActionPerformed
        recurso = new Recurso();
        recursoService = new RecursoService();

        recurso = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este recurso: " + recurso.getDs_recurso(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {

            recursoService.excluir(recurso);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum recurso foi excluído...", "Excluir - Recurso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirRecursoActionPerformed

    private void bSalvarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarRecursoActionPerformed
        recurso = new Recurso();
        recursoService = new RecursoService();

        recurso = capturaDados();
        recursoService.incluir(recurso);
        montarTabela();
    }//GEN-LAST:event_bSalvarRecursoActionPerformed

    private void bPesquisarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarRecursoActionPerformed
       recurso = new Recurso();
       recursoService = new RecursoService();

        recurso = recursoService.buscar(tfDescricaoPesquisaRecurso.getText());

        if(recurso != null){
            JOptionPane.showMessageDialog(null, "Recurso encontrado", "Pesquisa Recurso", JOptionPane.INFORMATION_MESSAGE);
            tfDescricaoRecurso.setText(""+recurso.getDs_recurso());
            cbTipoRecurso.setSelectedItem(""+recurso.getTp_recurso());
            cbLocalizacaoRecurso.setSelectedItem(""+recurso.getLc_recurso());
            cbStatusRecurso.setSelectedItem(""+recurso.getSt_usuario());
            tfQuantidadeOcupRecurso.setText(""+recurso.getQt_ocupante());
        }else{
             JOptionPane.showMessageDialog(null, "Recurso não encontrado", "Pesquisa Recurso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarRecursoActionPerformed

    private void tabelaRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRecursoMouseClicked

        this.tfDescricaoRecurso.setText(String.valueOf(
                this.tabelaRecurso.getModel().getValueAt(this.tabelaRecurso.getSelectedRow(), 0)));
        this.cbTipoRecurso.setSelectedItem(String.valueOf(
                this.tabelaRecurso.getModel().getValueAt(this.tabelaRecurso.getSelectedRow(), 1)));
        this.cbLocalizacaoRecurso.setSelectedItem(String.valueOf(
                this.tabelaRecurso.getModel().getValueAt(this.tabelaRecurso.getSelectedRow(), 2)));
        this.cbStatusRecurso.setSelectedItem(String.valueOf(
                this.tabelaRecurso.getModel().getValueAt(this.tabelaRecurso.getSelectedRow(), 3)));
         this.tfQuantidadeOcupRecurso.setText(String.valueOf(
                this.tabelaRecurso.getModel().getValueAt(this.tabelaRecurso.getSelectedRow(), 4)));

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
