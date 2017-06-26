/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.panel.model;

import domen.Clan;
import java.io.Serializable;
import java.util.List;
import javax.swing.AbstractListModel;
import osluskivac.OsluskivacClanovi;
import radnaMemorija.KontrolaOsluskivac;
import radnaMemorija.Memory;

/**
 *
 * @author Milan
 */
public class ListModelClanovi extends AbstractListModel<Clan> implements OsluskivacClanovi {

    private final List<Clan> clanovi;

    public ListModelClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
        KontrolaOsluskivac.getInstance().addListener(this);
        KontrolaOsluskivac.getInstance().addListener(this);
    }

    @Override
    public int getSize() {
        return clanovi == null || clanovi.isEmpty() ? 0 : clanovi.size();
    }

    @Override
    public Clan getElementAt(int index) {
        return clanovi.get(index);
    }

    public List<Clan> vratiClanoveNaTreningu() {
        return clanovi;
    }

    @Override
    public void oDodajClan(Clan clan) {
        clanovi.add(clan);
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public void oObrisiClana(Clan clan) {

    }

    public void obrisi(List<Clan> clanovi) {
        this.clanovi.removeAll(clanovi);
        fireContentsChanged(this, 0, getSize());
        Memory.getInstance().getTrening().setClanovi(this.clanovi);
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void addClan(Clan c) {
        clanovi.add(c);
        fireContentsChanged(this, 0, getSize());
    }
    
    
}
