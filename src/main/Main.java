/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import klijent.Klijent;

/**
 *
 * @author Milan
 */
public class Main {
    /**
     * Da li da cuvam podatke iz baze u aplikaciji ili da pravim mini upite svaki put na pokretanje neke akcije?
     * 
     *  
     */
    
    
    public static void main(String[] args) {
        try {
            Klijent klijent = new Klijent();
            klijent.poveziSeSaServerom();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
        }
    }
}
