/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOPacket;
import DAOInterface.IDAOPacket;
import Model.Packet;
import Model.TableModelPacket;
import View.FormPacket;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ardab
 */
public class ControllerPacket {
    
    
    public ControllerPacket(FormPacket frmPacket)
    {
        this.frmPacket = frmPacket;
        iPacket = new DAOPacket();
    }
    public void isiTable()
    {
        lstPkt = iPacket.getAll();
        TableModelPacket tabelPkt = new TableModelPacket(lstPkt);
        frmPacket.getTabelDataPaket().setModel(tabelPkt);
    }
    
    public void insert()
    {
        Packet b = new Packet();
        b.setPacket_id(frmPacket.gettxtIdPaket().getText());
        b.setPacket_weight(Float.valueOf(frmPacket.gettxtBerat().getText()));
        b.setPacket_dimensions(frmPacket.gettxtDimensi().getText());
        b.setPacket_description(frmPacket.gettxtDeskripsi().getText());
        b.setSender_name(frmPacket.gettxtNamaPengirim().getText());
        b.setSender_phone(frmPacket.gettxtNoPengirim().getText());
        b.setSender_address(frmPacket.gettxtAlamatPengirim().getText());
        b.setReceiver_name(frmPacket.gettxtNamaPenerima().getText());
        b.setReceiver_phone(frmPacket.gettxtNoPenerima().getText());
        b.setReceiver_address(frmPacket.gettxtAlamatPenerima().getText());
        b.setPacket_status(frmPacket.getsetStatus().getSelectedItem().toString());
        boolean res = iPacket.insert(b);
        if (res) 
        {
            JOptionPane.showMessageDialog(null, "Input Berhasil");
        } else 
        {
            JOptionPane.showMessageDialog(null, "Gagal/Data Duplikasi");
        }
        
    }
    
    public void reset()
    {
        if (!frmPacket.gettxtIdPaket().isEnabled()) {
            frmPacket.gettxtIdPaket().setEnabled(true);
        }
        frmPacket.gettxtIdPaket().setText("");
        frmPacket.gettxtBerat().setText("");
        frmPacket.gettxtDimensi().setText("");
        frmPacket.gettxtDeskripsi().setText("");
        frmPacket.gettxtNamaPengirim().setText("");
        frmPacket.gettxtNoPengirim().setText("");
        frmPacket.gettxtAlamatPengirim().setText("");
        frmPacket.gettxtNamaPenerima().setText("");
        frmPacket.gettxtNoPenerima().setText("");
        frmPacket.gettxtAlamatPenerima().setText("");
        frmPacket.getsetStatus().setSelectedItem("Belum Dikirim");
    }
    
    public void isiField(int row)
    {
        frmPacket.gettxtIdPaket().setEnabled(false);       
        frmPacket.gettxtIdPaket().setText(lstPkt.get(row).getPacket_id());
        frmPacket.gettxtBerat().setText(lstPkt.get(row).getPacket_weight().toString());
        frmPacket.gettxtDimensi().setText(lstPkt.get(row).getPacket_dimensions());
        frmPacket.gettxtDeskripsi().setText(lstPkt.get(row).getPacket_description());
        frmPacket.gettxtNamaPengirim().setText(lstPkt.get(row).getSender_name());
        frmPacket.gettxtNoPengirim().setText(lstPkt.get(row).getSender_phone());
        frmPacket.gettxtAlamatPengirim().setText(lstPkt.get(row).getSender_address());
        frmPacket.gettxtNamaPenerima().setText(lstPkt.get(row).getReceiver_name());
        frmPacket.gettxtNoPenerima().setText(lstPkt.get(row).getReceiver_phone());
        frmPacket.gettxtAlamatPenerima().setText(lstPkt.get(row).getReceiver_address());
        frmPacket.getsetStatus().setSelectedItem(lstPkt.get(row).getPacket_status());
        
    }
    
    public void update()
    {
        Packet b = new Packet();      
        b.setPacket_weight(Float.valueOf(frmPacket.gettxtBerat().getText()));
        b.setPacket_dimensions(frmPacket.gettxtDimensi().getText());
        b.setPacket_description(frmPacket.gettxtDeskripsi().getText());
        b.setSender_name(frmPacket.gettxtNamaPengirim().getText());
        b.setSender_phone(frmPacket.gettxtNoPengirim().getText());
        b.setSender_address(frmPacket.gettxtAlamatPengirim().getText());
        b.setReceiver_name(frmPacket.gettxtNamaPenerima().getText());
        b.setReceiver_phone(frmPacket.gettxtNoPenerima().getText());
        b.setReceiver_address(frmPacket.gettxtAlamatPenerima().getText());
        b.setPacket_status(frmPacket.getsetStatus().getSelectedItem().toString());
        b.setPacket_id(frmPacket.gettxtIdPaket().getText());
        iPacket.update(b);
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public void delete()
    {
        iPacket.delete(frmPacket.gettxtIdPaket().getText());
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
    public void cari()
    {
        lstPkt = iPacket.getAllByName(frmPacket.gettxtCariIdPaket().getText());
        TableModelPacket tabelPkt = new TableModelPacket(lstPkt);
        frmPacket.getTabelDataPaket().setModel(tabelPkt);
    }
    
    FormPacket frmPacket;
    IDAOPacket iPacket;
    List<Packet> lstPkt;
}
