/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radnaMemorija;

import java.util.ArrayList;
import java.util.List;
import osluskivac.OsluskivacClanovi;

/**
 *
 * @author Milan
 */
public class KontrolaOsluskivac {
    private static KontrolaOsluskivac instance;
    private List<OsluskivacClanovi> oClanovi = new ArrayList<>();
    private List<OsluskivacClanovi> oTreneri = new ArrayList<>();
    
    private KontrolaOsluskivac() {
    }
    
    public static KontrolaOsluskivac getInstance(){
        if (instance == null) {
            instance = new KontrolaOsluskivac();
        }
        return instance;
    }
}
