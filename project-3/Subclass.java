/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas3;

/**
 *
 * @author Shafira SS
 */
public class Subclass extends Superclass{
    
        public String kategori;

        public Subclass(String Judul_Buku, String Penulis_Buku, String Perusahaan_penerbit, int Tahun_Penerbitan, int stok){
            super(Judul_Buku, Penulis_Buku, Perusahaan_penerbit, Tahun_Penerbitan, stok);
            this.kategori = kategori;
        }
        Subclass(){
    }
    }
