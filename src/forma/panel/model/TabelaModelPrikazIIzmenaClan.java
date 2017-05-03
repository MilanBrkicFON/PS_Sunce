/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Clan;
import domen.Mesto;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import osluskivac.OsluskivacClanovi;
import repozitorijum.Kontroler;

/**
 *
 * @author Milan
 */
public class TabelaModelPrikazIIzmenaClan extends AbstractTableModel implements OsluskivacClanovi, TableModelListener {

    private List<Clan> clanovi;
    private final String[] naslov;
    private boolean promenjen = false;

    public TabelaModelPrikazIIzmenaClan(List<Clan> clanovi) {
        this.naslov = new String[]{"ClanID", "Ime", "Prezime", "Ime roditelja", "Datum rodjenja", "Pol", "Godina upisa", "Grad", "Promenjen"};
        this.clanovi = clanovi;
        addTableModelListener(this);
        Kontroler.getInstance().addListener((OsluskivacClanovi) this);
    }

    @Override
    public String getColumnName(int column) {
        return naslov[column];
    }

    @Override
    public int getRowCount() {
        if (clanovi.isEmpty()) {
            return 0;
        } else {
            return clanovi.size();
        }
    }

    @Override
    public int getColumnCount() {
        return naslov.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 8) {
            return Boolean.class;
        } else {
            return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan c = clanovi.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return c.getClanID();
            case 1:
                return c.getIme();
            case 2:
                return c.getPrezime();
            case 3:
                return c.getImeRoditelja();
            case 4:
                return c.getDatumRodjenja();
            case 5:
                return c.getPol();
            case 6:
                return c.getGodinaUpisa();
            case 7:
                return c.getMesto().getNaziv();
            case 8:
                return c.isPromenjen();
            default:
                return "N/A";

        }
    }
    int row = 0;

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Clan c = clanovi.get(rowIndex);
        switch (columnIndex) {
            
            case 1:
                c.setIme((String) aValue);
                c.setPromenjen(true);
                fireTableRowsUpdated(rowIndex, rowIndex);
                break;
            case 2:
                c.setPrezime((String) aValue);
                c.setPromenjen(true);
                 fireTableRowsUpdated(rowIndex, rowIndex);
                break;
            case 3:
                c.setImeRoditelja((String) aValue);
                c.setPromenjen(true);
                 fireTableRowsUpdated(rowIndex, rowIndex);
                break;
            case 4:
                c.setDatumRodjenja(LocalDate.parse((CharSequence) aValue));
                c.setPromenjen(true);
                break;
            case 5:
                c.setPol((char) aValue);
                c.setPromenjen(true);
                break;
            case 6:
                c.setGodinaUpisa((int) aValue);
                c.setPromenjen(true);
                break;
            case 7:
                c.setMesto((Mesto) aValue);
                c.setPromenjen(true);
                break;
            case 8:
                break;
        }

    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0 && columnIndex != 8;
    }

    @Override
    public void oDodajClana(Clan clan) {
        try {
            clan.setClanID(Kontroler.getInstance().vratiMaxId());
            clanovi.add(clan);
            fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(TabelaModelPrikazIIzmenaClan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void oObrisiClana(Clan clan) {
        clanovi.remove(clan);
        fireTableDataChanged();
    }
    private String upit ="UPDATE clan SET ";
    
    @Override
    public void tableChanged(TableModelEvent e) {
        
        //TO-DO
        
        System.out.println("DESILA SE PROMENA!");
        int firstRow = e.getFirstRow();
        int lastRow = e.getLastRow();
        int index = e.getColumn();
        switch (e.getType()) {
            case TableModelEvent.INSERT:
                for (int i = firstRow; i <= lastRow; i++) {
                    System.out.println(i);
                }
                break;
            case TableModelEvent.UPDATE:
                if (firstRow == TableModelEvent.HEADER_ROW) {
                    if (index == TableModelEvent.ALL_COLUMNS) {
                        System.out.println("A column was added");
                    } else {
                        System.out.println(index + "in header changed");
                    }
                } else {
                    System.out.println("column: "+ index);
                    upit += getColumnName(index) +"="+ getValueAt(firstRow, index);
                    System.out.println(upit);
                }
                break;
            case TableModelEvent.DELETE:
                for (int i = firstRow; i <= lastRow; i++) {
                    System.out.println(i);
                }
                break;
        }
    }
}
