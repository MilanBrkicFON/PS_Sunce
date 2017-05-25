/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import forma.FPocetna;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import radnaMemorija.Memory;

/**
 *
 * @author Milan
 */
public class Klijent {
    public void poveziSeSaServerom() throws Exception{
        InetAddress adress = InetAddress.getByName("169.254.230.111");
        Socket socket = new Socket(adress, 12321);
        
        System.out.println("Klijent se povezao sa serverom");
        Memory.getInstance().setSocket(socket);
        
        FPocetna pocetna = new FPocetna();
        pocetna.setVisible(true);
    }
}
