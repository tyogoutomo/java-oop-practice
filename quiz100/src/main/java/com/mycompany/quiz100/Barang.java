/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz100;

/**
 *
 * @author Lenovo
 */
public class Barang {
    
    private String nama;
    private int stok;
    public Barang(String nama, int stok){
        this.nama = nama;
        this.stok = stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }
}
