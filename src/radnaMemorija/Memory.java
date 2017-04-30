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
    
    private Object obj;
    
    private Memory(){
        
    }
    
    public static Memory getInstance(){
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


   
}
