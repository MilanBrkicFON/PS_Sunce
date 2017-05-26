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
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;
import osluskivac.OsluskivacClanovi;
import osluskivac.OsluskivacTreneri;

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

//        Socket s = Memory.getInstance().getSocket();
//        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
//        RequestObject req = new RequestObject(this, Akcije.POSTAVI_OSLUSKIVACA); //imao sam problem da posaljem objekat tipa OsluskivacClanovi!
//        out.writeObject(req);                                                       
//        out.flush();
//        
//        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
//        ResponseObject r = (ResponseObject) in.readObject();
//        if(r.getStatus() == EnumResponseStatus.ERROR){
//            throw new Exception(r.getMessage());
//        }
        //Kontroler.getInstance().addListener((OsluskivacClanovi) this);
        System.out.println("-------------------------------------------------");

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
    public int getColumnCount() {
        return naslov.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
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
//                t.setPromenjen(promeniStatus(t.getIme(), aValue));
                t.setIme((String) aValue);
                break;
            case 2:
//                t.setPromenjen(promeniStatus(t.getPrezime(), aValue));
                t.setPrezime((String) aValue);
                break;
            case 3:
//                t.setPromenjen(promeniStatus(t.getImeRoditelja(), aValue));
                t.setDatumRodjenja(LocalDate.parse((CharSequence) aValue));
                break;
            case 4:
//                t.setPromenjen(true);
                t.setGodineRada(Integer.parseInt((String) aValue));
                break;
            case 5:
//                t.setPromenjen(promeniStatus(String.valueOf(t.getPol()),aValue));
                t.setSport(((Sport) aValue));
                break;
        }

    }

    public List<Trener> getTrenere() {
        return treneri;
    }

    public void setTreneri(List<Trener> treneri) {
        this.treneri = treneri;
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    private boolean promeniStatus(String ime, Object aValue) {
        if (!ime.equals((String) aValue)) {
            fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public void oDodajTrenera(Trener trener) {
        treneri.add(trener);
        fireTableDataChanged();
    }

    @Override
    public void oObrisiTrenera(Trener trener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
