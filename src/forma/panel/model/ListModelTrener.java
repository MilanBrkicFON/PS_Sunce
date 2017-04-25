/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Clan;
import domen.Trener;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Milan
 */
public class ListModelTrener extends AbstractListModel<Trener>{

    private List<Trener> treneri;
    
    public ListModelTrener(List<Trener> treneri) {
        this.treneri = treneri;
    }
    
    
    @Override
    public int getSize() {
        return treneri == null ? 0 : treneri.size();
    }

    @Override
    public Trener getElementAt(int index) {
        return treneri.get(index);
    }

   
    
}
