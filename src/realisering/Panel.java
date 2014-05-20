package realisering;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;



/**
 *
 * @author payamkhatibnia
 */
public class Panel extends javax.swing.JFrame {
private InfDB db;
    /**
     * Creates new form NewJFrame
     */
    public Panel() {
        initComponents();        
        try
    
        {
            db = new InfDB("/Users/Shared/MICEDB.FDB");
            
        }catch (InfException e)
        {
            System.out.println("didnt work with db");
            e.printError();
        }
        fyllComboBoxAnstallda();
        
    }
    
private void fyllComboBoxAnstallda()
{
    String sqlFraga = "SELECT aid, Namn from ANSTALLD";
    try
    {
        ArrayList<HashMap<String, String>> AnstalldLista = db.fetchRows(sqlFraga);
                
                for(int i = 0; i < AnstalldLista.size(); i++)
                {
                    String a = AnstalldLista.get(i).get("AID") + "-" + AnstalldLista.get(i).get("NAMN");
                    cbTabort.addItem(a);
                    System.out.println(a);
                
                }
   
}
    catch(InfException e)
    {
    JOptionPane.showMessageDialog(null, e.getMessage());
    {

}
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panel = new javax.swing.JTabbedPane();
        pAnstalld = new javax.swing.JPanel();
        LaggTill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_namn = new javax.swing.JTextField();
        txt_telefon = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_uppdatera_telefon = new javax.swing.JTextField();
        txt_uppdatera_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboAnst = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_uppdatera_namn = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        cbTabort = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        pSpelutveckling = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_uppdatera_telefon1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_uppdatera_mail1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        LaggTill1 = new javax.swing.JButton();
        txt_namn1 = new javax.swing.JTextField();
        txt_telefon1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_mail1 = new javax.swing.JTextField();
        comboAnst1 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cbTabort1 = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_uppdatera_namn1 = new javax.swing.JTextField();
        pKompetensdoman = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfUBenamning = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_Benamning = new javax.swing.JTextField();
        KunskapsDoman_laggTill = new javax.swing.JButton();
        txt_Beskrivning = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        comboBoxKunskap = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAreaBesk = new javax.swing.JTextArea();
        pSpelprojekt = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jButton5.setText("Logga ut");

        LaggTill.setText("Lägg till");
        LaggTill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaggTillMouseClicked(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Telefon");

        jLabel3.setText("Mail");

        jLabel4.setText("NY ANSTÄLLD");

        jLabel8.setText("Namn");

        jLabel9.setText("UPPDATERA ANSTÄLLD");

        comboAnst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnstActionPerformed(evt);
            }
        });

        jButton8.setText("Uppdatera");

        jLabel5.setText("Telefon");

        jLabel6.setText("Mail");

