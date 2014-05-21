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
            fyllComboBoxAnstallda();
            
            
        }catch (InfException e)
        {
            System.out.println("didnt work with db");
            e.printError();
        }
        
        
        
    }
    
    
    
    // Denna metod behandlar insättning i combobox av "Ta bort anställda"**/
private void fyllComboBoxAnstallda()
{
    String sqlFraga = "SELECT AID, NAMN from ANSTALLD";
    try
    {
        ArrayList<HashMap<String, String>> AnstalldLista = db.fetchRows(sqlFraga);
                cbTabort.removeAllItems();
                for(int i = 0; i < AnstalldLista.size(); i++)
                {
                    String a = AnstalldLista.get(i).get("AID") + "-" + AnstalldLista.get(i).get("NAMN");
                    cbTabort.addItem(a);
                    System.out.println(a);
                    fyllComboBoxAnstallda2(a);
                
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
        pAnstalldpanel = new javax.swing.JTabbedPane();
        Laggtill = new javax.swing.JPanel();
        txt_mail = new javax.swing.JTextField();
        LaggTill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_namn = new javax.swing.JTextField();
        txt_telefon = new javax.swing.JTextField();
        cbTabort = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        button_taBort = new javax.swing.JButton();
        UppdateraTabort = new javax.swing.JPanel();
        txt_uppdatera_telefon = new javax.swing.JTextField();
        txt_uppdatera_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combouppdatera = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_uppdatera_namn = new javax.swing.JTextField();
        Kompetens = new javax.swing.JPanel();
        Sök = new javax.swing.JPanel();
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
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jButton5.setText("Logga ut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Laggtill.setMaximumSize(new java.awt.Dimension(700, 500));
        Laggtill.setMinimumSize(new java.awt.Dimension(700, 500));

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

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

        txt_telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonActionPerformed(evt);
            }
        });

        cbTabort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTabortMouseClicked(evt);
            }
        });
        cbTabort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTabortActionPerformed(evt);
            }
        });

        jLabel7.setText("TA BORT ANSTÄLLD");

        button_taBort.setText("Ta bort");
        button_taBort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_taBortMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LaggtillLayout = new javax.swing.GroupLayout(Laggtill);
        Laggtill.setLayout(LaggtillLayout);
        LaggtillLayout.setHorizontalGroup(
            LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaggtillLayout.createSequentialGroup()
                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaggtillLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4))
                    .addGroup(LaggtillLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LaggtillLayout.createSequentialGroup()
                                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_namn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LaggTill)))
                            .addGroup(LaggtillLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(LaggtillLayout.createSequentialGroup()
                                .addComponent(cbTabort, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_taBort)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        LaggtillLayout.setVerticalGroup(
            LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaggtillLayout.createSequentialGroup()
                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaggtillLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LaggtillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbTabort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_taBort))
                    .addComponent(txt_namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LaggtillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LaggTill)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pAnstalldpanel.addTab("Lägg till/Ta bort", Laggtill);

        jLabel8.setText("Namn");

        jLabel9.setText("UPPDATERA ANSTÄLLD");

        jButton8.setText("Uppdatera");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel5.setText("Telefon");

        jLabel6.setText("Mail");

        javax.swing.GroupLayout UppdateraTabortLayout = new javax.swing.GroupLayout(UppdateraTabort);
        UppdateraTabort.setLayout(UppdateraTabortLayout);
        UppdateraTabortLayout.setHorizontalGroup(
            UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UppdateraTabortLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UppdateraTabortLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(73, 73, 73)
                        .addComponent(txt_uppdatera_namn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UppdateraTabortLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(63, 63, 63)
                        .addComponent(txt_uppdatera_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UppdateraTabortLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(84, 84, 84)
                        .addComponent(txt_uppdatera_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(combouppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UppdateraTabortLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(9, 9, 9)))
                .addGap(64, 64, 64))
        );
        UppdateraTabortLayout.setVerticalGroup(
            UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UppdateraTabortLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(combouppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UppdateraTabortLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(txt_uppdatera_namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_uppdatera_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(UppdateraTabortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_uppdatera_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UppdateraTabortLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap())
        );

        pAnstalldpanel.addTab("Uppdatera", UppdateraTabort);

        javax.swing.GroupLayout KompetensLayout = new javax.swing.GroupLayout(Kompetens);
        Kompetens.setLayout(KompetensLayout);
        KompetensLayout.setHorizontalGroup(
            KompetensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        KompetensLayout.setVerticalGroup(
            KompetensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pAnstalldpanel.addTab("Kompetens", Kompetens);

        javax.swing.GroupLayout SökLayout = new javax.swing.GroupLayout(Sök);
        Sök.setLayout(SökLayout);
        SökLayout.setHorizontalGroup(
            SökLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SökLayout.setVerticalGroup(
            SökLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pAnstalldpanel.addTab("Sök", Sök);

        panel.addTab("Anställd", pAnstalldpanel);

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

        comboAnst1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboAnst1MouseClicked(evt);
            }
        });
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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
            .addGap(0, 601, Short.MAX_VALUE)
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
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addComponent(jLabel21))
                    .addContainerGap()))
        );
        pKompetensdomanLayout.setVerticalGroup(
            pKompetensdomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panel.addTab("Kompetensdoman", pKompetensdoman);

        javax.swing.GroupLayout pSpelprojektLayout = new javax.swing.GroupLayout(pSpelprojekt);
        pSpelprojekt.setLayout(pSpelprojektLayout);
        pSpelprojektLayout.setHorizontalGroup(
            pSpelprojektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pSpelprojektLayout.setVerticalGroup(
            pSpelprojektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void comboBoxKunskapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxKunskapItemStateChanged

    }//GEN-LAST:event_comboBoxKunskapItemStateChanged

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

    private void cbTabort1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTabort1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabort1MouseClicked

    private void comboAnst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnst1ActionPerformed

    private void comboAnst1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAnst1MouseClicked

    }//GEN-LAST:event_comboAnst1MouseClicked

    private void LaggTill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaggTill1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LaggTill1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void cbTabortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTabortMouseClicked

    }//GEN-LAST:event_cbTabortMouseClicked

    private void LaggTillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaggTillMouseClicked
        try

        {

            String sqlFraga = "INSERT INTO ANSTALLD VALUES(" + db.getAutoIncrement("ANSTALLD", "AID") +
            ",'" + txt_namn.getText() + "', '" +
            txt_telefon.getText() + "', '" +
            txt_mail.getText() + "')";

            db.insert(sqlFraga);
            fyllComboBoxAnstallda();
            JOptionPane.showMessageDialog(null, "Anställd har lagts till!");

        }

        catch(InfException e)
        {

        }
    }//GEN-LAST:event_LaggTillMouseClicked

    private void button_taBortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_taBortMouseClicked

        try
        {
            String [] aid = cbTabort.getSelectedItem().toString().split("-");
            String sqlFraga = "DELETE FROM ANSTALLD WHERE AID ='"+aid[0]+"'";

            db.delete(sqlFraga);

            JOptionPane.showMessageDialog(null, "En anställd har tagits bort!");
            this.fyllComboBoxAnstallda();

        }

        catch (InfException e)
        {
        }

        
    }//GEN-LAST:event_button_taBortMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbTabortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTabortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabortActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

       }//GEN-LAST:event_jButton8MouseClicked

    private void txt_telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void fyllComboBoxAnstallda2(String namn)
    {
        combouppdatera.addItem(namn);
    }
    
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
    private javax.swing.JPanel Kompetens;
    private javax.swing.JButton KunskapsDoman_laggTill;
    private javax.swing.JButton LaggTill;
    private javax.swing.JButton LaggTill1;
    private javax.swing.JPanel Laggtill;
    private javax.swing.JPanel Sök;
    private javax.swing.JPanel UppdateraTabort;
    private javax.swing.JButton button_taBort;
    private javax.swing.JComboBox cbTabort;
    private javax.swing.JComboBox cbTabort1;
    private javax.swing.JComboBox comboAnst1;
    private javax.swing.JComboBox comboBoxKunskap;
    private javax.swing.JComboBox combouppdatera;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JTabbedPane pAnstalldpanel;
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
