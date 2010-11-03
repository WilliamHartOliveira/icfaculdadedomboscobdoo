package ic.faculdadedombosco.view;

import java.awt.Dimension;
import java.text.SimpleDateFormat;

/*
 * @author Anderson
 */

public class GUICalendario extends javax.swing.JInternalFrame {

    public GUICalendario() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcCalendar = new com.toedter.calendar.JCalendar();

        setClosable(true);
        setTitle("Calendário");
        setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calendário"));

        jcCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcCalendarMouseClicked(evt);
            }
        });
        jcCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcCalendarPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcCalendarMouseClicked
        pegarData();
    }//GEN-LAST:event_jcCalendarMouseClicked

    private void jcCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcCalendarPropertyChange
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        //String dataSetada = data.format(jcCalendar);
        //System.out.println("Data setada: "+dataSetada);
    }//GEN-LAST:event_jcCalendarPropertyChange

    String pegarData(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        String dataSetada = data.format(jcCalendar.getCalendar());
        return dataSetada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar jcCalendar;
    // End of variables declaration//GEN-END:variables

}