        jButton6.setText("Ta bort");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        cbTabort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTabortMouseClicked(evt);
            }
        });

        jLabel7.setText("TA BORT ANSTÄLLD");

        javax.swing.GroupLayout pAnstalldLayout = new javax.swing.GroupLayout(pAnstalld);
        pAnstalld.setLayout(pAnstalldLayout);
        pAnstalldLayout.setHorizontalGroup(
            pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnstalldLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAnstalldLayout.createSequentialGroup()
                        .addComponent(cbTabort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pAnstalldLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pAnstalldLayout.createSequentialGroup()
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LaggTill)
                                .addGroup(pAnstalldLayout.createSequentialGroup()
                                    .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(24, 24, 24)
                                    .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_namn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(comboAnst, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8)
                                .addGroup(pAnstalldLayout.createSequentialGroup()
                                    .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(24, 24, 24)
                                    .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_uppdatera_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_uppdatera_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_uppdatera_namn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(128, 128, 128))))
        );
        pAnstalldLayout.setVerticalGroup(
            pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnstalldLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAnstalldLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAnst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_uppdatera_namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_uppdatera_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_uppdatera_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8))
                    .addGroup(pAnstalldLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LaggTill)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(pAnstalldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTabort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        panel.addTab("Anställd", pAnstalld);

        jLabel10.setText("Namn");

        jLabel11.setText("Telefon");

        jLabel12.setText("Mail");

        jLabel13.setText("Namn");

        jLabel14.setText("NY ANSTÄLLD");

        jButton7.setText("Ta bort");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        LaggTill1.setText("Lägg till");
        LaggTill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaggTill1MouseClicked(evt);
            }
        });

        jLabel15.setText("UPPDATERA ANSTÄLLD");

        comboAnst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnst1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Telefon");

        cbTabort1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTabort1MouseClicked(evt);
            }
        });

        jButton9.setText("Uppdatera");

        jLabel17.setText("Mail");

        jLabel18.setText("TA BORT ANSTÄLLD");

        javax.swing.GroupLayout pSpelutvecklingLayout = new javax.swing.GroupLayout(pSpelutveckling);
        pSpelutveckling.setLayout(pSpelutvecklingLayout);
        pSpelutvecklingLayout.setHorizontalGroup(
            pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                        .addComponent(cbTabort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LaggTill1)
                            .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(24, 24, 24)
                                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_namn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(24, 24, 24)
                                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_uppdatera_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_uppdatera_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_uppdatera_namn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addComponent(jButton9)
                            .addComponent(comboAnst1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))))
        );
        pSpelutvecklingLayout.setVerticalGroup(
            pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAnst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_uppdatera_namn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txt_uppdatera_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_uppdatera_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton9)
                        .addGap(63, 63, 63))
                    .addGroup(pSpelutvecklingLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(36, 36, 36)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_namn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(LaggTill1)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel18)
                        .addGap(25, 25, 25)
                        .addGroup(pSpelutvecklingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTabort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addGap(0, 126, Short.MAX_VALUE))))
        );

        panel.addTab("Spelutveckling", pSpelutveckling);

        jLabel19.setText("Benamning");

        jLabel20.setText("Beskrivning");

        jLabel21.setText("LÄGG TILL KOMPETENSDÄN");

        jLabel22.setText("Benamning");

        KunskapsDoman_laggTill.setText("Lägg till");
        KunskapsDoman_laggTill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KunskapsDoman_laggTillMouseClicked(evt);
            }
        });

        jLabel23.setText("UPPDATERA KUNSKAPSDOMÄN");

        comboBoxKunskap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxKunskapItemStateChanged(evt);
            }
        });
        comboBoxKunskap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxKunskapMouseClicked(evt);
            }
        });

        jLabel24.setText("Beskrivning");

        jButton10.setText("Uppdatera");

        tfAreaBesk.setColumns(20);
        tfAreaBesk.setLineWrap(true);
        tfAreaBesk.setRows(5);
        jScrollPane1.setViewportView(tfAreaBesk);

        javax.swing.GroupLayout pKompetensdomanLayout = new javax.swing.GroupLayout(pKompetensdoman);
        pKompetensdoman.setLayout(pKompetensdomanLayout);
        pKompetensdomanLayout.setHorizontalGroup(
            pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
            .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pKompetensdomanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pKompetensdomanLayout.createSequentialGroup()
                            .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pKompetensdomanLayout.createSequentialGroup()
                                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))
                                    .addGap(25, 25, 25)
                                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Beskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Benamning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(KunskapsDoman_laggTill))
                            .addGap(84, 84, 84)
                            .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pKompetensdomanLayout.createSequentialGroup()
                                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel24))
                                    .addGap(50, 50, 50)
                                    .addComponent(tfUBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel23)
                                .addComponent(comboBoxKunskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pKompetensdomanLayout.createSequentialGroup()
                                    .addComponent(jButton10)
                                    .addGap(26, 26, 26)
                                    .addComponent(jScrollPane1))))
                        .addComponent(jLabel21))
                    .addContainerGap()))
        );
        pKompetensdomanLayout.setVerticalGroup(
            pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pKompetensdomanLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel23))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboBoxKunskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_Benamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tfUBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pKompetensdomanLayout.createSequentialGroup()
                            .addGroup(pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Beskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))
                            .addGap(18, 18, 18)
                            .addComponent(KunskapsDoman_laggTill))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pKompetensdomanLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addGap(18, 18, 18)
                            .addComponent(jButton10)))
                    .addContainerGap(257, Short.MAX_VALUE)))
        );

        panel.addTab("Kompetensdoman", pKompetensdoman);

        javax.swing.GroupLayout pSpelprojektLayout = new javax.swing.GroupLayout(pSpelprojekt);
        pSpelprojekt.setLayout(pSpelprojektLayout);
        pSpelprojektLayout.setHorizontalGroup(
            pSpelprojektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        pSpelprojektLayout.setVerticalGroup(
            pSpelprojektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        panel.addTab("Spel & projekt", pSpelprojekt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel)
                .addGap(24, 24, 24)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LaggTillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaggTillMouseClicked
try
     
{
        
        String sqlFraga = "INSERT INTO ANSTALLD VALUES(" + db.getAutoIncrement("anstalld", "aid") +
                ",'" + txt_namn.getText() + "', '" +
                txt_telefon.getText() + "', '" +
                txt_mail.getText() + "')";

db.insert(sqlFraga);

}

catch(InfException e)
{
    
}
    }//GEN-LAST:event_LaggTillMouseClicked

    private void comboAnstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnstActionPerformed
fyllComboBoxAnstallda();     
    }//GEN-LAST:event_comboAnstActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void cbTabortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTabortMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabortMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void LaggTill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaggTill1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LaggTill1MouseClicked

    private void comboAnst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnst1ActionPerformed

    private void cbTabort1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTabort1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabort1MouseClicked

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

    private void comboBoxKunskapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxKunskapItemStateChanged

    }//GEN-LAST:event_comboBoxKunskapItemStateChanged

    private void comboBoxKunskapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxKunskapMouseClicked

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

    }//GEN-LAST:event_comboBoxKunskapMouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KunskapsDoman_laggTill;
    private javax.swing.JButton LaggTill;
    private javax.swing.JButton LaggTill1;
    private javax.swing.JComboBox cbTabort;
    private javax.swing.JComboBox cbTabort1;
    private javax.swing.JComboBox comboAnst;
    private javax.swing.JComboBox comboAnst1;
    private javax.swing.JComboBox comboBoxKunskap;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pAnstalld;
    private javax.swing.JPanel pKompetensdoman;
    private javax.swing.JPanel pSpelprojekt;
    private javax.swing.JPanel pSpelutveckling;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextArea tfAreaBesk;
    private javax.swing.JTextField tfUBenamning;
    private javax.swing.JTextField txt_Benamning;
    private javax.swing.JTextField txt_Beskrivning;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mail1;
    private javax.swing.JTextField txt_namn;
    private javax.swing.JTextField txt_namn1;
    private javax.swing.JTextField txt_telefon;
    private javax.swing.JTextField txt_telefon1;
    private javax.swing.JTextField txt_uppdatera_mail;
    private javax.swing.JTextField txt_uppdatera_mail1;
    private javax.swing.JTextField txt_uppdatera_namn;
    private javax.swing.JTextField txt_uppdatera_namn1;
    private javax.swing.JTextField txt_uppdatera_telefon;
    private javax.swing.JTextField txt_uppdatera_telefon1;
    // End of variables declaration//GEN-END:variables


}
