/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Clan;
import domen.Trener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.List;
import javax.swing.AbstractListModel;
import osluskivac.OsluskivacClanovi;
import kontroler.Kontroler;
import radnaMemorija.Memory;
import request.RequestObject;
import response.ResponseObject;
import status.EnumResponseStatus;
import util.Akcije;

/**
 *
 * @author Milan
 */
public class ListModelClanovi extends AbstractListModel<Clan> implements OsluskivacClanovi,Serializable{

    private List<Clan> clanovi;

    public ListModelClanovi(List<Clan> clanovi) throws Exception {
        this.clanovi = clanovi;
        
//        Socket s = Memory.getInstance().getSocket();
//        
//        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
//        OsluskivacClanovi os = this;
//        RequestObject req = new RequestObject(os, Akcije.POSTAVI_OSLUSKIVACA);
//        out.writeObject(req);
//        out.flush();
//        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
//        ResponseObject r = (ResponseObject) in.readObject();
//        if(r.getStatus() == EnumResponseStatus.ERROR){
//            throw new Exception(r.getMessage());
//        }
         Kontroler.getInstance().addListener(this);
    }

    @Override
    public int getSize() {
        return clanovi == null ? 0 : clanovi.size();
    }

    @Override
    public Clan getElementAt(int index) {
        return clanovi.get(index);
    }

    public List<Clan> vratiClanoveNaTreningu(){
        return clanovi;
    }
 
    @Override
    public void oDodajClana(Clan clan) {
       clanovi.add(clan);
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public void oObrisiClana(Clan clan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
