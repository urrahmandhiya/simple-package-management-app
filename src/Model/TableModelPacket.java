/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dhiya Urrahman
 */
public class TableModelPacket extends AbstractTableModel{
    
    public TableModelPacket(List<Packet> lstPkt)
    {
        this.lstPkt = lstPkt;
    }
    @Override
    public int getRowCount() {
        return this.lstPkt.size();
    }
    
    @Override
    public String getColumnName(int column)
    {
        switch (column) 
        {
            case 0:
                return "ID Paket";
            case 1:
                return "Berat";
            case 2:
                return "Dimensi";
            case 3:
                return "Deskripsi";
            case 4:
                return "Pengirim";
            case 5:
                return "No.HP (S)";
            case 6:
                return "Alamat (S)";
            case 7:
                return "Penerima";
            case 8:
                return "No.HP (P)";
            case 9:
                return "Alamat (P)";
            case 10:
                return "Status";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) 
        {
            case 0:
                return lstPkt.get(rowIndex).getPacket_id();
            case 1:
                return lstPkt.get(rowIndex).getPacket_weight();
            case 2:
                return lstPkt.get(rowIndex).getPacket_dimensions();
            case 3:
                return lstPkt.get(rowIndex).getPacket_description();
            case 4:
                return lstPkt.get(rowIndex).getSender_name();
            case 5:
                return lstPkt.get(rowIndex).getSender_phone();
            case 6:
                return lstPkt.get(rowIndex).getSender_address();
            case 7:
                return lstPkt.get(rowIndex).getReceiver_name();
            case 8:
                return lstPkt.get(rowIndex).getReceiver_phone();
            case 9:
                return lstPkt.get(rowIndex).getReceiver_address();
            case 10:
                return lstPkt.get(rowIndex).getPacket_status();
            default:
                return null;
        }
        
    }
    
    List<Packet> lstPkt;
}
