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
import javax.swing.table.AbstractTableModel;
import osluskivac.OsluskivacClanovi;
import repozitorijum.Kontroler;

/**
 *
 * @author Milan
 */
public class TabelaModelPrikazClan extends AbstractTableModel {

    private List<Clan> clanovi;
    private final String[] naslov;

    public TabelaModelPrikazClan(List<Clan> clanovi) {
        this.naslov = new String[]{"ClanID", "Ime", "Prezime", "Ime roditelja", "Datum rodjenja", "Pol", "Godina upisa", "Grad"};
        this.clanovi = clanovi;
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
            default:
                return "N/A";

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
        return false;
    }



}
