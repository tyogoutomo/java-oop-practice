/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz100;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        ArrayList<Pesanan> pesanan = new ArrayList<>();
        ArrayList<Pelanggan> pelanggan = new ArrayList<>();
        ArrayList<Barang> barang = new ArrayList<>();
        while (true) {
            choice = scan.nextInt();
            System.out.println("test");
            switch (choice) {
                case 1: //1.Tambah Pelanggan add
                    Pelanggan p = new Pelanggan("dummy", "29 Wessex St.", "082830232104");
                    pelanggan.add(p);
                    break;
                case 2: //2.Tambah Pesanan add
                    Pesanan s = new Pesanan("mmm", "aaa", 21, 21);
                    pesanan.add(s);
                    break;
                case 3: //3.Hapus Pelanggan remove

                    break;
                case 4: //4.Hapus Pesanan remove

                    break;
                case 5: //5.Tampilkan Pelanggan print
                    for(Pelanggan plg : pelanggan){
                        System.out.println(plg.getNama() + " - " + plg.getTelepon());
                    }
                    
                    break;
                case 6: //6.Tampilkan Pesanan print

            }
        }
    }
}
