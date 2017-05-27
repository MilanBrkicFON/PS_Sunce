/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import domen.Sport;
import domen.Trener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import radnaMemorija.KontrolaOsluskivac;
import radnaMemorija.Memory;
import request.RequestObject;
import response.ResponseObject;
import util.Akcije;
import utilFileChooser.UtilExtension;

/**
 *
 * @author Milan
 */
public class UnosTrenera extends javax.swing.JDialog {

    /**
     * Creates new form UnosClana
     */
    public UnosTrenera(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);

        initComponents();
        postaviNazive();
        postaviOsluskivace();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        panelZaUnosIme = new forma.panel.panelZaUnos();
        panelZaUnosPrezime = new forma.panel.panelZaUnos();
        panelZaUnosDatumaRodjenja = new forma.panel.panelZaUnos();
        PanelGodineRada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerGodRada = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSport = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanelCV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaCV = new javax.swing.JTextArea();
        jbtnDodajCvKrozFajl = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtnSacuvaj = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unos clana");
        setMinimumSize(new java.awt.Dimension(513, 510));

        MainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Trener"));

        jLabel1.setText("Godine rada: ");

        jSpinnerGodRada.setModel(new javax.swing.SpinnerNumberModel());

        jLabel3.setText("* Sport: ");

        javax.swing.GroupLayout PanelGodineRadaLayout = new javax.swing.GroupLayout(PanelGodineRada);
        PanelGodineRada.setLayout(PanelGodineRadaLayout);
        PanelGodineRadaLayout.setHorizontalGroup(
            PanelGodineRadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGodineRadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerGodRada, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelGodineRadaLayout.setVerticalGroup(
            PanelGodineRadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGodineRadaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelGodineRadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerGodRada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGodineRadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Kratka biografija (max. 1000 karaktera): ");

        jTxtAreaCV.setColumns(20);
        jTxtAreaCV.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaCV);

        jbtnDodajCvKrozFajl.setText("Dodaj kao fajl");
        jbtnDodajCvKrozFajl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajCvKrozFajlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCVLayout = new javax.swing.GroupLayout(jPanelCV);
        jPanelCV.setLayout(jPanelCVLayout);
        jPanelCVLayout.setHorizontalGroup(
            jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCVLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDodajCvKrozFajl))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelCVLayout.setVerticalGroup(
            jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnDodajCvKrozFajl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBtnSacuvaj.setText("Sacuvaj");
        jBtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSacuvaj)
                .addGap(226, 226, 226))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSacuvaj)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelZaUnosPrezime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(panelZaUnosDatumaRodjenja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelGodineRada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelZaUnosIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(panelZaUnosIme, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelZaUnosPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelZaUnosDatumaRodjenja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelGodineRada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSacuvajActionPerformed
        panelZaUnosIme.getjPanel1().setBorder(null);
        panelZaUnosPrezime.getjPanel1().setBorder(null);
        panelZaUnosDatumaRodjenja.getjPanel1().setBorder(null);
        if (izvrsiProveru() & datumskaProvera()) {

            ObjectOutputStream out = null;
            try {
                String ime = panelZaUnosIme.getJtxtFieldText();
                String prezime = panelZaUnosPrezime.getJtxtFieldText();
                String datumRodj = panelZaUnosDatumaRodjenja.getJtxtFieldText();
                int godinaRada = (int) jSpinnerGodRada.getValue();
                System.out.println("GODINA: " + datumRodj.toUpperCase());
                
                LocalDate ld = LocalDate.parse(datumRodj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                
                String cv = jTxtAreaCV.getText();
                Sport sport = (Sport) jComboBoxSport.getSelectedItem();

                Trener trener = new Trener(ime, prezime, ld, godinaRada, cv, sport);

                Socket socket = Memory.getInstance().getSocket();
                out = new ObjectOutputStream(socket.getOutputStream());

                RequestObject requestObj = new RequestObject();
                requestObj.setAction(Akcije.UBACI_TRENERA);
                requestObj.setObject(trener);

                out.writeObject(requestObj);

                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ResponseObject responseObj = (ResponseObject) in.readObject();

                if (responseObj.getStatus() == status.EnumResponseStatus.OK) {
                    JOptionPane.showMessageDialog(this, "Uspešno ste dodali trenera.");
                    KontrolaOsluskivac.getInstance().obavestiSveDodavanje(trener);//obavestava sve osluskivace da je novi trener dodat!
                    int i = JOptionPane.showConfirmDialog(this, "Da li želite da dodate još trenera?");
                    if (i == 1) {
                        this.setVisible(false);
                    }
                    if (i == 0) {
                        restartujPolja();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, responseObj.getMessage(), "Ubacivanje trenera", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(UnosTrenera.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UnosTrenera.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Popuni prazna polja");

        }

    }//GEN-LAST:event_jBtnSacuvajActionPerformed

    private void jbtnDodajCvKrozFajlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajCvKrozFajlActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return false;
                }

                String extension = UtilExtension.getExtension(f);

                if (extension != null) {
                    if (extension.equalsIgnoreCase(UtilExtension.txt)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }

            @Override
            public String getDescription() {
                return ".txt";
            }
        });

        int akcija = fileChooser.showOpenDialog(this);

        if (akcija == JFileChooser.APPROVE_OPTION) {
            BufferedReader br = null;
            try {
                File file = fileChooser.getSelectedFile();
                br = new BufferedReader(new FileReader(file));
                String line;
                String fullText ="";
                while ((line = br.readLine()) != null) {
                    fullText = fullText.concat(line + '\n');
                }
                
                if (fullText.length() > 1000) {
                    throw new Exception("Biografija je duza od 1000 karaktera. Molimo vas da prosledite kracu verziju biografije.");
                }
                
                jTxtAreaCV.append(fullText);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Fajl nije pronadjen", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Fajl nije pronadjen", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(this, ex.getMessage(), "Fajl nije pronadjen", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(UnosTrenera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jbtnDodajCvKrozFajlActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelGodineRada;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBtnSacuvaj;
    private javax.swing.JComboBox<Sport> jComboBoxSport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerGodRada;
    private javax.swing.JTextArea jTxtAreaCV;
    private javax.swing.JButton jbtnDodajCvKrozFajl;
    private forma.panel.panelZaUnos panelZaUnosDatumaRodjenja;
    private forma.panel.panelZaUnos panelZaUnosIme;
    private forma.panel.panelZaUnos panelZaUnosPrezime;
    // End of variables declaration//GEN-END:variables

    private void postaviNazive() throws Exception {
        panelZaUnosIme.setLabelaNaziv("* Ime: ");
        panelZaUnosIme.setLabelaError("");

        panelZaUnosPrezime.setLabelaNaziv("* Prezime: ");
        panelZaUnosPrezime.setLabelaError("");

        panelZaUnosDatumaRodjenja.setLabelaNaziv("* Datum rodjenja: ");
        panelZaUnosDatumaRodjenja.getJtxtField().setText("format: dd-mm-yyyy");
        panelZaUnosDatumaRodjenja.getJtxtField().setToolTipText("dd-MM-yyyy");
        panelZaUnosDatumaRodjenja.setLabelaError("");

        panelZaUnosDatumaRodjenja.getJtxtField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                panelZaUnosDatumaRodjenja.getJtxtField().setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        SpinnerNumberModel model = (SpinnerNumberModel) jSpinnerGodRada.getModel();
        model.setMaximum(60);
        model.setMinimum(0);
        jTxtAreaCV.setLineWrap(true);
        jTxtAreaCV.setWrapStyleWord(true);
        popuniCombo();
    }

    private boolean izvrsiProveru() {
        //postaviNazive();
        return panelZaUnosIme.proveri()
                & panelZaUnosPrezime.proveri()
                & panelZaUnosDatumaRodjenja.proveri();
    }
    //nije thread safe
    final SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

    private boolean datumskaProvera() {
        String datum = panelZaUnosDatumaRodjenja.getJtxtFieldText();
        try {
            if (!datum.matches("\\d{2}-\\d{2}-\\d{4}")) {
                throw new Exception("Format datuma je dd-mm-yyyy (ex. 01-01-2010)");
            }
            int god = Integer.parseInt(datum.substring(6));
            if (god > LocalDate.now().getYear() - 21) {
                throw new Exception("Trener mora da ima preko 21 godinu.");
            }
            format.setLenient(false);
            format.parse(datum);
            return true;
            //return datum.matches("\\d{2}-\\d{2}-\\d{4}");
        } catch (Exception ex) {
            panelZaUnosDatumaRodjenja.setLabelaError(ex.getMessage());
            return false;
        }
    }

    private void restartujPolja() {
        panelZaUnosIme.getJtxtField().setText(null);
        panelZaUnosPrezime.getJtxtField().setText(null);
        panelZaUnosDatumaRodjenja.getJtxtField().setText(null);
        jTxtAreaCV.setText("");
        jSpinnerGodRada.getModel().setValue(0);
    }

    private void popuniCombo() throws Exception {
        try {
            Socket socket = Memory.getInstance().getSocket();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            RequestObject requestObj = new RequestObject();
            requestObj.setAction(Akcije.VRATI_SVA_SPORTOVE);
            out.writeObject(requestObj);

            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            ResponseObject responseObj = (ResponseObject) in.readObject();
            List<Sport> sportovi = (List<Sport>) responseObj.getObject();
            jComboBoxSport.removeAllItems();
            //jComboBoxSport.setModel(new DefaultComboBoxModel<>());

            //Kontroler.getInstance().vratiMesta(mesta);
            sportovi.stream().forEach((s) -> {
                jComboBoxSport.addItem(s);
            });
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage() + "\nSistem ne moze da otvori formu za unos.", "Greska combo box", JOptionPane.ERROR_MESSAGE);

            throw new Exception("\nSistem ne moze da otvori formu za unos.");
        }

    }

//    private void obavestiSveListeners(Clan clan) {
//        for (OsluskivacClanovi lisstener : listeners) {
//            listener.oDodajClana(clan);
//        }
//    }
    private void postaviOsluskivace() {
        panelZaUnosIme.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelZaUnosPrezime.getJtxtField().requestFocus();
            }
        });
        panelZaUnosPrezime.getJtxtField().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelZaUnosDatumaRodjenja.getJtxtField().requestFocus();
            }
        });
    }

}
