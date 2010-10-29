package ic.faculdadedombosco.view;

import ic.faculdadedombosco.Conexao;
import ic.faculdadedombosco.dao.EquipamentoDao;
import ic.faculdadedombosco.dao.GradeDisciplinaDao;
import ic.faculdadedombosco.dao.RecursoDao;
import ic.faculdadedombosco.dao.UsuarioDao;
import ic.faculdadedombosco.model.Equipamento;
import ic.faculdadedombosco.model.GradeDisciplina;
import ic.faculdadedombosco.model.Recurso;
import ic.faculdadedombosco.model.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class GUIPrincipal extends javax.swing.JFrame {

    Conexao oConexao;

    public GUIPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        oConexao = new Conexao();
        oConexao.abrirConexao();

        //Cuida para que o relógio atualize sempre
        Thread time = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        lHora.setText(pegarData());
                        Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            //Ninguém precisa saber que deu erro.
                    }
                }
            }
        };
        time.start();
    }

    String pegarData() {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss aa"); //
        return data.format(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemSeparador = new javax.swing.JPopupMenu.Separator();
        itemDeMenuSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        itemDeMenuAgendamento = new javax.swing.JMenuItem();
        itemDeMenuEquipamento = new javax.swing.JMenuItem();
        itemDeMenuGradeDisciplina = new javax.swing.JMenuItem();
        itemDeMenuRecurso = new javax.swing.JMenuItem();
        itemDeMenuUsuario = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        itemDeMenuRelatorioDeEquipamento = new javax.swing.JMenuItem();
        itemDeMenuRelatorioDeGradeDisciplina = new javax.swing.JMenuItem();
        itemDeMenuRelatorioDeRecurso = new javax.swing.JMenuItem();
        itemDeMenuRelatorioDeUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemDeMenuGerenciadorUsuario = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemDeMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IC - Faculdade Dom Bosco de Porto Alegre");
        setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/face_bosco.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel2.setBounds(0, 0, 1250, 740);
        desktopPane.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lHora.setFont(new java.awt.Font("Tahoma", 1, 18));
        lHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lHora.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Patrocinado pela Faculdade Dom Bosco - Rua Marechal José Inácio da Silva, nº 355 Bairro Passo d'Areia Porto Alegre, RS - Telefones/Fax: (0xx51) 3361.6700 (0xx51) 3345.3668");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuArquivo.setText("Arquivo");
        menuArquivo.add(itemSeparador);

        itemDeMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/sair.png"))); // NOI18N
        itemDeMenuSair.setText("Sair");
        itemDeMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemDeMenuSair);

        menuBar.add(menuArquivo);

        menuCadastro.setText("Cadastro");

        itemDeMenuAgendamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/agendamento.png"))); // NOI18N
        itemDeMenuAgendamento.setText("Agendamento");
        itemDeMenuAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuAgendamentoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuAgendamento);

        itemDeMenuEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/equipamento.png"))); // NOI18N
        itemDeMenuEquipamento.setText("Equipamento");
        itemDeMenuEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuEquipamentoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuEquipamento);

        itemDeMenuGradeDisciplina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuGradeDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/grade_disciplina.png"))); // NOI18N
        itemDeMenuGradeDisciplina.setText("Grade Disciplina");
        itemDeMenuGradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuGradeDisciplinaActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuGradeDisciplina);

        itemDeMenuRecurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/recurso.png"))); // NOI18N
        itemDeMenuRecurso.setText("Recurso");
        itemDeMenuRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRecursoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuRecurso);

        itemDeMenuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/usuario.png"))); // NOI18N
        itemDeMenuUsuario.setText("Requisitante");
        itemDeMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuUsuario);

        menuBar.add(menuCadastro);

        menuRelatorio.setText("Relatório");

        itemDeMenuRelatorioDeEquipamento.setText("Equipamento");
        itemDeMenuRelatorioDeEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioDeEquipamentoActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemDeMenuRelatorioDeEquipamento);

        itemDeMenuRelatorioDeGradeDisciplina.setText("Grade Disciplina");
        itemDeMenuRelatorioDeGradeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioDeGradeDisciplinaActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemDeMenuRelatorioDeGradeDisciplina);

        itemDeMenuRelatorioDeRecurso.setText("Recurso");
        itemDeMenuRelatorioDeRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioDeRecursoActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemDeMenuRelatorioDeRecurso);

        itemDeMenuRelatorioDeUsuario.setText("Usuário");
        itemDeMenuRelatorioDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioDeUsuarioActionPerformed(evt);
            }
        });
        menuRelatorio.add(itemDeMenuRelatorioDeUsuario);

        menuBar.add(menuRelatorio);

        jMenu1.setText("Usuário");

        itemDeMenuGerenciadorUsuario.setText("Gerenciador");
        itemDeMenuGerenciadorUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuGerenciadorUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(itemDeMenuGerenciadorUsuario);

        menuBar.add(jMenu1);

        menuAjuda.setText("Ajuda");

        itemDeMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemDeMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/faculdadedombosco/imagens/ajuda.png"))); // NOI18N
        itemDeMenuSobre.setText("Sobre");
        itemDeMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemDeMenuSobre);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lHora, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lHora, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDeMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSairActionPerformed
        oConexao.fecharConexao();
        System.exit(0);
    }//GEN-LAST:event_itemDeMenuSairActionPerformed

    private void itemDeMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuUsuarioActionPerformed
        if((guirequisitante == null) || (!guirequisitante.isVisible())){
            guirequisitante = new GUIRequisitante();
            desktopPane.add(guirequisitante);
            guirequisitante.setPosicao();
            guirequisitante.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuUsuarioActionPerformed

    private void itemDeMenuRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRecursoActionPerformed
       if((guicadrec == null) || (!guicadrec.isVisible())){
            guicadrec = new GUIRecurso();
            desktopPane.add(guicadrec);
            guicadrec.setPosicao();
            guicadrec.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuRecursoActionPerformed

    private void itemDeMenuGradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuGradeDisciplinaActionPerformed
        if((guigradedisciplina == null) || (!guigradedisciplina.isVisible())){
            guigradedisciplina = new GUIGradeDisciplina();
            desktopPane.add(guigradedisciplina);
            guigradedisciplina.setPosicao();
            guigradedisciplina.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuGradeDisciplinaActionPerformed

    private void itemDeMenuAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuAgendamentoActionPerformed
        if((guimovagend == null) || (!guimovagend.isVisible())){
            guimovagend = new GUIAgendamento();
            desktopPane.add(guimovagend);
            guimovagend.setPosicao();
            guimovagend.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuAgendamentoActionPerformed

    private void itemDeMenuRelatorioDeEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioDeEquipamentoActionPerformed

        EquipamentoDao equipamentoDao = new EquipamentoDao();

        String fileName="./REPORTS/reportEquipmento.jasper";

        List<Equipamento> list = equipamentoDao.listarEquipamento();
        JRDataSource datos = new JRBeanCollectionDataSource(list);

        JasperViewer ver = null;
        JasperPrint jasper = null;

        try {           
            jasper = JasperFillManager.fillReport(fileName, new HashMap(), datos);

            ver = new JasperViewer(jasper,false);
            ver.setTitle("Faculdade Dom Bosco de Porto Alegre");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setLocationRelativeTo(this);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_itemDeMenuRelatorioDeEquipamentoActionPerformed

    private void itemDeMenuRelatorioDeGradeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioDeGradeDisciplinaActionPerformed

        GradeDisciplinaDao gradeDisciplinaDao = new GradeDisciplinaDao();

        String fileName="./REPORTS/reportGradeDisciplina.jasper";

        List<GradeDisciplina> list = gradeDisciplinaDao.listarGradeDisciplina();
        JRDataSource datos = new JRBeanCollectionDataSource(list); 

        JasperViewer ver = null;
        JasperPrint jasper = null;

        try {
            jasper = JasperFillManager.fillReport(fileName, new HashMap(), datos);

            ver = new JasperViewer(jasper,false);
            ver.setTitle("Faculdade Dom Bosco de Porto Alegre");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setLocationRelativeTo(this);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_itemDeMenuRelatorioDeGradeDisciplinaActionPerformed

    private void itemDeMenuRelatorioDeRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioDeRecursoActionPerformed
        
        RecursoDao recusoDao = new RecursoDao();

        String fileName="./REPORTS/reportRecurso.jasper";

        List<Recurso> list = recusoDao.listarRecurso();
        JRDataSource datos = new JRBeanCollectionDataSource(list);

        JasperViewer ver = null;
        JasperPrint jasper = null;

        try {
            jasper = JasperFillManager.fillReport(fileName, new HashMap(), datos);

            ver = new JasperViewer(jasper,false);
            ver.setTitle("Faculdade Dom Bosco de Porto Alegre");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setLocationRelativeTo(this);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_itemDeMenuRelatorioDeRecursoActionPerformed

    private void itemDeMenuRelatorioDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioDeUsuarioActionPerformed

        UsuarioDao usuarioDao = new UsuarioDao();

        String fileName="./REPORTS/reportUsuario.jasper";

        List<Usuario> list = usuarioDao.listarUsuario();
        JRDataSource datos = new JRBeanCollectionDataSource(list);

        JasperViewer ver = null;
        JasperPrint jasper = null;

        try {
            jasper = JasperFillManager.fillReport(fileName, new HashMap(), datos);

            ver = new JasperViewer(jasper,false);
            ver.setTitle("Faculdade Dom Bosco de Porto Alegre");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setLocationRelativeTo(this);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_itemDeMenuRelatorioDeUsuarioActionPerformed

    private void itemDeMenuEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuEquipamentoActionPerformed
        if((guicadequip == null) || (!guicadequip.isVisible())){
            guicadequip = new GUIEquipamento();
            desktopPane.add(guicadequip);
            guicadequip.setPosicao();
            guicadequip.setVisible(true);
        }
}//GEN-LAST:event_itemDeMenuEquipamentoActionPerformed

    private void itemDeMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSobreActionPerformed
        if((guisobre == null) || (!guisobre.isVisible())){
            guisobre = new GUISobre();
            desktopPane.add(guisobre);
            guisobre.setPosicao();
            guisobre.setVisible(true);
        }
}//GEN-LAST:event_itemDeMenuSobreActionPerformed

    private void itemDeMenuGerenciadorUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuGerenciadorUsuarioActionPerformed
        if((guiusuario == null) || (!guiusuario.isVisible())){
            guiusuario = new GUIUsuario();
            desktopPane.add(guiusuario);
            guiusuario.setPosicao();
            guiusuario.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuGerenciadorUsuarioActionPerformed

    public void Calendario(){
        if((guicalendar == null) || (!guicalendar.isVisible())){
            guicalendar = new GUICalendario();
            desktopPane.add(guicalendar);
            guicalendar.setPosicao();
            guicalendar.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemDeMenuAgendamento;
    private javax.swing.JMenuItem itemDeMenuEquipamento;
    private javax.swing.JMenuItem itemDeMenuGerenciadorUsuario;
    private javax.swing.JMenuItem itemDeMenuGradeDisciplina;
    private javax.swing.JMenuItem itemDeMenuRecurso;
    private javax.swing.JMenuItem itemDeMenuRelatorioDeEquipamento;
    private javax.swing.JMenuItem itemDeMenuRelatorioDeGradeDisciplina;
    private javax.swing.JMenuItem itemDeMenuRelatorioDeRecurso;
    private javax.swing.JMenuItem itemDeMenuRelatorioDeUsuario;
    private javax.swing.JMenuItem itemDeMenuSair;
    private javax.swing.JMenuItem itemDeMenuSobre;
    private javax.swing.JMenuItem itemDeMenuUsuario;
    private javax.swing.JPopupMenu.Separator itemSeparador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lHora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables

    private GUIEquipamento guicadequip;
    private GUIAgendamento guimovagend;
    private GUIRecurso guicadrec;
    private GUIRequisitante guirequisitante;
    private GUISobre guisobre;
    private GUICalendario guicalendar;
    private GUIGradeDisciplina guigradedisciplina;
    private GUIUsuario guiusuario;


   
}
