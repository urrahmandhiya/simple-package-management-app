/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Courier;
import java.util.List;

/**
 *
 * @author ardab
 */
public interface IDAOCourier {
    //read data
    public List<Courier> getAll();
    // cari data
    public List<Courier> getCariNama(String KNama);
    // masukan data
    public boolean insert(Courier b);
    // ubah data
    public void update(Courier b);
    //hapus data
    public void delete(int Kid);
}
