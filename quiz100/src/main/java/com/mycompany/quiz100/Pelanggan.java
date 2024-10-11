package com.mycompany.quiz100;

/**
 *
 * @author Lenovo
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String telepon;
    public Pelanggan(String nama,String alamat,String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
//    public print()
}
