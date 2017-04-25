/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel.model;

import domen.Trening;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milan
 */
public class TableModelPrikazVreme extends AbstractTableModel {

    private final List<Trening> treninzi;
    private final String[] title = {"vreme od", "vreme do"};
    
    public TableModelPrikazVreme(List<Trening> treninzi) {
        this.treninzi = treninzi;
    }

    @Override
    public String getColumnName(int column) {
        return title[column];
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return treninzi == null ? 0 : treninzi.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trening t = treninzi.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return t.getVremeOd();
            case 1:
                return t.getVremeDo();
            default:
                return "N/a";
        }
    }

}
