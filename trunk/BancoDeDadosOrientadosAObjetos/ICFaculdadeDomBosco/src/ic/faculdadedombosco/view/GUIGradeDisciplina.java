package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.GradeDisciplinaService;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Anderson
 * @author William
 */
public class GUIGradeDisciplina extends javax.swing.JInternalFrame {

    GradeDisciplina oGradeDisciplina;
    GradeDisciplinaService oGradeDisciplinaService;
    GradeDisciplinaDao oGradeDisciplinaDao;
    private Conexao oConexao;

    private ArrayList<String> comboIdProfessor = new ArrayList<String>();
    private ArrayList<String> comboIdRecurso = new ArrayList<String>();

    public GUIGradeDisciplina() {
        initComponents();
        inicializarCombosBoxs();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }

    private void limparCampos()
    {
        tf_disciplina_GradeDisciplina.setText(null);
        cb_curso_GradeDisciplina.setSelectedItem("Selecione...");
        cb_recurso_GradeDisciplina.setSelectedItem("Selecione...");
        cb_professor_GradeDisciplina.setSelectedItem("Selecione...");
        cb_status_GradeDisciplina.setSelectedItem("Selecione...");
        cb_cursoPesquisa_GradeDisciplina.setSelectedItem("Selecione...");
    }//Método responsável para limpar campos do frame

    private GradeDisciplina capturaDados()
    {
        oGradeDisciplina.setDisciplina_gradeDisciplina(tf_disciplina_GradeDisciplina.getText());
        oGradeDisciplina.setCurso_gradeDisciplina(cb_curso_GradeDisciplina.getSelectedItem().toString());
        oGradeDisciplina.setRecurso__gradeDisciplina(pesquisaRecurso(cb_recurso_GradeDisciplina.getSelectedItem().toString()));
        oGradeDisciplina.setProfessor_gradeDisciplina(pesquisaProfessor(cb_professor_GradeDisciplina.getSelectedItem().toString()));
        oGradeDisciplina.setStatus_gradeDisciplina(cb_status_GradeDisciplina.getSelectedItem().toString());

        return oGradeDisciplina;
    }//Método responsável para capturar dadas do frame

    public Recurso pesquisaRecurso(String descRecurso){
        
        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").constrain(descRecurso);
        ObjectSet<Recurso> lista = query.execute();
        
        Recurso rec = new Recurso();

        while (lista.hasNext())
        {
            rec = lista.next();
        }
        
        return rec;
    }

    public Requisitante pesquisaProfessor(String nomeRequisitante){

        this.oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Requisitante.class);
        query.descend("requisitante_nome").constrain(nomeRequisitante);
        ObjectSet<Requisitante> lista = query.execute();

        Requisitante req = new Requisitante();

        while (lista.hasNext())
        {
            req = lista.next();
        }

