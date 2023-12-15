/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ardab
 */
public class TableModelCourier extends AbstractTableModel{
    public TableModelCourier(List<Courier> lstKurir) {
        this.lstKurir = lstKurir;
    }
    
    @Override
    public int getRowCount() {
        return this.lstKurir.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: 
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "No.HP";
            case 3:
                return "Email";
            case 4:
                return "Tipe Kendaraan";
            case 5:
                return "Lokasi";
            case 6:
                return "Kapasitas";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) 
        {
            case 0:
                return lstKurir.get(rowIndex).getKId();
            case 1:
                return lstKurir.get(rowIndex).getKNama();
            case 2:
                return lstKurir.get(rowIndex).getKNohp();
            case 3:
                return lstKurir.get(rowIndex).getKEmail();
            case 4:
                return lstKurir.get(rowIndex).getKendaraan();
            case 5:
                return lstKurir.get(rowIndex).getWilayah();
            case 6:
                return lstKurir.get(rowIndex).getKapasitas();
            default:
                return null;
        }
    }
    List<Courier> lstKurir;
}
