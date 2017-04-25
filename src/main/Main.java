/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import forma.FPocetna;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Milan
 */
public class Main {
    public static void main(String[] args) {
        try {
            FPocetna forma = new FPocetna();
            forma.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Konfiguracioni fajl nije pronadjen!","Greska",JOptionPane.ERROR_MESSAGE);
        }
    }
}
