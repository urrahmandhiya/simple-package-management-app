/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dhiya Urrahman
 */
public class Packet {

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
     * @return the packet_weight
     */
    public Float getPacket_weight() {
        return packet_weight;
    }

    /**
     * @param packet_weight the packet_weight to set
     */
    public void setPacket_weight(Float packet_weight) {
        this.packet_weight = packet_weight;
    }

    /**
     * @return the packet_dimensions
     */
    public String getPacket_dimensions() {
        return packet_dimensions;
    }

    /**
     * @param packet_dimensions the packet_dimensions to set
     */
    public void setPacket_dimensions(String packet_dimensions) {
        this.packet_dimensions = packet_dimensions;
    }

    /**
     * @return the packet_description
     */
    public String getPacket_description() {
        return packet_description;
    }

    /**
     * @param packet_description the packet_description to set
     */
    public void setPacket_description(String packet_description) {
        this.packet_description = packet_description;
    }

    /**
     * @return the sender_name
     */
    public String getSender_name() {
        return sender_name;
    }

    /**
     * @param sender_name the sender_name to set
     */
    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    /**
     * @return the sender_phone
     */
    public String getSender_phone() {
        return sender_phone;
    }

    /**
     * @param sender_phone the sender_phone to set
     */
    public void setSender_phone(String sender_phone) {
        this.sender_phone = sender_phone;
    }

    /**
     * @return the sender_address
     */
    public String getSender_address() {
        return sender_address;
    }

    /**
     * @param sender_address the sender_address to set
     */
    public void setSender_address(String sender_address) {
        this.sender_address = sender_address;
    }

    /**
     * @return the receiver_name
     */
    public String getReceiver_name() {
        return receiver_name;
    }

    /**
     * @param receiver_name the receiver_name to set
     */
    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    /**
     * @return the receiver_phone
     */
    public String getReceiver_phone() {
        return receiver_phone;
    }

    /**
     * @param receiver_phone the receiver_phone to set
     */
    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    /**
     * @return the receiver_address
     */
    public String getReceiver_address() {
        return receiver_address;
    }

    /**
     * @param receiver_address the receiver_address to set
     */
    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    /**
     * @return the packet_status
     */
    public String getPacket_status() {
        return packet_status;
    }

    /**
     * @param packet_status the packet_status to set
     */
    public void setPacket_status(String packet_status) {
        this.packet_status = packet_status;
    }
    
    private String packet_id;
    private Float packet_weight;
    private String packet_dimensions;
    private String packet_description;
    private String sender_name;
    private String sender_phone;
    private String sender_address;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_address;
    private String packet_status;
}
