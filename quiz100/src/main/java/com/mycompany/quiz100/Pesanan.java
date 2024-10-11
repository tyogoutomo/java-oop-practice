package com.mycompany.quiz100;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Pesanan {
    private String nama_pelanggan;
    private String nama_barang;
    private int jumlah;
    private int harga;
    public Pesanan(String nama_pelanggan, String nama_barang, int jumlah, int harga){
        this.nama_barang = nama_barang;
        this.nama_pelanggan = nama_pelanggan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama_pelanggan() {
        return this.nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getNama_barang() {
        return this.nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
