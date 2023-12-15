/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOCourier;
import DAOInterface.IDAOCourier;
import Model.Courier;
import Model.TableModelCourier;
import View.FormCourier;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ardab
 */
public class ControllerCourier {
    FormCourier frmKurir;
    IDAOCourier iKurir;
    List<Courier> lstKurir;
    
    public ControllerCourier(FormCourier frmKurir) {
        this.frmKurir = frmKurir;
        iKurir = new DAOCourier();
    }
    public void isiTable() {
        lstKurir = iKurir.getAll();
        TableModelCourier tabelKrr = new TableModelCourier(lstKurir);
        frmKurir.getTabelData().setModel(tabelKrr);
    }

    public void insert() {
        Courier b = new Courier();
        b.setKId(Integer.valueOf(frmKurir.gettxtID().getText()));
        b.setKNama(frmKurir.gettxtNama().getText());
        b.setKNohp(frmKurir.gettxtNoHp().getText());
        b.setKEmail(frmKurir.gettxtEmail().getText());
        b.setKendaraan(frmKurir.gettxtKendaraan().getSelectedItem().toString());
        b.setWilayah(frmKurir.gettxtWilayah().getText());
        b.setKapasitas(Integer.valueOf(frmKurir.gettxtKapasitas().getText()));
        boolean res = iKurir.insert(b);
        if(res){
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
        }
        else {
            JOptionPane.showMessageDialog(null, "Gagal Input / Duplikasi");
        }
    }
    
    public void isiField(int row) {
        frmKurir.gettxtID().setEnabled(false);
        frmKurir.gettxtID().setText(lstKurir.get(row).getKId().toString());
        frmKurir.gettxtNama().setText(lstKurir.get(row).getKNama());
        frmKurir.gettxtNoHp().setText(lstKurir.get(row).getKNohp());
        frmKurir.gettxtEmail().setText(lstKurir.get(row).getKEmail());
        frmKurir.gettxtKendaraan().setSelectedItem(lstKurir.get(row).getKendaraan());
        frmKurir.gettxtWilayah().setText(lstKurir.get(row).getWilayah());
        frmKurir.gettxtKapasitas().setText(lstKurir.get(row).getKapasitas().toString());
    }
    public void carinama() {
        lstKurir = iKurir.getCariNama(frmKurir.gettxtCariKurir().getText());
        TableModelCourier tabelKrr = new TableModelCourier(lstKurir);
        frmKurir.getTabelData().setModel(tabelKrr);
    }
    

    public void reset() {
        if(!frmKurir.gettxtID().isEnabled()) {
            frmKurir.gettxtID().setEnabled(true);
        }
        frmKurir.gettxtID().setText("");
        frmKurir.gettxtNama().setText("");
        frmKurir.gettxtNoHp().setText("");
        frmKurir.gettxtEmail().setText("");
        frmKurir.gettxtKendaraan().setSelectedItem("");
        frmKurir.gettxtWilayah().setText("");
        frmKurir.gettxtKapasitas().setText("");
    }

    public void update() {
        Courier b = new Courier();
        b.setKNama(frmKurir.gettxtNama().getText());
        b.setKNohp(frmKurir.gettxtNoHp().getText());
        b.setKEmail(frmKurir.gettxtEmail().getText());
        b.setKendaraan(frmKurir.gettxtKendaraan().getSelectedItem().toString());
        b.setWilayah(frmKurir.gettxtWilayah().getText());
        b.setKapasitas(Integer.valueOf(frmKurir.gettxtKapasitas().getText()));
        b.setKId(Integer.valueOf(frmKurir.gettxtID().getText()));
        iKurir.update(b);
        JOptionPane.showMessageDialog(null, "Update Data Berhasil");
    }

    public void delete() {
        iKurir.delete(Integer.parseInt(frmKurir.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "Delete Data Berhasil");
    }
}
