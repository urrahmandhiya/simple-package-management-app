/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAODelivery;
import DAOInterface.IDAODelivery;
import Model.Delivery;
import Model.TableModelDelivery;
import View.FormDelivery;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author ardab
 */
public class ControllerDelivery {
    FormDelivery frmDelivery;
    IDAODelivery iDelivery;
    List<Delivery> lstPrm;
    
    public ControllerDelivery(FormDelivery frmDelivery) {
        this.frmDelivery = frmDelivery;
        iDelivery = new DAODelivery();
    }
    
    public void isiTable() {
        lstPrm = iDelivery.getAll();
        TableModelDelivery tabelPrm = new TableModelDelivery(lstPrm);
        frmDelivery.getTabelDataPengiriman().setModel(tabelPrm);
    }

    public void insert() {
        Delivery b = new Delivery();
        b.setDelivery_id(frmDelivery.gettxtIDKirim().getText());
        b.setKId(Integer.valueOf(frmDelivery.getsetIDKurir().getSelectedItem().toString()));
        b.setPacket_id(frmDelivery.getsetIDPaket().getSelectedItem().toString());
        
        Date selectedDate = frmDelivery.gettxtTanggalKirim().getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        b.setDelivery_date(formattedDate);
        
        b.setDelivery_status(frmDelivery.getsetStatusPengiriman().getSelectedItem().toString());
        b.setDelivery_arrival(frmDelivery.gettxtTanggalTerima().getText());
        boolean res = iDelivery.insert(b);
        if(res){
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
        }
        else {
            JOptionPane.showMessageDialog(null, "Gagal Input / Duplikasi");
        }
    }
    
    public void isiField(int row) {
        frmDelivery.gettxtIDKirim().setEnabled(false);
        frmDelivery.gettxtIDKirim().setText(lstPrm.get(row).getDelivery_id());
        frmDelivery.getsetIDKurir().setSelectedItem(lstPrm.get(row).getKId().toString());
        frmDelivery.getsetIDPaket().setSelectedItem(lstPrm.get(row).getPacket_id());
        
        Date deliveryDate = lstPrm.get(row).getDelivery_date();
        frmDelivery.gettxtTanggalKirim().setDate(deliveryDate);
        
        frmDelivery.getsetStatusPengiriman().setSelectedItem(lstPrm.get(row).getDelivery_status());
        frmDelivery.gettxtTanggalTerima().setText(lstPrm.get(row).getDelivery_arrival());
    }
    
    public void cari() {
        lstPrm = iDelivery.getAllByName(frmDelivery.gettxtCariPengiriman().getText());
        TableModelDelivery tabelPrm = new TableModelDelivery(lstPrm);
        frmDelivery.getTabelDataPengiriman().setModel(tabelPrm);
    }
    

    public void reset() {
        if(!frmDelivery.gettxtIDKirim().isEnabled()) {
            frmDelivery.gettxtIDKirim().setEnabled(true);
        }
        frmDelivery.gettxtIDKirim().setText("");
        frmDelivery.getsetIDKurir().setSelectedItem("");
        frmDelivery.getsetIDPaket().setSelectedItem("");
        frmDelivery.gettxtTanggalKirim().setDate(null);
        frmDelivery.getsetStatusPengiriman().setSelectedItem("");
        frmDelivery.gettxtTanggalTerima().setText("");
    }

    public void update() {
        Delivery b = new Delivery();
        b.setKId(Integer.valueOf(frmDelivery.getsetIDKurir().getSelectedItem().toString()));
        b.setPacket_id(frmDelivery.getsetIDPaket().getSelectedItem().toString());
        
        Date selectedDate = frmDelivery.gettxtTanggalKirim().getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        b.setDelivery_date(formattedDate);
        
        b.setDelivery_status(frmDelivery.getsetStatusPengiriman().getSelectedItem().toString());
        b.setDelivery_arrival(frmDelivery.gettxtTanggalTerima().getText());
        b.setDelivery_id(frmDelivery.gettxtIDKirim().getText());
        boolean res = iDelivery.update(b);
        if(res){
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
        }
        else {
            JOptionPane.showMessageDialog(null, "Gagal Update");
        }
    }

    public void delete() {
        iDelivery.delete(frmDelivery.gettxtIDKirim().getText());
        JOptionPane.showMessageDialog(null, "Delete Data Berhasil");
    }
}
