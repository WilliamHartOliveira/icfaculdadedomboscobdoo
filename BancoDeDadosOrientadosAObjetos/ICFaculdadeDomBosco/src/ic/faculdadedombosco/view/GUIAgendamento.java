package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.dao.AgendamentoDao;
import ic.faculdadedombosco.model.Agendamento;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.AgendamentoService;
import ic.faculdadedombosco.tables.AgendamentoTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Anderson
 * @author William
 */
public class GUIAgendamento extends javax.swing.JInternalFrame {

    Agendamento oAgendamento;
    AgendamentoService oAgendamentoService;
    AgendamentoDao oAgendamentoDao;
    private Conexao oConexao;

    private ArrayList<String> comboIdDisciplina = new ArrayList<String>();
    private ArrayList<String> comboIdRecurso = new ArrayList<String>();
    private ArrayList<String> comboIdProfessor = new ArrayList<String>();

    public GUIAgendamento() {
        initComponents();
        inicializarCombosBoxs();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/6, (d.height - this.getSize().height)/6);
    }

    private void montarTabela( )
    {
        oAgendamentoDao = new AgendamentoDao();

        ObjectSet<Agendamento> listAgendamento = oAgendamentoDao.montarTabelaEquip();

        AgendamentoTableModel agendamentoTableModel = new AgendamentoTableModel(listAgendamento);
        this.tabelaAgendamento.setModel(agendamentoTableModel);
    }

    private void limparCampos()
    {
        cbDisciplinaAgendamento.setSelectedItem("Selecione...");
        cbUsuarioAgendamento.setSelectedItem("Selecione...");
        cbRecursoAgendamento.setSelectedItem("Selecione...");
        txDataInicialAgendamento.setText("00/00/0000");
        txDataFinalAgendamento.setText("00/00/0000");
        cbHoraInicialAgendamento.setSelectedItem("Selecione...");
        cbHoraFinalAgendamento.setSelectedItem("Selecione...");
        taObservacaoAgendamento.setText(null);
        txDataInicialPesquisaAgendamento.setText("00/00/0000");
        txDataFinalPesquisaAgendamento.setText("00/00/0000");
    }

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
        txDataFinalPesquisaAgendamento = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
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
        bDataInicialPesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataInicialPesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
        bDataInicialPesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataInicialPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataInicialPesquisaActionPerformed(evt);
            }
        });

        txDataFinalPesquisaAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataFinalPesquisaAgendamento.setText("00/00/0000");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Data Final:");

        bDataFinalPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/calendario_1.png"))); // NOI18N
        bDataFinalPesquisa.setToolTipText("Calendário");
        bDataFinalPesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataFinalPesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataFinalPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(bDataInicialPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesqusarAgendamento)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btPesqusarAgendamento)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addComponent(bDataInicialPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bDataFinalPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Disciplina:");

        cbDisciplinaAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));
        cbDisciplinaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisciplinaAgendamentoActionPerformed(evt);
            }
        });

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
        bDataInicial.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataInicial.setMinimumSize(new java.awt.Dimension(25, 25));
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txDataInicialAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbHoraInicialAgendamento)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txDataInicialAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbHoraFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
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
        btListarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarAgendamentoActionPerformed(evt);
            }
        });

        btLimparAgendamento.setText("Limpar");
        btLimparAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void cbDisciplinaAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisciplinaAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDisciplinaAgendamentoActionPerformed

    private void btLimparAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAgendamentoActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparAgendamentoActionPerformed

    private void btListarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarAgendamentoActionPerformed
        montarTabela();
    }//GEN-LAST:event_btListarAgendamentoActionPerformed

    private void inicializarCombosBoxs()
    {
        this.comboIdDisciplina.clear();
        this.comboIdProfessor.clear();
        this.comboIdRecurso.clear();

        this.cbDisciplinaAgendamento.removeAllItems();
        this.cbUsuarioAgendamento.removeAllItems();
        this.cbRecursoAgendamento.removeAllItems();

        this.inicializarDisciplina();
        this.inicializarProfessor();
        this.inicializarRecurso();
    }

    private void inicializarProfessor()
    {
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_tipo").constrain("Professor(a)");
        ObjectSet<Requisitante> lista = query.execute();

        while (lista.hasNext())
        {
            Requisitante req = lista.next();
            this.comboIdProfessor.add((req.getRequisitante_matricula()));
            this.cbUsuarioAgendamento.addItem(req.getRequisitante_nome());
        }
    }

    private void inicializarRecurso()
    {
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").orderAscending();
        ObjectSet<Recurso> lista = query.execute();

        while (lista.hasNext())
        {
            Recurso rec = lista.next();
            this.comboIdRecurso.add(rec.getDs_recurso());
            this.cbRecursoAgendamento.addItem(rec.getDs_recurso());
        }
    }

    private void inicializarDisciplina()
    {
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("disciplina_gradeDisciplina").orderAscending();
        ObjectSet<GradeDisciplina> lista = query.execute();

        while (lista.hasNext())
        {
            GradeDisciplina grd = lista.next();
            this.comboIdDisciplina.add((grd.getDisciplina_gradeDisciplina()));
            this.cbDisciplinaAgendamento.addItem(grd.getDisciplina_gradeDisciplina());
        }
    }


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
