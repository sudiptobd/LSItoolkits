/*//System
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSITools;

import javax.swing.Icon;
import javax.swing.JFileChooser;

/**
 *
 * @author HereIAm
 */
public class MAINMENU extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MAINMENU() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        RankFiles = new javax.swing.JButton();
        SumFile = new javax.swing.JButton();
        SumWeb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(816, 531));
        setMinimumSize(new java.awt.Dimension(817, 531));
        setResizable(false);
        getContentPane().setLayout(null);

        RankFiles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RankFiles.setText("Rank Files");
        RankFiles.setMaximumSize(new java.awt.Dimension(190, 30));
        RankFiles.setMinimumSize(new java.awt.Dimension(190, 30));
        RankFiles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RankFilesMouseMoved(evt);
            }
        });
        RankFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankFilesActionPerformed(evt);
            }
        });
        getContentPane().add(RankFiles);
        RankFiles.setBounds(140, 140, 170, 180);

        SumFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SumFile.setText("Summarize File");
        SumFile.setMaximumSize(new java.awt.Dimension(190, 30));
        SumFile.setMinimumSize(new java.awt.Dimension(190, 30));
        SumFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumFileActionPerformed(evt);
            }
        });
        getContentPane().add(SumFile);
        SumFile.setBounds(330, 140, 160, 180);

        SumWeb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SumWeb.setText("Summarize URL");
        SumWeb.setPreferredSize(new java.awt.Dimension(190, 30));
        SumWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumWebActionPerformed(evt);
            }
        });
        getContentPane().add(SumWeb);
        SumWeb.setBounds(510, 140, 160, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSITools/reflect.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 330, 810, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSITools/Capture.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumWebActionPerformed
        // TODO add your handling code here:
        WEB wb=new WEB();
        wb.setVisible(true);
    }//GEN-LAST:event_SumWebActionPerformed

    private void SumFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumFileActionPerformed

        // TODO add your handling code here:
        Summery newj=new Summery();
        newj.setVisible(true);
        //this.dispose();

    }//GEN-LAST:event_SumFileActionPerformed

    private void RankFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankFilesActionPerformed

        // TODO add your handling code here:
        //jTextField1.setText("GO");

        FILES newj=new FILES();
        newj.setVisible(true);
        //this.dispose();

    }//GEN-LAST:event_RankFilesActionPerformed

    private void RankFilesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RankFilesMouseMoved
               // TODO add your handling code here:
    }//GEN-LAST:event_RankFilesMouseMoved

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
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINMENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINMENU().setVisible(true);
            }
        });
    }
    public String xx="hello";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RankFiles;
    private javax.swing.JButton SumFile;
    private javax.swing.JButton SumWeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables

    private MAINMENU MAINMENU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
