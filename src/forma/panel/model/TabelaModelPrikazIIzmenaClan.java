/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Clan;
import domen.Mesto;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;
import radnaMemorija.Memory;
import request.RequestObject;
import response.ResponseObject;
import status.EnumResponseStatus;
import util.Akcije;
import osluskivac.OsluskivacClanovi;

/**
 *
 * @author Milan
 */
public class TabelaModelPrikazIIzmenaClan extends AbstractTableModel implements OsluskivacClanovi,Serializable {

    private List<Clan> clanovi;
    private final String[] naslov;

    public TabelaModelPrikazIIzmenaClan(List<Clan> clanovi) throws IOException, ClassNotFoundException, Exception {
        this.naslov = new String[]{"ClanID", "Ime", "Prezime", "Ime roditelja", "Datum rodjenja", "Pol", "Godina upisa", "Grad"};
        this.clanovi = clanovi;
        
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
        
        Kontroler.getInstance().addListener((OsluskivacClanovi) this);
        System.out.println("-------------------------------------------------");
                
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
            return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Clan c = clanovi.get(rowIndex);
        switch (columnIndex) {

            case 1:
                c.setPromenjen(promeniStatus(c.getIme(), aValue));
                c.setIme((String) aValue);
                break;
            case 2:
                c.setPromenjen(promeniStatus(c.getPrezime(), aValue));
                c.setPrezime((String) aValue);
               break;
            case 3:
                c.setPromenjen(promeniStatus(c.getImeRoditelja(), aValue));
                c.setImeRoditelja((String) aValue);
                break;
            case 4:
                //TO-DO
                c.setPromenjen(true);
                c.setDatumRodjenja(LocalDate.parse((CharSequence) aValue));
                break;
            case 5:
                c.setPromenjen(promeniStatus(String.valueOf(c.getPol()),aValue));
                c.setPol(((String)aValue).charAt(0));
                break;
            case 6:
                c.setPromenjen(promeniStatus(String.valueOf(c.getGodinaUpisa()),aValue));
                c.setGodinaUpisa(Integer.parseInt((String) aValue));
                break;
            case 7:
                c.setPromenjen(true);
                c.setMesto((Mesto) aValue);
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
        return columnIndex != 0;
    }

    @Override
    public void oDodajClan(Clan clan) {
        try {
            Socket socket = Memory.getInstance().getSocket();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            RequestObject requestObj = new RequestObject();
            requestObj.setAction(Akcije.VRATI_MAX_ID);
            out.writeObject(requestObj);

            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            ResponseObject responseObj = (ResponseObject) in.readObject();
            int max = (int) responseObj.getObject();
            clan.setClanID(max);
            clanovi.add(clan);
            fireTableDataChanged();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TabelaModelPrikazIIzmenaClan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void oObrisiClana(Clan clan) {
        clanovi.remove(clan);
        fireTableDataChanged();
    }

    private boolean promeniStatus(String ime, Object aValue) {
        if(!ime.equals((String) aValue)){
            fireTableDataChanged();
            return true;
        }
        return false;
    }

}
