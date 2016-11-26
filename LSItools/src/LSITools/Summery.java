/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSITools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HereIAm
 */
public class Summery extends javax.swing.JFrame {

    /**
     * Creates new form Summery
     */
    public Summery() {
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

        back = new javax.swing.JButton();
        button_rank = new javax.swing.JButton();
        but_ch = new javax.swing.JButton();
        text2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(816, 816));
        setMinimumSize(new java.awt.Dimension(816, 531));
        setResizable(false);
        getContentPane().setLayout(null);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 470, 107, 32);

        button_rank.setText("SUMMARIZE");
        button_rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rankActionPerformed(evt);
            }
        });
        getContentPane().add(button_rank);
        button_rank.setBounds(700, 470, 107, 31);

        but_ch.setText("Choose File");
        but_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_chActionPerformed(evt);
            }
        });
        getContentPane().add(but_ch);
        but_ch.setBounds(110, 400, 108, 37);
        getContentPane().add(text2);
        text2.setBounds(230, 400, 465, 37);

        text1.setColumns(20);
        text1.setFont(new java.awt.Font("Siyam Rupali", 0, 14)); // NOI18N
        text1.setRows(5);
        jScrollPane2.setViewportView(text1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(115, 120, 583, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSITools/Capture.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void button_rankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rankActionPerformed
        // TODO add your handling code here:

        //textf2.setText(textf.getText());
        

        /*File f =new File("ADS.txt");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FILES.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PrintWriter out = new PrintWriter("ADS.txt");
            out.println(x);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FILES.class.getName()).log(Level.SEVERE, null, ex);
        }
        File fx =new File("Query.txt");
        try {
            fx.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FILES.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PrintWriter outx=new PrintWriter("Query.txt");
            outx.println(text_query.getText());
            outx.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FILES.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        if(text2.getText().length()==0)
        JOptionPane.showMessageDialog(null, "No File Selected!");
        else
        {
            BTest bt=new BTest();
        try {
            bt.main(f);
        } catch (IOException ex) {
            Logger.getLogger(Summery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            

        }

    }//GEN-LAST:event_button_rankActionPerformed

    private void but_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_chActionPerformed
        
        // TODO add your handling code here:
        JFileChooser jch=new JFileChooser();
        jch.setCurrentDirectory(new java.io.File(""));
        jch.showOpenDialog(this);
        f=jch.getSelectedFile();
        InputStream is = null ; 
        try {
            is = new FileInputStream(f); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br=new BufferedReader(new InputStreamReader(is));
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Summery.class.getName()).log(Level.SEVERE, null, ex);
        }
                    String s; // string input variable
                    StringBuilder sb = new StringBuilder (""); // first choices of words will be stored here 
                 
        try {
            while( (s = br.readLine()) !=null )
            {
                sb.append(s);
                sb.append('\n');
            }
        } catch (IOException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        text1.setText(sb.toString());
        text2.setText(f.getAbsolutePath());
        
    }//GEN-LAST:event_but_chActionPerformed

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
            java.util.logging.Logger.getLogger(Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summery().setVisible(true);
                
            }
        });
    }

    
    private File f;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton but_ch;
    private javax.swing.JButton button_rank;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea text1;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
}
//System