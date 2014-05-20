package realisering;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author payamkhatibnia
 */
public class KunskapsDoman extends javax.swing.JFrame {
private InfDB db;
    /**
     * Creates new form KunskapsDoman
     */
    public KunskapsDoman() {
        initComponents();
        
        try
    
        {
            db = new InfDB("C:\\Users\\Andreas\\Desktop\\MICEDB.fdb");
            
        }catch (InfException e){}
        fyllCombo();
        setTextUBenamning();
        setTextUBeskrivning();
    }
    private void setTextUBenamning()
    {
        tfUBenamning.setText(comboBoxKunskap.getSelectedItem().toString());
    }
    private void setTextUBeskrivning()
    {
        String besk = "";
        try{
            besk = db.fetchSingle("select beskrivning from KOMPETENSDOMAN where benamning = '"+comboBoxKunskap.getSelectedItem().toString()+"'");
        }catch(InfException e){}
        tfAreaBesk.setText(besk);
    }
    private void fyllCombo()
    {
        
        ArrayList<String> a1 = null;
        try{
            a1 = db.fetchColumn("select benamning from KOMPETENSDOMAN ");
        }catch(InfException e){}
        if(a1 != null){
        for(int i = 0; i < a1.size(); i++){
           System.out.print("Hej");
                comboBoxKunskap.addItem(a1.get(i));
           
        }}
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUBenamning = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        KunskapsDoman_laggTill = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboBoxKunskap = new javax.swing.JComboBox();
        btnKompetens = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnSpelOPro = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Benamning = new javax.swing.JTextField();
        txt_Beskrivning = new javax.swing.JTextField();
        btnAnstalld = new javax.swing.JButton();
        btnSpelut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAreaBesk = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Benamning");

        KunskapsDoman_laggTill.setText("Lägg till");
        KunskapsDoman_laggTill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KunskapsDoman_laggTillMouseClicked(evt);
            }
        });

        jLabel9.setText("UPPDATERA KUNSKAPSDOMÄN");

        comboBoxKunskap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxKunskapItemStateChanged(evt);
            }
        });

        btnKompetens.setText("Kompetensdomän");
        btnKompetens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKompetensMouseClicked(evt);
            }
        });

        jButton8.setText("Uppdatera");

        btnSpelOPro.setText("Spel & projekt");
        btnSpelOPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSpelOProMouseClicked(evt);
            }
        });

        jButton5.setText("Logga ut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Benamning");

        jLabel2.setText("Beskrivning");

        jLabel4.setText("LÄGG TILL KOMPETENSDÄN");

        btnAnstalld.setText("Anställd");
        btnAnstalld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnstalldMouseClicked(evt);
            }
        });

        btnSpelut.setText("Spelutveckling");
        btnSpelut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSpelutMouseClicked(evt);
            }
        });

        jLabel5.setText("Beskrivning");

        tfAreaBesk.setColumns(20);
        tfAreaBesk.setLineWrap(true);
        tfAreaBesk.setRows(5);
        jScrollPane1.setViewportView(tfAreaBesk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Beskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Benamning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(KunskapsDoman_laggTill))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(50, 50, 50)
                                .addComponent(tfUBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(comboBoxKunskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1))))
                    .addComponent(jLabel4))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKompetens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpelOPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpelut, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnstalld)
                    .addComponent(btnKompetens)
                    .addComponent(btnSpelOPro)
                    .addComponent(btnSpelut))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxKunskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_Benamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(tfUBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Beskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(KunskapsDoman_laggTill))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnAnstalldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnstalldMouseClicked
        this.dispose();
        AnstalldPanel panel = new AnstalldPanel();
        panel.setVisible(true);
    }//GEN-LAST:event_btnAnstalldMouseClicked

    private void KunskapsDoman_laggTillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KunskapsDoman_laggTillMouseClicked

        try
     
{    
        
        String sqlFraga = "INSERT INTO KOMPETENSDOMAN VALUES(" + db.getAutoIncrement("KOMPETENSDOMAN", "kid") +
                ",'" + txt_Benamning.getText() + "', '" +
                txt_Beskrivning.getText() +"')";
        
        System.out.println(sqlFraga);

db.insert(sqlFraga);

}

catch(InfException e)
{
    
}




    }//GEN-LAST:event_KunskapsDoman_laggTillMouseClicked

    private void btnKompetensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKompetensMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKompetensMouseClicked

    private void btnSpelOProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpelOProMouseClicked
        this.dispose();
        SpelProjekt panel = new SpelProjekt();
        panel.setVisible(true);
    }//GEN-LAST:event_btnSpelOProMouseClicked

    private void btnSpelutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpelutMouseClicked
          this.dispose();
        Spelutvecklingsprojekt panel = new Spelutvecklingsprojekt();
        panel.setVisible(true);
                                  
    }//GEN-LAST:event_btnSpelutMouseClicked

    private void comboBoxKunskapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxKunskapItemStateChanged
        setTextUBenamning();
        setTextUBeskrivning();
    }//GEN-LAST:event_comboBoxKunskapItemStateChanged

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
            java.util.logging.Logger.getLogger(KunskapsDoman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KunskapsDoman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KunskapsDoman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KunskapsDoman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KunskapsDoman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KunskapsDoman_laggTill;
    private javax.swing.JButton btnAnstalld;
    private javax.swing.JButton btnKompetens;
    private javax.swing.JButton btnSpelOPro;
    private javax.swing.JButton btnSpelut;
    private javax.swing.JComboBox comboBoxKunskap;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfAreaBesk;
    private javax.swing.JTextField tfUBenamning;
    private javax.swing.JTextField txt_Benamning;
    private javax.swing.JTextField txt_Beskrivning;
    // End of variables declaration//GEN-END:variables
}
