/*//System
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSITools;

import java.awt.Color;
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
import javax.swing.JProgressBar;

/**
 *
 * @author HereIAm
 */



public class FINAL extends javax.swing.JFrame {

    public int column;
    //public  String[] FileName=new String[100];
    public int[] id=new int [100];
    public File[] cfiles=new File[100];
    double[] sin=new double[100];
    public void setOff()
    {
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
        but4.setVisible(false);
        but5.setVisible(false);
        but6.setVisible(false);
        but7.setVisible(false);
        but8.setVisible(false);
        but9.setVisible(false);
        but10.setVisible(false);
        
        pro1.setVisible(false);
        pro2.setVisible(false);
        pro3.setVisible(false);
        pro4.setVisible(false);
        pro5.setVisible(false);
        pro6.setVisible(false);
        pro7.setVisible(false);
        pro8.setVisible(false);
        pro9.setVisible(false);
        pro10.setVisible(false);
        
    }
    public void showme()
    {
        if(column>=1)
        {
            but1.setVisible(true);
            but1.setText(cfiles[id[0]].getName());
            
            pro1.setVisible(true);
            pro1.setStringPainted(true);
            int temp=(int)(sin[0]*100);
            if(sin[0]>0)
                pro1.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro1.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro1.setValue(temp);
            
            
        }
        if(column>=2)
        {
            but2.setVisible(true);
            but2.setText(cfiles[id[1]].getName());
            
            pro2.setVisible(true);
            pro2.setStringPainted(true);
            int temp=(int)(sin[1]*100);
            if(sin[1]>0)
                pro2.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro2.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro2.setValue(temp);
            
            
        }
        if(column>=3)
        {
            but3.setVisible(true);
            but3.setText(cfiles[id[2]].getName());
            
            pro3.setVisible(true);
            pro3.setStringPainted(true);
            int temp=(int)(sin[2]*100);
            if(sin[2]>0)
                pro3.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro3.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro3.setValue(temp);
            
            
        }
        if(column>=4)
        {
            but4.setVisible(true);
            but4.setText(cfiles[id[3]].getName());
            
            pro4.setVisible(true);
            pro4.setStringPainted(true);
            int temp=(int)(sin[3]*100);
            if(sin[3]>0)
                pro4.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro4.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro4.setValue(temp);
            
            
        }
        if(column>=5)
        {
            but5.setVisible(true);
            but5.setText(cfiles[id[4]].getName());
            
            pro5.setVisible(true);
            pro5.setStringPainted(true);
            int temp=(int)(sin[4]*100);
            if(sin[4]>0)
                pro5.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro5.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro5.setValue(temp);
            
            
        }
        if(column>=6)
        {
            but6.setVisible(true);
            but6.setText(cfiles[id[5]].getName());
            
            pro6.setVisible(true);
            pro6.setStringPainted(true);
            int temp=(int)(sin[5]*100);
            if(sin[5]>0)
                pro6.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro6.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro6.setValue(temp);
            
            
        }
        if(column>=7)
        {
            but7.setVisible(true);
            but7.setText(cfiles[id[6]].getName());
            
            pro7.setVisible(true);
            pro7.setStringPainted(true);
            int temp=(int)(sin[6]*100);
            if(sin[6]>0)
                pro7.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro7.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro7.setValue(temp);
            
            
        }
        if(column>=8)
        {
            but8.setVisible(true);
            but8.setText(cfiles[id[7]].getName());
            
            pro8.setVisible(true);
            pro8.setStringPainted(true);
            int temp=(int)(sin[7]*100);
            if(sin[7]>0)
                pro8.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro8.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro8.setValue(temp);
            
            
        }
        if(column>=9)
        {
            but9.setVisible(true);
            but9.setText(cfiles[id[8]].getName());
            
            pro9.setVisible(true);
            pro9.setStringPainted(true);
            int temp=(int)(sin[8]*100);
            if(sin[8]>0)
                pro9.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro9.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro9.setValue(temp);
            
            
        }
        if(column>=10)
        {
            but10.setVisible(true);
            but10.setText(cfiles[id[9]].getName());
            
            pro10.setVisible(true);
            pro10.setStringPainted(true);
            int temp=(int)(sin[9]*100);
            if(sin[9]>0)
                pro10.setString("Similar : "+Integer.toString(temp)+"%");
            else 
                pro10.setString("Disimilar : "+Integer.toString(temp)+"%");
            if(temp<0)temp=temp*-1;
            pro10.setValue(temp);
            
            
        }
    }
    /**
     * Creates new form FINAL
     */
    public FINAL() {
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

        but3 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but10 = new javax.swing.JButton();
        pro1 = new javax.swing.JProgressBar();
        pro3 = new javax.swing.JProgressBar();
        pro4 = new javax.swing.JProgressBar();
        pro5 = new javax.swing.JProgressBar();
        pro6 = new javax.swing.JProgressBar();
        pro7 = new javax.swing.JProgressBar();
        pro9 = new javax.swing.JProgressBar();
        pro8 = new javax.swing.JProgressBar();
        pro10 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        but2 = new javax.swing.JButton();
        pro2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(816, 531));
        setMinimumSize(new java.awt.Dimension(816, 531));
        setResizable(false);
        getContentPane().setLayout(null);

