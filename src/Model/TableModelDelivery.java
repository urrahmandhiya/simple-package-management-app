/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dhiya Urrahman
 */
public class TableModelDelivery extends AbstractTableModel{
    public TableModelDelivery(List<Delivery> lstPengiriman) {
        this.lstPengiriman = lstPengiriman;
    }
    
    @Override
    public int getRowCount() {
        return this.lstPengiriman.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: 
                return "ID Kirim";
            case 1:
                return "ID Kurir";
            case 2:
                return "ID Paket";
            case 3:
                return "T.Kirim";
            case 4:
                return "Status Pengiriman";
            case 5:
                return "T.Terima";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Delivery delivery = lstPengiriman.get(rowIndex);
    SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
        switch (columnIndex) 
        {
            case 0:
                return lstPengiriman.get(rowIndex).getDelivery_id();
            case 1:
                return lstPengiriman.get(rowIndex).getKId();
            case 2:
                return lstPengiriman.get(rowIndex).getPacket_id();
            case 3:
                return outputDateFormat.format(delivery.getDelivery_date());
            case 4:
                return lstPengiriman.get(rowIndex).getDelivery_status();
            case 5:
                return lstPengiriman.get(rowIndex).getDelivery_arrival();
            default:
                return null;
        }
    }
    List<Delivery> lstPengiriman;
}
