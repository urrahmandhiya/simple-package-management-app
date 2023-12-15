/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Delivery;
import java.util.List;

/**
 *
 * @author Dhiya Urrahman
 */
public interface IDAODelivery {
    //read data
    public List<Delivery> getAll();
    //insert data
    public boolean insert(Delivery b);
    //update data
    public boolean update(Delivery b);
    //delete data
    public void delete(String delivery_id);
    //search data
    public List<Delivery> getAllByName(String delivery_id);
}
