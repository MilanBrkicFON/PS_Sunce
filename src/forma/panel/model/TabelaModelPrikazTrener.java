/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Trener;
import java.io.IOException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milan
 */
public class TabelaModelPrikazTrener extends AbstractTableModel  {

    private List<Trener> treneri;
    private final String[] naslov;

    public TabelaModelPrikazTrener(List<Trener> treneri) throws IOException, ClassNotFoundException, Exception {
        this.naslov = new String[]{"TrenerID", "Ime", "Prezime", "Datum rodjenja", "Godine rada", "Sport"};
        this.treneri = treneri;
    }

    @Override
    public String getColumnName(int column) {
        return naslov[column];
    }

    @Override
    public int getRowCount() {
        if (treneri.isEmpty()) {
            return 0;
        } else {
            return treneri.size();
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public int getColumnCount() {
        return naslov.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trener t = treneri.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return t.getTrenerID();
            case 1:
                return t.getIme();
            case 2:
                return t.getPrezime();
            case 3:
                return t.getDatumRodjenja();
            case 4:
                return t.getGodineRada();
            case 5:
                return t.getSport();
            default:
                return "N/A";

        }
    }

    public List<Trener> getTrenere() {
        return treneri;
    }

    public void setTreneri(List<Trener> treneri) {
        this.treneri = treneri;
        fireTableDataChanged();
    }

}
