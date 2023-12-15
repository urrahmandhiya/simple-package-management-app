/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dhiya Urrahman
 */
public class Delivery {

    /**
     * @return the delivery_id
     */
    public String getDelivery_id() {
        return delivery_id;
    }

    /**
     * @param delivery_id the delivery_id to set
     */
    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    /**
     * @return the Kid
     */
    public Integer getKId() {
        return Kid;
    }

    /**
     * @param Kid the Kid to set
     */
    public void setKId(Integer Kid) {
        this.Kid = Kid;
    }

    /**
     * @return the packet_id
     */
    public String getPacket_id() {
        return packet_id;
    }

    /**
     * @param packet_id the packet_id to set
     */
    public void setPacket_id(String packet_id) {
        this.packet_id = packet_id;
    }

   /**
     * @return the delivery_date
     */
    public Date getDelivery_date() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(delivery_date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // or return a default date value if the parsing fails
        }
    }

    /**
     * @param delivery_date the delivery_date to set
     */
    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    /**
     * @return the delivery_status
     */
    public String getDelivery_status() {
        return delivery_status;
    }

    /**
     * @param delivery_status the delivery_status to set
     */
    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }
    /**
     * @return the delivery_arrival
     */
    public String getDelivery_arrival() {
        return delivery_arrival;
    }

    /**
     * @param delivery_arrival the delivery_arrival to set
     */
    public void setDelivery_arrival(String delivery_arrival) {
        this.delivery_arrival = delivery_arrival;
    }
    
     /**
     * @return the formattedDeliveryDate
     */
    public String getFormattedDeliveryDate() {
        return formattedDeliveryDate;
    }

    /**
     * @param formattedDeliveryDate the formattedDeliveryDate to set
     */
    public void setFormattedDeliveryDate(String formattedDeliveryDate) {
        this.formattedDeliveryDate = formattedDeliveryDate;
    }
    
    private String delivery_id;
    private Integer Kid;
    private String packet_id;
    private String delivery_date;
    private String delivery_status;
    private String delivery_arrival;
    private String formattedDeliveryDate;
}
