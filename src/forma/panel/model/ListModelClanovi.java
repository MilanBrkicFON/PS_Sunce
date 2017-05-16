/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Clan;
import domen.Trener;
import java.util.List;
import javax.swing.AbstractListModel;
import osluskivac.OsluskivacClanovi;
import kontroler.Kontroler;

/**
 *
 * @author Milan
 */
public class ListModelClanovi extends AbstractListModel<Clan> implements OsluskivacClanovi{

    private List<Clan> clanovi;

    public ListModelClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
        Kontroler.getInstance().addListener((OsluskivacClanovi) this);
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
