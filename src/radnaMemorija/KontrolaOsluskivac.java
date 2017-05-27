/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radnaMemorija;

import domen.Clan;
import domen.Trener;
import java.util.ArrayList;
import java.util.List;
import osluskivac.OsluskivacClanovi;
import osluskivac.OsluskivacTreneri;

/**
 *
 * @author Milan
 */
public final class KontrolaOsluskivac {

    private static KontrolaOsluskivac instance;
    private List<OsluskivacClanovi> oClanovi = new ArrayList<>();
    private List<OsluskivacTreneri> oTreneri = new ArrayList<>();

    private KontrolaOsluskivac() {
    }

    public static KontrolaOsluskivac getInstance() {
        if (instance == null) {
            instance = new KontrolaOsluskivac();
        }
        return instance;
    }

    public void addListener(OsluskivacClanovi listener) {
        oClanovi.add(listener);
    }

    public void addListener(OsluskivacTreneri listener) {
        oTreneri.add(listener);
    }

    public void obavestiSveDodavanje(Clan clan) {
        for (OsluskivacClanovi listener : oClanovi) {
            listener.oDodajClan(clan);
        }
    }

    public void obavestiSveBrisanje(Clan clan) {
        for (OsluskivacClanovi listener : oClanovi) {
            listener.oObrisiClana(clan);
        }
    }

    public void obavestiSveDodavanje(Trener trener) {
        for (OsluskivacTreneri listener : oTreneri) {
            listener.oDodajTrenera(trener);
        }
    }

    public void obavestiSveBrisanje(Trener trener) {
        for (OsluskivacTreneri listener : oTreneri) {
            listener.oObrisiTrenera(trener);
        }
    }
}
