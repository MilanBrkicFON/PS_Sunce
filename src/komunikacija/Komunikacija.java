/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import radnaMemorija.Memory;
import request.RequestObject;
import response.ResponseObject;

/**
 *
 * @author Milan
 */
public class Komunikacija {

//    private ObjectOutputStream outKaServeru;
//    private ObjectInputStream inOdServera;

    private static Komunikacija instanca = null;

    private Komunikacija() throws IOException {

//        outKaServeru = new ObjectOutputStream(Memory.getInstance().getSocket().getOutputStream());
//        outKaServeru.flush();
//
//        inOdServera = new ObjectInputStream(Memory.getInstance().getSocket().getInputStream());
//        System.out.println("Komunikacija===" + Memory.getInstance().getSocket().toString());
    }

    public static Komunikacija vratiInstancu() throws IOException {
        if (instanca == null) {
            instanca = new Komunikacija();
        }
        return instanca;
    }

    public void posaljiZahtev(RequestObject request) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(Memory.getInstance().getSocket().getOutputStream());
        out.writeObject(request);
    }

    public ResponseObject procitajOdgovor() throws IOException, ClassNotFoundException {
        return (ResponseObject) new ObjectInputStream(Memory.getInstance().getSocket().getInputStream()).readObject();

    }

}
