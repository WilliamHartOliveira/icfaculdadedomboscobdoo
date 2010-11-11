package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.dao.AgendamentoDao;
import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.dao.RequisitanteDao;
import ic.faculdadedombosco.model.Agendamento;
import ic.faculdadedombosco.model.Equipamento;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.AgendamentoService;
import ic.faculdadedombosco.service.GradeDisciplinaService;
import ic.faculdadedombosco.service.RecursoService;
import ic.faculdadedombosco.service.RequisitanteService;
import ic.faculdadedombosco.tables.AgendamentoTableModel;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author Anderson
 * @author William
 */
public class GUIAgendamento extends javax.swing.JInternalFrame {

    Agendamento oAgendamento;
    AgendamentoService oAgendamentoService;
    AgendamentoDao oAgendamentoDao;

    GradeDisciplina oGradeDisciplina;
    GradeDisciplinaService oGradeDisciplinaService;
    GradeDisciplinaDao oGradeDisciplinaDao;

    Requisitante oRequisitante;
    RequisitanteService oRequisitanteService;
    RequisitanteDao oRequisitanteDao;

    Recurso oRecurso;
    RecursoService oRecursoService;
    RecursoDao oRecursoDao;

    private Conexao oConexao;
    private String campoCaptura;

    private ArrayList<String> comboIdDisciplina = new ArrayList<String>();
    private ArrayList<String> comboIdRecurso = new ArrayList<String>();
    private ArrayList<String> comboIdProfessor = new ArrayList<String>();
    private ArrayList<String> listaEquipamentosAntes = new ArrayList<String>();
    private ArrayList<String> listaEquipamentosDepois = new ArrayList<String>();

    public GUIAgendamento()
    {
        initComponents();
        inicializarCombosBoxs();
    }

