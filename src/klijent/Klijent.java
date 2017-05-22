/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import forma.FPocetna;
import java.io.IOException;
import java.net.Socket;
import radnaMemorija.Memory;

/**
 *
 * @author Milan
 */
public class Klijent {
    public void poveziSeSaServerom() throws IOException{
        Socket socket = new Socket("localhost", 12321);
        
        System.out.println("Klijent se povezao sa serverom");
        Memory.getInstance().setSocket(socket);
        
        FPocetna pocetna = new FPocetna();
        pocetna.setVisible(true);
    }
}
