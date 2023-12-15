/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ardab
 */
public class Courier {

    /**
     * @return the Kid
     */
    public Integer getKId() {
        return Kid;
    }

    /**
     * @param id the Kid to set
     */
    public void setKId(Integer Kid) {
        this.Kid = Kid;
    }

    /**
     * @return the Knama
     */
    public String getKNama() {
        return Knama;
    }

    /**
     * @param nama the Knama to set
     */
    public void setKNama(String Knama) {
        this.Knama = Knama;
    }

    /**
     * @return the Knohp
     */
    public String getKNohp() {
        return Knohp;
    }

    /**
     * @param nohp the Knohp to set
     */
    public void setKNohp(String Knohp) {
        this.Knohp = Knohp;
    }

    /**
     * @return the email
     */
    public String getKEmail() {
        return Kemail;
    }

    /**
     * @param email the email to set
     */
    public void setKEmail(String Kemail) {
        this.Kemail = Kemail;
    }

    /**
     * @return the kendaraan
     */
    public String getKendaraan() {
        return kendaraan;
    }

    /**
     * @param kendaraan the kendaraan to set
     */
    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    /**
     * @return the wilayah
     */
    public String getWilayah() {
        return wilayah;
    }

    /**
     * @param lokasi the wilayah to set
     */
    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    /**
     * @return the kapasitas
     */
    public Integer getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(Integer kapasitas) {
        this.kapasitas = kapasitas;
    }
    private Integer Kid;
    private String Knama;
    private String Knohp;
    private String Kemail;
    private String kendaraan;
    private String wilayah;
    private Integer kapasitas;
}