    public void setPosicao()
    {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/6, (d.height - this.getSize().height)/6);
    }

    private void montarTabela( )
    {
        oAgendamentoDao = new AgendamentoDao();

        ObjectSet<Agendamento> listAgendamento = oAgendamentoDao.montarTabelaAgendamento();

        AgendamentoTableModel agendamentoTableModel = new AgendamentoTableModel(listAgendamento);
        this.tabelaAgendamento.setModel(agendamentoTableModel);
    }

    private void limparCampos()
    {
        cbDisciplinaAgendamento.setSelectedItem(null);
        cbUsuarioAgendamento.setSelectedItem(null);
        cbRecursoAgendamento.setSelectedItem(null);
        txDataInicialAgendamento.setText("00/00/0000");
        txDataFinalAgendamento.setText("00/00/0000");
        cbHoraInicialAgendamento.setSelectedItem("Selecione...");
        cbHoraFinalAgendamento.setSelectedItem("Selecione...");
        taObservacaoAgendamento.setText(null);
        txDataInicialPesquisaAgendamento.setText("00/00/0000");
        txDataFinalPesquisaAgendamento.setText("00/00/0000");
        this.tabelaAgendamento.setModel(new AgendamentoTableModel(new ArrayList<Agendamento>()));
    }

    private Agendamento capturaDados()
    {
        oAgendamento.setDisciplina(oGradeDisciplinaService.buscar(cbDisciplinaAgendamento.getSelectedItem().toString()));
        oAgendamento.setUsuario(oRequisitanteService.buscar(cbUsuarioAgendamento.getSelectedItem().toString()));
        oAgendamento.setRecurso(oRecursoService.buscar(cbRecursoAgendamento.getSelectedItem().toString()));
        //oAgendamento.setDisciplina(pesquisaDisciplina(cbDisciplinaAgendamento.getSelectedItem().toString()));
        //oAgendamento.setUsuario(pesquisaRequisitante(cbUsuarioAgendamento.getSelectedItem().toString()));
        //oAgendamento.setRecurso(pesquisaRecurso(cbRecursoAgendamento.getSelectedItem().toString()));
        oAgendamento.setDataInicial(new Date(txDataInicialAgendamento.getText()));
        oAgendamento.setHoraInicial(cbHoraInicialAgendamento.getSelectedItem().toString());
        oAgendamento.setDataFinal(new Date(txDataFinalAgendamento.getText()));
        oAgendamento.setHoraFinal(cbHoraFinalAgendamento.getSelectedItem().toString());
        oAgendamento.setObservacao(taObservacaoAgendamento.getText());

        return oAgendamento;
    }

    private void carregarFormulario (Agendamento agendamento) {
        cbDisciplinaAgendamento.setSelectedItem(agendamento.getDisciplina().getDisciplina_gradeDisciplina());
        cbUsuarioAgendamento.setSelectedItem(agendamento.getUsuario().getRequisitante_nome());
        cbRecursoAgendamento.setSelectedItem(agendamento.getRecurso().getDs_recurso());
        txDataInicialAgendamento.setText(agendamento.getDataInicial().toString());
        cbHoraInicialAgendamento.setSelectedItem(agendamento.getHoraInicial());
        txDataFinalAgendamento.setText(agendamento.getDataFinal().toString());
        cbHoraFinalAgendamento.setSelectedItem(agendamento.getHoraFinal());
        taObservacaoAgendamento.setText(agendamento.getObservacao());
        jlEquipamentosAgendamentos.setListData(agendamento.getListaEquipamentosDepoisAgendamento().toArray());
    }//???????????????????????????????????????????????????

    public void chamarCalendario(JTextField jtf)
    {
        if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario(jtf);
            this.getDesktopPane().add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }else{
            guicalendar.setVisible(false);
        }
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
        btRelatorioAgendamento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbDisciplinaAgendamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbUsuarioAgendamento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbRecursoAgendamento = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txDataFinalAgendamento = new javax.swing.JFormattedTextField();
        bDataFinal = new javax.swing.JButton();
        bDataInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbHoraFinalAgendamento = new javax.swing.JComboBox();
        cbHoraInicialAgendamento = new javax.swing.JComboBox();
        txDataInicialAgendamento = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacaoAgendamento = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlEquipamentosAgendamentos = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        cbEquipamentosAgendamento = new javax.swing.JComboBox();
        btAdicionarEquipamentoAgendamento = new javax.swing.JButton();
        btRemoverEquipamentoAgendamento = new javax.swing.JButton();
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
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaAgendamento.setColumnSelectionAllowed(true);
        tabelaAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAgendamentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAgendamento);
        tabelaAgendamento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Data Inicial:");

        txDataInicialPesquisaAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataInicialPesquisaAgendamento.setText("00/00/0000");

        bDataInicialPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/images/calendario_1.png"))); // NOI18N
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

        bDataFinalPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/images/calendario_1.png"))); // NOI18N
        bDataFinalPesquisa.setToolTipText("Calendário");
        bDataFinalPesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataFinalPesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
        bDataFinalPesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataFinalPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataFinalPesquisaActionPerformed(evt);
            }
        });

        btRelatorioAgendamento.setText("Relatório");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataInicialPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDataFinalPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesqusarAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRelatorioAgendamento)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRelatorioAgendamento)
                            .addComponent(btPesqusarAgendamento)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txDataFinalPesquisaAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addComponent(txDataInicialPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(bDataInicialPesquisa, 0, 0, Short.MAX_VALUE)
                            .addComponent(bDataFinalPesquisa, 0, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Disciplina:");

        cbDisciplinaAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));
        cbDisciplinaAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDisciplinaAgendamentoMouseClicked(evt);
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

        txDataFinalAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataFinalAgendamento.setText("00/00/0000");
        txDataFinalAgendamento.setPreferredSize(new java.awt.Dimension(62, 18));

        bDataFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/images/calendario_1.png"))); // NOI18N
        bDataFinal.setToolTipText("Calendário");
        bDataFinal.setAutoscrolls(true);
        bDataFinal.setMaximumSize(new java.awt.Dimension(25, 25));
        bDataFinal.setMinimumSize(new java.awt.Dimension(25, 25));
        bDataFinal.setPreferredSize(new java.awt.Dimension(25, 25));
        bDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDataFinalActionPerformed(evt);
            }
        });

        bDataInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/images/calendario_1.png"))); // NOI18N
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
        cbHoraFinalAgendamento.setPreferredSize(new java.awt.Dimension(82, 18));

        cbHoraInicialAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "19h 10min", "21h 05min" }));
        cbHoraInicialAgendamento.setPreferredSize(new java.awt.Dimension(82, 18));

        txDataInicialAgendamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDataInicialAgendamento.setText("00/00/0000");
        txDataInicialAgendamento.setPreferredSize(new java.awt.Dimension(62, 18));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDisciplinaAgendamento, javax.swing.GroupLayout.Alignment.TRAILING, 0, 264, Short.MAX_VALUE)
                    .addComponent(cbUsuarioAgendamento, javax.swing.GroupLayout.Alignment.TRAILING, 0, 264, Short.MAX_VALUE)
                    .addComponent(cbRecursoAgendamento, javax.swing.GroupLayout.Alignment.TRAILING, 0, 264, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txDataInicialAgendamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbHoraFinalAgendamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbHoraInicialAgendamento, 0, 92, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDisciplinaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUsuarioAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRecursoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txDataInicialAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbHoraInicialAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(bDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bDataFinal, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txDataFinalAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHoraFinalAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addContainerGap())))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("Observação:");

        taObservacaoAgendamento.setColumns(20);
        taObservacaoAgendamento.setRows(5);
        jScrollPane1.setViewportView(taObservacaoAgendamento);

        jlEquipamentosAgendamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jlEquipamentosAgendamentos);

        jLabel11.setText("Equipamentos:");

        cbEquipamentosAgendamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        btAdicionarEquipamentoAgendamento.setText("Adicionar");
        btAdicionarEquipamentoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarEquipamentoAgendamentoActionPerformed(evt);
            }
        });

        btRemoverEquipamentoAgendamento.setText("Remover");
        btRemoverEquipamentoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverEquipamentoAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEquipamentosAgendamento, 0, 389, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btAdicionarEquipamentoAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoverEquipamentoAgendamento)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbEquipamentosAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverEquipamentoAgendamento)
                    .addComponent(btAdicionarEquipamentoAgendamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btSalvarAgendamento.setText("Salvar");
        btSalvarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAgendamentoActionPerformed(evt);
            }
        });

        btExcluirAgendamento.setText("Excluir");
        btExcluirAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirAgendamentoActionPerformed(evt);
            }
        });

        btAtualizarAgendamento.setText("Atualizar");
        btAtualizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarAgendamentoActionPerformed(evt);
            }
        });

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
                .addContainerGap(505, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataInicialActionPerformed
        chamarCalendario(txDataInicialAgendamento);
    }//GEN-LAST:event_bDataInicialActionPerformed

    private void bDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataFinalActionPerformed
        chamarCalendario(txDataFinalAgendamento);
    }//GEN-LAST:event_bDataFinalActionPerformed

    private void bDataInicialPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataInicialPesquisaActionPerformed
        chamarCalendario(txDataInicialPesquisaAgendamento);
    }//GEN-LAST:event_bDataInicialPesquisaActionPerformed

    private void bDataFinalPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDataFinalPesquisaActionPerformed
        chamarCalendario(txDataFinalPesquisaAgendamento);
    }//GEN-LAST:event_bDataFinalPesquisaActionPerformed

    private void btLimparAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAgendamentoActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparAgendamentoActionPerformed

    private void btListarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarAgendamentoActionPerformed
        montarTabela();
    }//GEN-LAST:event_btListarAgendamentoActionPerformed

    private void btSalvarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAgendamentoActionPerformed
        oAgendamento = new Agendamento();
        oAgendamentoService = new AgendamentoService();

        oAgendamento = capturaDados();
        oAgendamentoService.incluir(oAgendamento);
        montarTabela();
        limparCampos();
    }//GEN-LAST:event_btSalvarAgendamentoActionPerformed

    private void btAdicionarEquipamentoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarEquipamentoAgendamentoActionPerformed
        this.listaEquipamentosDepois.add(
            this.listaEquipamentosAntes.get(
                this.cbEquipamentosAgendamento.getSelectedIndex()
            )
        );
        this.jlEquipamentosAgendamentos.setListData(listaEquipamentosDepois.toArray());

        this.listaEquipamentosAntes.remove(this.cbEquipamentosAgendamento.getSelectedIndex());
        this.cbEquipamentosAgendamento.removeItemAt(this.cbEquipamentosAgendamento.getSelectedIndex());
    }//GEN-LAST:event_btAdicionarEquipamentoAgendamentoActionPerformed

    private void btRemoverEquipamentoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverEquipamentoAgendamentoActionPerformed
        this.listaEquipamentosAntes.add(
            this.listaEquipamentosDepois.get(
                this.jlEquipamentosAgendamentos.getSelectedIndex()
            )
        );

        this.listaEquipamentosDepois.remove(this.jlEquipamentosAgendamentos.getSelectedIndex());
        this.cbEquipamentosAgendamento.addItem(this.jlEquipamentosAgendamentos.getSelectedValue());

        this.jlEquipamentosAgendamentos.setListData(listaEquipamentosDepois.toArray());
    }//GEN-LAST:event_btRemoverEquipamentoAgendamentoActionPerformed

    private void tabelaAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendamentoMouseClicked
        if (this.tabelaAgendamento.getSelectedRow() != -1) {

            AgendamentoTableModel agendamentoTableModel = (AgendamentoTableModel)this.tabelaAgendamento.getModel();
            this.carregarFormulario(agendamentoTableModel.getAgendamentos().get(this.tabelaAgendamento.getSelectedRow()));

        }
        this.txDataInicialPesquisaAgendamento.requestFocus();
    }//GEN-LAST:event_tabelaAgendamentoMouseClicked

    private void btAtualizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarAgendamentoActionPerformed
       oAgendamento = new Agendamento();
       oAgendamentoService = new AgendamentoService();

       oAgendamento = capturaDados();
       oAgendamentoService.atualizar(oAgendamento);
       montarTabela();
    }//GEN-LAST:event_btAtualizarAgendamentoActionPerformed

    private void btExcluirAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirAgendamentoActionPerformed
        oAgendamento = new Agendamento();
        oAgendamentoService = new AgendamentoService();

        oAgendamento = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir este Agendamento: ","Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            oAgendamentoService.excluir(oAgendamento);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum agendamento foi excluído...", "Excluir - Agendamento", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirAgendamentoActionPerformed

    private void cbDisciplinaAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDisciplinaAgendamentoMouseClicked

           

    }//GEN-LAST:event_cbDisciplinaAgendamentoMouseClicked

    /*public GradeDisciplina pesquisaDisciplina(String descGradeDisciplina){
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(GradeDisciplina.class);
        query.descend("disciplina_gradeDisciplina").constrain(descGradeDisciplina);
        ObjectSet<GradeDisciplina> lista = query.execute();

        GradeDisciplina gradeDisciplina = new GradeDisciplina();

        while (lista.hasNext())
        {
            gradeDisciplina = lista.next();
        }

        return gradeDisciplina;
    }

    public Requisitante pesquisaRequisitante(String descRequisitante){
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").constrain(descRequisitante);
        ObjectSet<Requisitante> lista = query.execute();

        Requisitante requisitante = new Requisitante();

        while (lista.hasNext())
        {
            requisitante = lista.next();
        }

        return requisitante;
    }

    public Recurso pesquisaRecurso(String descRecurso){

        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").constrain(descRecurso);
        ObjectSet<Recurso> lista = query.execute();

        Recurso recurso = new Recurso();

        while (lista.hasNext())
        {
            recurso = lista.next();
        }

        return recurso;
    }

    */ //TESTAR DEPOIS DESCARTAR -> FOI CHAMADO A CAMADA SERVICE, ELIMINANDO ASSIM REDUNDÂNCIAS DE MÉTODOS
    private void inicializarCombosBoxs()
    {
        this.comboIdDisciplina.clear();
        this.comboIdProfessor.clear();
        this.comboIdRecurso.clear();
        this.listaEquipamentosAntes.clear();
        this.listaEquipamentosDepois.clear();

        this.cbDisciplinaAgendamento.removeAllItems();
        this.cbUsuarioAgendamento.removeAllItems();
        this.cbRecursoAgendamento.removeAllItems();
        this.cbEquipamentosAgendamento.removeAllItems();
        this.jlEquipamentosAgendamentos.removeAll();

        this.inicializarDisciplina();
        //this.inicializarProfessor(oGradeDisciplinaService.buscar(cbUsuarioAgendamento.getSelectedItem().toString()));
        this.inicializarRecurso();
        this.inicializarEquipamento();
    }


    private void inicializarProfessor(String professor)
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
            this.cbDisciplinaAgendamento.addItem(grd.getDisciplina_gradeDisciplina()+"");
            this.comboIdDisciplina.add((grd.getDisciplina_gradeDisciplina()+""));
        }
    }

    private void inicializarEquipamento()
    {
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Equipamento.class);
        query.descend("cdEquipamento").orderAscending();
        ObjectSet<Equipamento> lista = query.execute();

        while (lista.hasNext())
        {
            Equipamento equipamento = lista.next();
            this.cbEquipamentosAgendamento.addItem((equipamento.getCdEquipamento() +" - "+equipamento.getDsEquipamento()));
            this.listaEquipamentosAntes.add((equipamento.getCdEquipamento() +" - "+equipamento.getDsEquipamento()));
            //this.jlEquipamentosGradeDisciplina.setListData(listaEquipamentos.toArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDataFinal;
    private javax.swing.JButton bDataFinalPesquisa;
    private javax.swing.JButton bDataInicial;
    private javax.swing.JButton bDataInicialPesquisa;
    private javax.swing.JButton btAdicionarEquipamentoAgendamento;
    private javax.swing.JButton btAtualizarAgendamento;
    private javax.swing.JButton btExcluirAgendamento;
    private javax.swing.JButton btLimparAgendamento;
    private javax.swing.JButton btListarAgendamento;
    private javax.swing.JButton btPesqusarAgendamento;
    private javax.swing.JButton btRelatorioAgendamento;
    private javax.swing.JButton btRemoverEquipamentoAgendamento;
    private javax.swing.JButton btSalvarAgendamento;
    private javax.swing.JComboBox cbDisciplinaAgendamento;
    private javax.swing.JComboBox cbEquipamentosAgendamento;
    private javax.swing.JComboBox cbHoraFinalAgendamento;
    private javax.swing.JComboBox cbHoraInicialAgendamento;
    private javax.swing.JComboBox cbRecursoAgendamento;
    private javax.swing.JComboBox cbUsuarioAgendamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList jlEquipamentosAgendamentos;
    private javax.swing.JTextArea taObservacaoAgendamento;
    private javax.swing.JTable tabelaAgendamento;
    private javax.swing.JFormattedTextField txDataFinalAgendamento;
    private javax.swing.JFormattedTextField txDataFinalPesquisaAgendamento;
    private javax.swing.JFormattedTextField txDataInicialAgendamento;
    private javax.swing.JFormattedTextField txDataInicialPesquisaAgendamento;
    // End of variables declaration//GEN-END:variables



    private GUICalendario guicalendar;
}
