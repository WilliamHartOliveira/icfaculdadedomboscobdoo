/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUICadastroEquipamento.java
 *
 * Created on 03/08/2010, 23:34:14
 */

package ic.faculdadedombosco.visao.gui;


import ic.faculdadedombosco.Equipamento;
import ic.faculdadedombosco.Persistencia;
import java.awt.Dimension;

/**
 *
 * @author Anderson
 */
public class GUIEquipamento extends javax.swing.JInternalFrame {

    Equipamento equip;
    Persistencia pers;

    /** Creates new form GUICadastroEquipamento */
    public GUIEquipamento() {
        initComponents();
    }

     public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        //this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setClosable(true);
        setResizable(true);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed

        equip = new Equipamento();

        equip.setCd_equipamento(tfCodigo.getText());
        equip.setDs_equipamento(tfDescricao.getText());
       // equip.setSt_equipamento(cbStatus.getSelectedIndex());
        

        pers.Salvar(equip);
            
    }//GEN-LAST:event_bSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JCheckBox jcbRede;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lUtilizaRede;
    private javax.swing.JPanel pDadosEquipamentos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    // End of variables declaration//GEN-END:variables

}
