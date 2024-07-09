/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas3;

/**
 *
 * @author Shafira SS
 */
public class Superclass {
        public String judul;
        public String penulis;
        public String publisher;
        public int tahunTerbit ;
        public int stok;
        public Superclass(String Judul_Buku, String Penulis_Buku, String Perusahaan_penerbit, int Tahun_Penerbitan, int stok){
            this.judul=Judul_Buku;
            this.penulis=Penulis_Buku;
            this.publisher=Perusahaan_penerbit;
            this.tahunTerbit=Tahun_Penerbitan;
            this.stok=stok;

        }
        Superclass(){
        }
    }
