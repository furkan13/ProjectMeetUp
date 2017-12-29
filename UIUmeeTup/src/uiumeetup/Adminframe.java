package uiumeetup;



/**
 *
 * @author Asus
 */
public class Adminframe extends javax.swing.JFrame {

    /**
     * Creates new form Adminframe
     */
    public Adminframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADDTEACHER = new javax.swing.JButton();
        ADDSTUDENT = new javax.swing.JButton();
        DELETESTUDENT = new javax.swing.JButton();
        DELETETEACHER = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ADDTEACHER.setText("ADD TEACHER");
        ADDTEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTEACHERActionPerformed(evt);
            }
        });

        ADDSTUDENT.setText("ADD STUDENT");
        ADDSTUDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDSTUDENTActionPerformed(evt);
            }
        });

        DELETESTUDENT.setText("DELETE STUDENT");
        DELETESTUDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETESTUDENTActionPerformed(evt);
            }
        });

        DELETETEACHER.setText("DELETE TEACHER");
        DELETETEACHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETETEACHERActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DELETETEACHER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DELETESTUDENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADDTEACHER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADDSTUDENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADDSTUDENT)
                .addGap(28, 28, 28)
                .addComponent(ADDTEACHER)
                .addGap(26, 26, 26)
                .addComponent(DELETESTUDENT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(DELETETEACHER)
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDSTUDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDSTUDENTActionPerformed
        // TODO add your handling code here:
        new AddStuframe().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ADDSTUDENTActionPerformed

    private void DELETESTUDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETESTUDENTActionPerformed
        // TODO add your handling code here:
        
        new DelStuframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DELETESTUDENTActionPerformed

    private void ADDTEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTEACHERActionPerformed
        // TODO add your handling code here:
        new AddTecherframe().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ADDTEACHERActionPerformed

    private void DELETETEACHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETETEACHERActionPerformed
        // TODO add your handling code here:
        new DeleteTeacherframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DELETETEACHERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new mainmenu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDSTUDENT;
    private javax.swing.JButton ADDTEACHER;
    private javax.swing.JButton DELETESTUDENT;
    private javax.swing.JButton DELETETEACHER;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}