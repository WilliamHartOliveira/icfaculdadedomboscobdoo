/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIMovimentacaoAgendamento.java
 *
 * Created on 04/08/2010, 23:47:08
 */

package ic.faculdadedombosco.view;

import com.sun.java.swing.plaf.nimbus.DesktopPanePainter;
import java.awt.Dimension;

/**
 *
 * @author Anderson
 */
public class GUIMovimentacaoAgendamento extends javax.swing.JInternalFrame {

    /** Creates new form GUIMovimentacaoAgendamento */
    public GUIMovimentacaoAgendamento() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/6, (d.height - this.getSize().height)/6);
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
        jPanel2 = new javax.swing.JPanel();
        btPesqusarAgendamento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAgendamento = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txDataInicialPesquisaAgendamento = new javax.swing.JFormattedTextField();
        bDataInicialPesquisa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txDataFinalPesquisaAgendamento = new javax.swing.JFormattedTextField();
        bDataFinalPesquisa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbDisciplinaAgendamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbUsuarioAgendamento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbRecursoAgendamento = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txDataInicialAgendamento = new javax.swing.JFormattedTextField();
        txDataFinalAgendamento = new javax.swing.JFormattedTextField();
        bDataFinal = new javax.swing.JButton();
        bDataInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbHoraFinalAgendamento = new javax.swing.JComboBox();
        cbHoraInicialAgendamento = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacaoAgendamento = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btSalvarAgendamento = new javax.swing.JButton();
        btExcluirAgendamento = new javax.swing.JButton();
        btAtualizarAgendamento = new javax.swing.JButton();
        btListarAgendamento = new javax.swing.JButton();
        btLimparAgendamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agendamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do agendamento"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar - Agendamento"));

        btPesqusarAgendamento.setText("Pesquisar");

        tabelaAgendamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaAgendamento.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabelaAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data/Horário", "Equipamento", "Professor", "Localização", "Observação"
            }
        ));
        tabelaAgendamento.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabelaAgendamento);
        tabelaAgendamento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Data Inicial:");

        txDataInicialPesquisaAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataInicialPesquisaAgendamento.setText("00/00/0000");

        bDataInicialPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/calendario_1.png"))); // NOI18N
        bDataInicialPesquisa.setToolTipText("Calendário");
        bDataInicialPesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataInicialPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataInicialPesquisaActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data Final:");

        txDataFinalPesquisaAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataFinalPesquisaAgendamento.setText("00/00/0000");

        bDataFinalPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/calendario_1.png"))); // NOI18N
        bDataFinalPesquisa.setToolTipText("Calendário");
        bDataFinalPesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataFinalPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataFinalPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataInicialPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataFinalPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesqusarAgendamento)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16))
                    .addComponent(btPesqusarAgendamento)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bDataFinalPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bDataInicialPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Disciplina:");

        cbDisciplinaAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Usuário:");

        cbUsuarioAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Recurso:");

        cbRecursoAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data Inicial:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Data Final:");

        txDataInicialAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataInicialAgendamento.setText("00/00/0000");

        txDataFinalAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataFinalAgendamento.setText("00/00/0000");

        bDataFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/calendario_1.png"))); // NOI18N
        bDataFinal.setToolTipText("Calendário");
        bDataFinal.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataFinal.setMinimumSize(new java.awt.Dimension(25, 25));
        bDataFinal.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataFinalActionPerformed(evt);
            }
        });

        bDataInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/calendario_1.png"))); // NOI18N
        bDataInicial.setToolTipText("Calendário");
        bDataInicial.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataInicialActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Hora:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hora:");

        cbHoraFinalAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "21h 05min", "22h 45min" }));

        cbHoraInicialAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "19h 10min", "21h 05min" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txDataInicialAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHoraInicialAgendamento, 0, 124, Short.MAX_VALUE)
                            .addComponent(cbHoraFinalAgendamento, 0, 124, Short.MAX_VALUE)))
                    .addComponent(cbRecursoAgendamento, 0, 259, Short.MAX_VALUE)
                    .addComponent(cbUsuarioAgendamento, 0, 259, Short.MAX_VALUE)
                    .addComponent(cbDisciplinaAgendamento, 0, 259, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDisciplinaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbUsuarioAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRecursoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbHoraInicialAgendamento))
                    .addComponent(bDataInicial, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txDataInicialAgendamento)
                        .addComponent(jLabel4)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cbHoraFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setText("Observação:");

        taObservacaoAgendamento.setColumns(20);
        taObservacaoAgendamento.setRows(5);
        jScrollPane1.setViewportView(taObservacaoAgendamento);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btSalvarAgendamento.setText("Salvar");

        btExcluirAgendamento.setText("Excluir");

        btAtualizarAgendamento.setText("Atualizar");

        btListarAgendamento.setText("Listar");

        btLimparAgendamento.setText("Limpar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(btLimparAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btListarAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAtualizarAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvarAgendamento)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirAgendamento)
                    .addComponent(btAtualizarAgendamento)
                    .addComponent(btListarAgendamento)
                    .addComponent(btLimparAgendamento))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataInicialActionPerformed
        if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario();
            this.getDesktopPane().add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }
    }//GEN-LAST:event_bDataInicialActionPerformed

    private void bDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataFinalActionPerformed
        if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario();
            this.getDesktopPane().add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }
    }//GEN-LAST:event_bDataFinalActionPerformed

    private void bDataInicialPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataInicialPesquisaActionPerformed
         if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario();
            this.getDesktopPane().add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }
    }//GEN-LAST:event_bDataInicialPesquisaActionPerformed

    private void bDataFinalPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataFinalPesquisaActionPerformed
         if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario();
            this.getDesktopPane().add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }
    }//GEN-LAST:event_bDataFinalPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDataFinal;
    private javax.swing.JButton bDataFinalPesquisa;
    private javax.swing.JButton bDataInicial;
    private javax.swing.JButton bDataInicialPesquisa;
    private javax.swing.JButton btAtualizarAgendamento;
    private javax.swing.JButton btExcluirAgendamento;
    private javax.swing.JButton btLimparAgendamento;
    private javax.swing.JButton btListarAgendamento;
    private javax.swing.JButton btPesqusarAgendamento;
    private javax.swing.JButton btSalvarAgendamento;
    private javax.swing.JComboBox cbDisciplinaAgendamento;
    private javax.swing.JComboBox cbHoraFinalAgendamento;
    private javax.swing.JComboBox cbHoraInicialAgendamento;
    private javax.swing.JComboBox cbRecursoAgendamento;
    private javax.swing.JComboBox cbUsuarioAgendamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taObservacaoAgendamento;
    private javax.swing.JTable tabelaAgendamento;
    private javax.swing.JFormattedTextField txDataFinalAgendamento;
    private javax.swing.JFormattedTextField txDataFinalPesquisaAgendamento;
    private javax.swing.JFormattedTextField txDataInicialAgendamento;
    private javax.swing.JFormattedTextField txDataInicialPesquisaAgendamento;
    // End of variables declaration//GEN-END:variables

    private GUICalendario guicalendar;

}
