package ic.faculdadedombosco.view;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.framework.LimitarTamanhoTexto;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.model.Requisitante;
import ic.faculdadedombosco.service.GradeDisciplinaService;
import ic.faculdadedombosco.tables.GradeDisciplinaTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        tf_disciplina_GradeDisciplina.setDocument(new LimitarTamanhoTexto(34));
        tfPesquisaGradeDisciplina.setDocument(new LimitarTamanhoTexto(34));
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
        tfPesquisaGradeDisciplina.setText(null);
        this.tabela_GradeDisciplina.setModel(new GradeDisciplinaTableModel(new ArrayList<GradeDisciplina>()));
    }

    private GradeDisciplina capturaDados()
    {
        oGradeDisciplina.setDisciplina_gradeDisciplina(tf_disciplina_GradeDisciplina.getText());
        oGradeDisciplina.setCurso_gradeDisciplina(cb_curso_GradeDisciplina.getSelectedItem().toString());
        oGradeDisciplina.setRecurso__gradeDisciplina(pesquisaRecurso(cb_recurso_GradeDisciplina.getSelectedItem().toString()));
        oGradeDisciplina.setProfessor_gradeDisciplina(pesquisaProfessor(cb_professor_GradeDisciplina.getSelectedItem().toString()));
        oGradeDisciplina.setStatus_gradeDisciplina(cb_status_GradeDisciplina.getSelectedItem().toString());

        return oGradeDisciplina;
    }

    private void carregarFormulario (GradeDisciplina gradeDisciplina) {
        tf_disciplina_GradeDisciplina.setText(String.valueOf(gradeDisciplina.getDisciplina_gradeDisciplina()));
        cb_curso_GradeDisciplina.setSelectedItem(gradeDisciplina.getCurso_gradeDisciplina());
        cb_recurso_GradeDisciplina.setSelectedItem(gradeDisciplina.getRecurso__gradeDisciplina().getDs_recurso());
        cb_professor_GradeDisciplina.setSelectedItem(gradeDisciplina.getProfessor_gradeDisciplina().getRequisitante_nome());
        cb_status_GradeDisciplina.setSelectedItem(gradeDisciplina.getStatus_gradeDisciplina());
    }

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

        ObjectSet<GradeDisciplina> listGradeDisciplina = oGradeDisciplinaDao.montarTabelaGradeDisciplina();

        GradeDisciplinaTableModel gradeDisciplinaTableModel = new GradeDisciplinaTableModel(listGradeDisciplina);
        this.tabela_GradeDisciplina.setModel(gradeDisciplinaTableModel);
    }

    private void inicializarCombosBoxs()
    {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_GradeDisciplina = new javax.swing.JTable();
        b_pesquisar_GradeDisciplina = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfPesquisaGradeDisciplina = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        b_limpar_GradeDisciplina = new javax.swing.JButton();
        b_atualizar_GradeDisciplina = new javax.swing.JButton();
        b_excluir_GradeDisciplina = new javax.swing.JButton();
        b_salvar_GradeDisciplina = new javax.swing.JButton();
        b_listar_GradeDisciplina = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Disciplina:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Curso:");

        cb_curso_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Administração", "Ciências Contábeis", "Direito", "Eng. Ambiental e Sanitária", "Sistemas de Informação" }));

        jLabel4.setText("Professor(a):");

        cb_professor_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", " " }));

        jLabel5.setText("Recurso:");

        cb_recurso_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Status:");

        cb_status_GradeDisciplina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(tf_disciplina_GradeDisciplina))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        tabela_GradeDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela_GradeDisciplina.getTableHeader().setReorderingAllowed(false);
        tabela_GradeDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_GradeDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_GradeDisciplina);

        b_pesquisar_GradeDisciplina.setText("Pesquisar");
        b_pesquisar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pesquisar_GradeDisciplinaActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Disciplina:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisaGradeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_pesquisar_GradeDisciplina))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPesquisaGradeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_pesquisar_GradeDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        b_listar_GradeDisciplina.setText("Listar");
        b_listar_GradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listar_GradeDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(b_limpar_GradeDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_listar_GradeDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_atualizar_GradeDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_excluir_GradeDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_salvar_GradeDisciplina)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_atualizar_GradeDisciplina)
                    .addComponent(b_excluir_GradeDisciplina)
                    .addComponent(b_salvar_GradeDisciplina)
                    .addComponent(b_listar_GradeDisciplina)
                    .addComponent(b_limpar_GradeDisciplina))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (this.tabela_GradeDisciplina.getSelectedRow() != -1) {

            GradeDisciplinaTableModel gradeDisciplinaTableModel = (GradeDisciplinaTableModel)this.tabela_GradeDisciplina.getModel();
            this.carregarFormulario(gradeDisciplinaTableModel.getGradeDisciplinas().get(this.tabela_GradeDisciplina.getSelectedRow()));

        }
        this.tf_disciplina_GradeDisciplina.requestFocus();
    }//GEN-LAST:event_tabela_GradeDisciplinaMouseClicked

    private void b_pesquisar_GradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pesquisar_GradeDisciplinaActionPerformed


        oGradeDisciplina = new GradeDisciplina();
        oGradeDisciplinaService = new GradeDisciplinaService();

        oGradeDisciplina = oGradeDisciplinaService.buscar(tfPesquisaGradeDisciplina.getText().toUpperCase());

        if(oGradeDisciplina != null){
             JOptionPane.showMessageDialog(null, "Disciplina encontrada", "Pesquisa Disciplina", JOptionPane.INFORMATION_MESSAGE);
             tf_disciplina_GradeDisciplina.setText(""+oGradeDisciplina.getDisciplina_gradeDisciplina());
             cb_curso_GradeDisciplina.setSelectedItem(""+oGradeDisciplina.getCurso_gradeDisciplina());
             cb_recurso_GradeDisciplina.setSelectedItem(""+oGradeDisciplina.getRecursoDescricao());
             cb_professor_GradeDisciplina.setSelectedItem(""+oGradeDisciplina.getProfessorDescricao());
             cb_status_GradeDisciplina.setSelectedItem(""+oGradeDisciplina.getStatus_gradeDisciplina());
         }else{
              JOptionPane.showMessageDialog(null, "Disciplina não encontrado", "Pesquisa Disciplina", JOptionPane.INFORMATION_MESSAGE);
         }
    }//GEN-LAST:event_b_pesquisar_GradeDisciplinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_atualizar_GradeDisciplina;
    private javax.swing.JButton b_excluir_GradeDisciplina;
    private javax.swing.JButton b_limpar_GradeDisciplina;
    private javax.swing.JButton b_listar_GradeDisciplina;
    private javax.swing.JButton b_pesquisar_GradeDisciplina;
    private javax.swing.JButton b_salvar_GradeDisciplina;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela_GradeDisciplina;
    private javax.swing.JTextField tfPesquisaGradeDisciplina;
    private javax.swing.JTextField tf_disciplina_GradeDisciplina;
    // End of variables declaration//GEN-END:variables

}
