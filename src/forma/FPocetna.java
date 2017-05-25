/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma;

import domen.Clan;
import forma.panel.PanelPrikazClanova;
import forma.panel.PanelZaPrikazTreninga;
import forma.panel.model.TabelaModelPrikazIIzmenaClan;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import radnaMemorija.Memory;
import request.RequestObject;
import response.ResponseObject;
import status.EnumResponseStatus;
import util.Akcije;

/**
 *
 * @author Milan
 */
public class FPocetna extends javax.swing.JFrame {

    private boolean statusKon = false;

    /**
     * Creates new form FPocetna
     */
    public FPocetna() throws IOException {
        try {
            setLookAndFeel();
            initComponents();
            postaviStatus();
        } catch (Exception ex) {
            Logger.getLogger(FPocetna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIkonice = new javax.swing.JPanel();
        jbtnPrikaziTrening = new javax.swing.JButton();
        jbtnPrikaziClanove = new javax.swing.JButton();
        jbtnPrikaziTrenere = new javax.swing.JButton();
        jbtnPrikaziPocetnu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        statusKonekcije = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemKreirajClana = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemKonekcijaSaBazom = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pocetna");
        setMinimumSize(new java.awt.Dimension(772, 460));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanelIkonice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jbtnPrikaziTrening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_calendar_milestones-512 (1).png"))); // NOI18N
        jbtnPrikaziTrening.setToolTipText("Prikazi treninge");
        jbtnPrikaziTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrikaziTreningActionPerformed(evt);
            }
        });

        jbtnPrikaziClanove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_crowd (1).png"))); // NOI18N
        jbtnPrikaziClanove.setToolTipText("Prikazi clanove");
        jbtnPrikaziClanove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrikaziClanoveActionPerformed(evt);
            }
        });

        jbtnPrikaziTrenere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_peoples-coach-trainer-whistle-hat-3372d5f289eaf534-64x64.png"))); // NOI18N
        jbtnPrikaziTrenere.setToolTipText("Prikazi trenere");

        jbtnPrikaziPocetnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_arrow-back-128.png"))); // NOI18N
        jbtnPrikaziPocetnu.setToolTipText("Pocetna");
        jbtnPrikaziPocetnu.setBorderPainted(false);
        jbtnPrikaziPocetnu.setOpaque(false);
        jbtnPrikaziPocetnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrikaziPocetnuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIkoniceLayout = new javax.swing.GroupLayout(jPanelIkonice);
        jPanelIkonice.setLayout(jPanelIkoniceLayout);
        jPanelIkoniceLayout.setHorizontalGroup(
            jPanelIkoniceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIkoniceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPrikaziTrening, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnPrikaziClanove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnPrikaziTrenere, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(jbtnPrikaziPocetnu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelIkoniceLayout.setVerticalGroup(
            jPanelIkoniceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIkoniceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIkoniceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnPrikaziClanove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPrikaziTrening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPrikaziPocetnu)
                    .addComponent(jbtnPrikaziTrenere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelIkonice, java.awt.BorderLayout.NORTH);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(jPanel2);
        jLabel1.setText("Sportsko-rekreativni klub \"Sunce\"");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel2.setText("Status:");

        statusKonekcije.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_sun2.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusKonekcije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusKonekcije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItemKreirajClana.setText("Kreiraj clana");
        jMenuItemKreirajClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajClanaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemKreirajClana);
        jMenu1.add(jSeparator1);

        jMenuItemKonekcijaSaBazom.setText("Konekcija sa bazom");
        jMenuItemKonekcijaSaBazom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKonekcijaSaBazomActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemKonekcijaSaBazom);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKreirajClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajClanaActionPerformed
        UnosClana jd;
        try {
            jd = new UnosClana(this, true);
            jd.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Unos clana error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItemKreirajClanaActionPerformed

    private void jbtnPrikaziTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrikaziTreningActionPerformed
        vratiNaPocetnu();
        try {
            JPanel panel = new PanelZaPrikazTreninga();
            jPanel2.setVisible(false);
            getContentPane().add(panel);
            panel.setVisible(true);
            //pack();
        } catch (Exception ex) {
            Logger.getLogger(FPocetna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPrikaziTreningActionPerformed

    private void jbtnPrikaziPocetnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrikaziPocetnuActionPerformed
        vratiNaPocetnu();
    }//GEN-LAST:event_jbtnPrikaziPocetnuActionPerformed

    private void vratiNaPocetnu() {
        BorderLayout layout = (BorderLayout) getContentPane().getLayout();
        layout.getLayoutComponent(BorderLayout.CENTER).setVisible(false);
        layout.addLayoutComponent(jPanel2, BorderLayout.CENTER);
        jPanel2.setVisible(true);

    }
    private void jMenuItemKonekcijaSaBazomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKonekcijaSaBazomActionPerformed
        try {
            JDialogUnosParametraZaBazu unosZaBazu = new JDialogUnosParametraZaBazu(null, true);
            unosZaBazu.setVisible(true);
            postaviStatus();
        } catch (Exception ex) {
            Logger.getLogger(FPocetna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemKonekcijaSaBazomActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jbtnPrikaziClanoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrikaziClanoveActionPerformed
        vratiNaPocetnu();
        try {
            ObjectOutputStream out;
            ObjectInputStream in;
            Socket socket = Memory.getInstance().getSocket();
            out = new ObjectOutputStream(socket.getOutputStream());

            RequestObject request = new RequestObject();
            request.setAction(Akcije.VRATI_SVE_CLANOVE);
            out.writeObject(request);

            in = new ObjectInputStream(socket.getInputStream());
            ResponseObject response = (ResponseObject) in.readObject();
            
            if (response.getStatus() == EnumResponseStatus.OK) {
                List<Clan> clanovi = (List<Clan>) response.getObject();
                TabelaModelPrikazIIzmenaClan model = new TabelaModelPrikazIIzmenaClan(clanovi);
                JPanel panel = new PanelPrikazClanova(model);
                jPanel2.setVisible(false);
                getContentPane().add(panel);
                panel.setVisible(true);
            } else {
                throw new Exception(response.getMessage());
            }
            // pack();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnPrikaziClanoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemKonekcijaSaBazom;
    private javax.swing.JMenuItem jMenuItemKreirajClana;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelIkonice;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbtnPrikaziClanove;
    private javax.swing.JButton jbtnPrikaziPocetnu;
    private javax.swing.JButton jbtnPrikaziTrenere;
    private javax.swing.JButton jbtnPrikaziTrening;
    private javax.swing.JLabel statusKonekcije;
    // End of variables declaration//GEN-END:variables

    private void setLookAndFeel() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

    }

    private void postaviStatus() throws Exception {
        ObjectOutputStream out;
        ObjectInputStream in;
        try {
            Socket socket = Memory.getInstance().getSocket();
            out = new ObjectOutputStream(socket.getOutputStream());

            RequestObject request = new RequestObject();
            request.setAction(Akcije.USPOSTAVI_KONEKCIJU_NA_BAZU);

            out.writeObject(request);
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());
            ResponseObject response = (ResponseObject) in.readObject();

            if (response.getStatus() == EnumResponseStatus.OK) {
                statusKonekcije.setText("Povezani ste na bazu.");
                statusKonekcije.setForeground(new Color(0, 153, 51));
            } else {
                statusKonekcije.setText("Niste povezani na bazu. (File -> Konekcija sa bazom)");
                statusKonekcije.setForeground(Color.red);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            statusKonekcije.setText("Niste povezani na bazu. (File -> Konekcija sa bazom)");
            statusKonekcije.setForeground(Color.red);
        }

    }

}