        return req;
    }

    private void montarTabela( )
    {
        oGradeDisciplinaDao = new GradeDisciplinaDao();

        ObjectSet<GradeDisciplina> listaatual = oGradeDisciplinaDao.montarTabelaEquip();
        String [][] tabela = new String[listaatual.size()][5];

        for(int i = 0; i < listaatual.size(); i++){
            tabela[i][0] = String.valueOf(listaatual.get(i).getDisciplina_gradeDisciplina());
            tabela[i][1] = listaatual.get(i).getCurso_gradeDisciplina();
            tabela[i][2] = listaatual.get(i).getRecurso__gradeDisciplina().getDs_recurso();
            tabela[i][3] = listaatual.get(i).getProfessor_gradeDisciplina().getRequisitante_nome();
            tabela[i][4] = listaatual.get(i).getStatus_gradeDisciplina();
        }

        this.tabela_GradeDisciplina.setModel(
            new DefaultTableModel(
                tabela,
                new String[] {"Disciplina", "Curso", "Recurso", "Professor(a)", "Status"}
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

    private void inicializarCombosBoxs()
    {
        //this.conexao = new Conexao();

        this.comboIdProfessor.clear();
        this.comboIdRecurso.clear();

        this.cb_professor_GradeDisciplina.removeAllItems();
        this.cb_recurso_GradeDisciplina.removeAllItems();

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
            this.cb_professor_GradeDisciplina.addItem(req.getRequisitante_nome());
        }
    }

    private void inicializarRecurso()
    {
        oConexao = new Conexao();
        Query query = this.oConexao.getDb().query();
        query.constrain(Recurso.class);
        query.descend("ds_recurso").orderAscending();
        ObjectSet<Recurso> lista = query.execute();

        while (lista.hasNext())
        {
            Recurso rec = lista.next();
            this.comboIdRecurso.add(rec.getDs_recurso());
            this.cb_recurso_GradeDisciplina.addItem(rec.getDs_recurso());
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_disciplina_GradeDisciplina = new javax.swing.JTextField();
        cb_curso_GradeDisciplina = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb_professor_GradeDisciplina = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cb_recurso_GradeDisciplina = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cb_status_GradeDisciplina = new javax.swing.JComboBox();
        b_listar_GradeDisciplina = new javax.swing.JButton();
        b_limpar_GradeDisciplina = new javax.swing.JButton();
        b_atualizar_GradeDisciplina = new javax.swing.JButton();
        b_excluir_GradeDisciplina = new javax.swing.JButton();
        b_salvar_GradeDisciplina = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_GradeDisciplina = new javax.swing.JTable();
        b_pesquisar_GradeDisciplina = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cb_cursoPesquisa_GradeDisciplina = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Grade Disciplina");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Grade Disciplina"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Disciplina:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Curso:");

        cb_curso_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Administração", "Ciências Contábeis", "Direito", "Eng. Ambiental e Sanitária", "Sistemas de Informação" }));
        cb_curso_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_curso_GradeDisciplinaActionPerformed(evt);
            }
        });

        jLabel4.setText("Professor(a):");

        cb_professor_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel5.setText("Recurso:");

        cb_recurso_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Status:");

        cb_status_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo" }));

        b_listar_GradeDisciplina.setText("Listar");
        b_listar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listar_GradeDisciplinaActionPerformed(evt);
            }
        });

        b_limpar_GradeDisciplina.setText("Limpar");
        b_limpar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpar_GradeDisciplinaActionPerformed(evt);
            }
        });

        b_atualizar_GradeDisciplina.setText("Atualizar");
        b_atualizar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atualizar_GradeDisciplinaActionPerformed(evt);
            }
        });

        b_excluir_GradeDisciplina.setText("Excluir");
        b_excluir_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluir_GradeDisciplinaActionPerformed(evt);
            }
        });

        b_salvar_GradeDisciplina.setText("Salvar");
        b_salvar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salvar_GradeDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_listar_GradeDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_limpar_GradeDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_atualizar_GradeDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_excluir_GradeDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_salvar_GradeDisciplina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb_professor_GradeDisciplina, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_curso_GradeDisciplina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_status_GradeDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_recurso_GradeDisciplina, 0, 132, Short.MAX_VALUE)))
                            .addComponent(tf_disciplina_GradeDisciplina))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_disciplina_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_curso_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_recurso_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_professor_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_status_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_listar_GradeDisciplina)
                    .addComponent(b_limpar_GradeDisciplina)
                    .addComponent(b_atualizar_GradeDisciplina)
                    .addComponent(b_excluir_GradeDisciplina)
                    .addComponent(b_salvar_GradeDisciplina))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabela_GradeDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Curso", "Recurso", "Professor(a)", "Status"
            }
        ));
        tabela_GradeDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_GradeDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_GradeDisciplina);

        b_pesquisar_GradeDisciplina.setText("Pesquisar");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Curso:");

        cb_cursoPesquisa_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Administração", "Ciências Contábeis", "Direito", "Eng. Ambiental e Sanitária", "Sistemas de Informação" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_cursoPesquisa_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_pesquisar_GradeDisciplina))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_pesquisar_GradeDisciplina)
                    .addComponent(cb_cursoPesquisa_GradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_listar_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listar_GradeDisciplinaActionPerformed
        montarTabela();
}//GEN-LAST:event_b_listar_GradeDisciplinaActionPerformed

    private void b_limpar_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpar_GradeDisciplinaActionPerformed
       limparCampos();
}//GEN-LAST:event_b_limpar_GradeDisciplinaActionPerformed

    private void b_atualizar_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_atualizar_GradeDisciplinaActionPerformed
       oGradeDisciplina = new GradeDisciplina();
       oGradeDisciplinaService = new GradeDisciplinaService();

       oGradeDisciplina = capturaDados();
       oGradeDisciplinaService.atualizar(oGradeDisciplina);
       montarTabela();
}//GEN-LAST:event_b_atualizar_GradeDisciplinaActionPerformed

    private void b_excluir_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluir_GradeDisciplinaActionPerformed
        oGradeDisciplina = new GradeDisciplina();
        oGradeDisciplinaService = new GradeDisciplinaService();

        oGradeDisciplina = capturaDados();
        int x = JOptionPane.showConfirmDialog(this, "Quer mesmo excluir está Disciplina: " + oGradeDisciplina.getDisciplina_gradeDisciplina(),"Cuidado",JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            oGradeDisciplinaService.excluir(oGradeDisciplina);
            limparCampos();
            this.montarTabela();
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum requisitante foi excluído...", "Excluir - Disciplina", JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_b_excluir_GradeDisciplinaActionPerformed

    private void b_salvar_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salvar_GradeDisciplinaActionPerformed
        oGradeDisciplina = new GradeDisciplina();
        oGradeDisciplinaService = new GradeDisciplinaService();

        oGradeDisciplina = capturaDados();
        oGradeDisciplinaService.incluir(oGradeDisciplina);
        montarTabela();
        limparCampos();
}//GEN-LAST:event_b_salvar_GradeDisciplinaActionPerformed

    private void tabela_GradeDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_GradeDisciplinaMouseClicked
        this.tf_disciplina_GradeDisciplina.setText(String.valueOf(
                this.tabela_GradeDisciplina.getModel().getValueAt(this.tabela_GradeDisciplina.getSelectedRow(), 0)));
        this.cb_curso_GradeDisciplina.setSelectedItem(String.valueOf(
                this.tabela_GradeDisciplina.getModel().getValueAt(this.tabela_GradeDisciplina.getSelectedRow(), 1)));
        this.cb_recurso_GradeDisciplina.setSelectedItem(String.valueOf(
                this.tabela_GradeDisciplina.getModel().getValueAt(this.tabela_GradeDisciplina.getSelectedRow(), 2)));
        this.cb_professor_GradeDisciplina.setSelectedItem(String.valueOf(
                this.tabela_GradeDisciplina.getModel().getValueAt(this.tabela_GradeDisciplina.getSelectedRow(), 3)));
        this.cb_status_GradeDisciplina.setSelectedItem(String.valueOf(
                this.tabela_GradeDisciplina.getModel().getValueAt(this.tabela_GradeDisciplina.getSelectedRow(), 4)));
    }//GEN-LAST:event_tabela_GradeDisciplinaMouseClicked

    private void cb_curso_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_curso_GradeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_curso_GradeDisciplinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_atualizar_GradeDisciplina;
    private javax.swing.JButton b_excluir_GradeDisciplina;
    private javax.swing.JButton b_limpar_GradeDisciplina;
    private javax.swing.JButton b_listar_GradeDisciplina;
    private javax.swing.JButton b_pesquisar_GradeDisciplina;
    private javax.swing.JButton b_salvar_GradeDisciplina;
    private javax.swing.JComboBox cb_cursoPesquisa_GradeDisciplina;
    private javax.swing.JComboBox cb_curso_GradeDisciplina;
    private javax.swing.JComboBox cb_professor_GradeDisciplina;
    private javax.swing.JComboBox cb_recurso_GradeDisciplina;
    private javax.swing.JComboBox cb_status_GradeDisciplina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela_GradeDisciplina;
    private javax.swing.JTextField tf_disciplina_GradeDisciplina;
    // End of variables declaration//GEN-END:variables

}
