/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radnaMemorija;

import domen.Trening;
import java.net.Socket;

/**
 *
 * @author Milan
 */
public class Memory {

    private static Memory instance;
    private Socket socket;
    private Trening trening;
    private Object obj;

    private Memory() {

    }

    public static Memory getInstance() {
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }

    public Object getObj() {
        Object o = obj;
        obj = null;
        return o;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Trening getTrening() {
        return trening;
    }

    public void setTrening(Trening trening) {
        this.trening = trening;
    }
    
    
}
