/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel;

import domen.Sport;
import domen.Trener;
import forma.UnosTrenera;
import forma.panel.model.TabelaModelPrikazIIzmenaTrener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import komunikacija.Komunikacija;
import radnaMemorija.KontrolaOsluskivac;
import request.RequestObject;
import response.ResponseObject;
import status.EnumResponseStatus;
import util.Akcije;

/**
 *
 * @author Milan
 */
public class PanelPrikazTrenera extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrikazClanova
     */
    public PanelPrikazTrenera(TableModel model) {

        initComponents();
        postaviModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelHeader = new javax.swing.JPanel();
        jBtnSave = new javax.swing.JButton();
        jBtnObrisi = new javax.swing.JButton();
        jBtnDodaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_1492201245_save.png"))); // NOI18N
        jBtnSave.setToolTipText("sacuvaj");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_delete.png"))); // NOI18N
        jBtnObrisi.setToolTipText("obrisi");
        jBtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnObrisiActionPerformed(evt);
            }
        });

        jBtnDodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/rsz_add_friend-512.png"))); // NOI18N
        jBtnDodaj.setToolTipText("dodaj clana");
        jBtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDodajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Treneri SRC Sunce");

        jButton1.setText("Izmeni");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDodajActionPerformed
        TabelaModelPrikazIIzmenaTrener model = (TabelaModelPrikazIIzmenaTrener) jTable1.getModel();

        try {
            UnosTrenera unosTrenera = new UnosTrenera(null, true);
            unosTrenera.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(PanelPrikazTrenera.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.fireTableDataChanged();
    }//GEN-LAST:event_jBtnDodajActionPerformed

    private void jBtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnObrisiActionPerformed
        TabelaModelPrikazIIzmenaTrener model = (TabelaModelPrikazIIzmenaTrener) jTable1.getModel();

        int rowSelected = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
        System.out.println("Selected row index to model: " + rowSelected);

        Trener trener = model.getTrenere().get(rowSelected);
        System.out.println(trener);
        int odg = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da obrisete trenera:\n " + trener, "Prihvatam uslove", JOptionPane.YES_NO_OPTION);

        if (odg == 0) {

            try {
                RequestObject request = new RequestObject(trener, Akcije.OBRISI_TRENERA);
                Komunikacija.vratiInstancu().posaljiZahtev(request);

                ResponseObject response = Komunikacija.vratiInstancu().procitajOdgovor();
                if (response.getStatus() == EnumResponseStatus.ERROR) {
                    throw new Exception(response.getMessage());
                }
                KontrolaOsluskivac.getInstance().obavestiSveBrisanje(trener);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Brisanje trenera", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtnObrisiActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        List<Trener> treneriIzModela = ((TabelaModelPrikazIIzmenaTrener) jTable1.getModel()).getTrenere();
        String promenjeni = "Izvrsena je promena podataka nad clanovima sa sledecim id:\n";
        try {
            RequestObject request = new RequestObject(treneriIzModela, Akcije.PROMENI_TRENERE);
            Komunikacija.vratiInstancu().posaljiZahtev(request);

            ResponseObject response = Komunikacija.vratiInstancu().procitajOdgovor();
            if (response.getStatus() == EnumResponseStatus.ERROR) {
                throw new Exception(response.getMessage());
            }
            List<Trener> promenjeniTreneri = (List<Trener>) response.getObject();
            for (Trener clan : promenjeniTreneri) {
                promenjeni += "- " + clan.getTrenerID() + '\n';
            }
            JOptionPane.showMessageDialog(this, promenjeni);
            TabelaModelPrikazIIzmenaTrener model = (TabelaModelPrikazIIzmenaTrener) jTable1.getModel();
            model.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setEnabled(true);
        jTable1.setModel(jTable1.getModel());
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getHeader() {
        return jPanelHeader;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDodaj;
    private javax.swing.JButton jBtnObrisi;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void postaviModel(TableModel model) {
        try {
            jTable1.setEnabled(false);
            jTable1.setModel(model);

            TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();

            int columnIndexToSort = 0;
            sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

            sorter.setSortKeys(sortKeys);
            sorter.sort();

            RequestObject requestObj = new RequestObject();
            requestObj.setAction(Akcije.VRATI_SVA_SPORTOVE);
            Komunikacija.vratiInstancu().posaljiZahtev(requestObj);

            ResponseObject response = Komunikacija.vratiInstancu().procitajOdgovor();
            List<Sport> sportovi = (List<Sport>) response.getObject();

            if (!sportovi.isEmpty()) {
                JComboBox jcbSprtovi = new JComboBox<>(sportovi.toArray());
                TableColumnModel tcm = jTable1.getColumnModel();
                TableColumn tc = tcm.getColumn(5);
                tc.setCellEditor(new DefaultCellEditor(jcbSprtovi));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

}
