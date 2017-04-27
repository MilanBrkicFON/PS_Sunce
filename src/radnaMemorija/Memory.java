/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radnaMemorija;

import domen.Clan;
import domen.Mesto;
import domen.Trener;
import domen.Trening;

/**
 *
 * @author Milan
 */
public class Memory {
    
    private static Memory instance;
    
    private Trening trening;
    private Clan clan;
    private Mesto mesto;
    private Trener trener;
    
    private Memory(){
        
    }
    
    public static Memory getInstance(){
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }

    public Trening getTrening() {
        return trening;
    }

    public void setTrening(Trening trening) {
        this.trening = trening;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }
    
    /**
     * Postavlja null vrednost na sve atribute u memoriji
     */
    public void clearMemory(){
        this.clan = null;
        this.mesto = null;
        this.trener = null;
        this.trening = null;
    }
}
