/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Sport;
import domen.Trener;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import komunikacija.Komunikacija;
import osluskivac.OsluskivacTreneri;
import radnaMemorija.KontrolaOsluskivac;
import request.RequestObject;
import response.ResponseObject;
import util.Akcije;

/**
 *
 * @author Milan
 */
public class TabelaModelPrikazIIzmenaTrener extends AbstractTableModel implements OsluskivacTreneri, Serializable {

    private List<Trener> treneri;
    private final String[] naslov;

    public TabelaModelPrikazIIzmenaTrener(List<Trener> treneri) throws IOException, ClassNotFoundException, Exception {
        this.naslov = new String[]{"TrenerID", "Ime", "Prezime", "Datum rodjenja", "Godine rada", "Sport"};
        this.treneri = treneri;
        KontrolaOsluskivac.getInstance().addListener(this);
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
        return columnIndex != 0;
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

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Trener t = treneri.get(rowIndex);
        switch (columnIndex) {

            case 1:
                t.setPromenjen(promeniStatus(t.getIme(), aValue));
                t.setIme((String) aValue);
                break;
            case 2:
                t.setPromenjen(promeniStatus(t.getPrezime(), aValue));
                t.setPrezime((String) aValue);
                break;
            case 3:
                t.setPromenjen(promeniStatus(t.getDatumRodjenja(), aValue));
                t.setDatumRodjenja(LocalDate.parse((CharSequence) aValue));
                break;
            case 4:
                t.setPromenjen(true);
                t.setGodineRada(Integer.parseInt((String) aValue));
                break;
            case 5:
                t.setPromenjen(promeniStatus(t.getSport(),aValue));
                t.setSport(((Sport) aValue));
                break;
        }
        fireTableChanged(new TableModelEvent(this));
    }

    public List<Trener> getTrenere() {
        return treneri;
    }

    public void setTreneri(List<Trener> treneri) {
        this.treneri = treneri;
        fireTableDataChanged();
    }

    private boolean promeniStatus(Object ime, Object aValue) {
        if (!ime.equals(aValue)) {
            fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public void oDodajTrenera(Trener trener) {
        try {
            RequestObject requestObj = new RequestObject();
            requestObj.setAction(Akcije.VRATI_MAX_ID_TRENER);
            Komunikacija.vratiInstancu().posaljiZahtev(requestObj);

            ResponseObject responseObj = Komunikacija.vratiInstancu().procitajOdgovor();
            int max = (int) responseObj.getObject();

            trener.setTrenerID(max);

            treneri.add(trener);
            fireTableDataChanged();

        } catch (IOException ex) {
            Logger.getLogger(TabelaModelPrikazIIzmenaTrener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TabelaModelPrikazIIzmenaTrener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void oObrisiTrenera(Trener trener) {
        treneri.remove(trener);
        fireTableDataChanged();
    }

}
