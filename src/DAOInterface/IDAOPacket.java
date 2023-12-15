/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Packet;
import java.util.List;

/**
 *
 * @author Dhiya Urrahman
 */
public interface IDAOPacket {
    //read data
    public List<Packet> getAll();
    //insert data
    public boolean insert(Packet b);
    //update data
    public void update(Packet b);
    //delete data
    public void delete(String packet_id);
    //search data
    public List<Packet> getAllByName(String packet_id);
}
