/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.panel.model;

import domen.Trener;
import java.util.List;
import javax.swing.AbstractListModel;
import osluskivac.OsluskivacTreneri;
import radnaMemorija.KontrolaOsluskivac;
import radnaMemorija.Memory;

/**
 *
 * @author Milan
 */
public class ListModelTrener extends AbstractListModel<Trener> implements OsluskivacTreneri {

    private List<Trener> treneri;

    public ListModelTrener(List<Trener> treneri) {
        this.treneri = treneri;
        KontrolaOsluskivac.getInstance().addListener(this);
    }

    @Override
    public int getSize() {
        return treneri == null || treneri.isEmpty() ? 0 : treneri.size();
    }

    @Override
    public Trener getElementAt(int index) {
        return treneri == null || treneri.isEmpty() ? null : treneri.get(index);
    }

    public List<Trener> vratiTrenereNaTreningu() {
        return treneri;
    }

    @Override
    public void oDodajTrenera(Trener trener) {
        treneri.add(trener);
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public void oObrisiTrenera(Trener trener) {
        treneri.remove(trener);
        fireContentsChanged(this, 0, getSize());
    }

    public void obrisi(List<Trener> treneri) {
        this.treneri.removeAll(treneri);
        fireContentsChanged(this, 0, getSize());
        Memory.getInstance().getTrening().setTreneri(this.treneri);
    }

}