        but3.setText("jButton1");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3);
        but3.setBounds(20, 190, 123, 32);

        but1.setText("jButton1");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1);
        but1.setBounds(20, 110, 123, 32);

        but4.setText("jButton1");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4);
        but4.setBounds(20, 230, 123, 32);

        but5.setText("jButton1");
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });
        getContentPane().add(but5);
        but5.setBounds(20, 270, 123, 32);

        but6.setText("jButton1");
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });
        getContentPane().add(but6);
        but6.setBounds(20, 310, 123, 32);

        but7.setText("jButton1");
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });
        getContentPane().add(but7);
        but7.setBounds(20, 350, 123, 32);

        but8.setText("jButton1");
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });
        getContentPane().add(but8);
        but8.setBounds(20, 390, 123, 32);

        but9.setText("jButton1");
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        getContentPane().add(but9);
        but9.setBounds(20, 430, 123, 32);

        but10.setText("jButton1");
        but10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but10ActionPerformed(evt);
            }
        });
        getContentPane().add(but10);
        but10.setBounds(20, 470, 123, 32);
        getContentPane().add(pro1);
        pro1.setBounds(150, 110, 146, 32);
        getContentPane().add(pro3);
        pro3.setBounds(150, 190, 146, 32);
        getContentPane().add(pro4);
        pro4.setBounds(150, 230, 146, 32);
        getContentPane().add(pro5);
        pro5.setBounds(150, 270, 146, 32);
        getContentPane().add(pro6);
        pro6.setBounds(150, 310, 146, 32);
        getContentPane().add(pro7);
        pro7.setBounds(150, 350, 146, 32);
        getContentPane().add(pro9);
        pro9.setBounds(150, 430, 146, 32);
        getContentPane().add(pro8);
        pro8.setBounds(150, 390, 146, 32);
        getContentPane().add(pro10);
        pro10.setBounds(150, 470, 146, 32);

        Text.setColumns(20);
        Text.setFont(new java.awt.Font("Siyam Rupali", 0, 13)); // NOI18N
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(301, 110, 505, 390);

        but2.setText("jButton1");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2);
        but2.setBounds(20, 150, 123, 30);
        getContentPane().add(pro2);
        pro2.setBounds(150, 150, 146, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSITools/Capture.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
    
                    InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[0]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[1]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());// TODO add your handling code here:
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[2]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[3]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[4]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[5]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[6]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[7]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[8]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UIF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed

    private void but10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but10ActionPerformed
InputStream is = null ; 
        try {
            is = new FileInputStream(cfiles[id[9]]); // input carrier
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
        }
                    BufferedReader br = new BufferedReader( new InputStreamReader(is) );
        try {
            br = new BufferedReader( new InputStreamReader(is,"UTF-8") ); // TODO add your handling code here:
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FINAL.class.getName()).log(Level.SEVERE, null, ex);
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
        Text.setText(sb.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_but10ActionPerformed

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
            java.util.logging.Logger.getLogger(FINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FINAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINAL().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Text;
    private javax.swing.JButton but1;
    private javax.swing.JButton but10;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pro1;
    private javax.swing.JProgressBar pro10;
    private javax.swing.JProgressBar pro2;
    private javax.swing.JProgressBar pro3;
    private javax.swing.JProgressBar pro4;
    private javax.swing.JProgressBar pro5;
    private javax.swing.JProgressBar pro6;
    private javax.swing.JProgressBar pro7;
    private javax.swing.JProgressBar pro8;
    private javax.swing.JProgressBar pro9;
    // End of variables declaration//GEN-END:variables
}
//System