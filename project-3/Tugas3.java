/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

import java.util.Scanner;

/**
 *
 * @author Shafira SS
 */
public class Tugas3 extends Superclass{
    
    public static void main(String[] args){
            Subclass buku = new Subclass(); 
            Scanner input = new Scanner(System.in);

            while(true){
            System.out.println("=============================================");
            System.out.println("               Data Buku                    ");
            System.out.println("=============================================");
            System.out.print("Masukkan Judul Buku : ");
            buku.judul = input.next();
            System.out.print("Penulis : ");
            buku.penulis = input.next();
            System.out.print("Publisher : ");
            buku.publisher = input.next();
            System.out.print("Tahun Penerbitan : ");
            buku.tahunTerbit = input.nextInt();

            System.out.println("Kategori : ");
            System.out.println("1. Semua Umur");
            System.out.println("2. Dewasa");
            System.out.println("3. Remaja");
            System.out.println("4. Anak - Anak");
            System.out.print("Pilih nomor berapa? : ");
            int pilih;
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    buku.kategori = "Semua Umur";
                    break;
                case 2:
                    buku.kategori = "Dewasa";
                    break;
                case 3 :
                    buku.kategori = "Remaja";
                    break;
                case 4 :
                    buku.kategori = "Anak - Anak";
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
                    break;
            }

            System.out.print("Stok : ");
            buku.stok = input.nextInt();


            System.out.println("=============================================");
            System.out.println("Judul Buku : "+buku.judul);
            System.out.println("Penulis : "+ buku.penulis);
            System.out.println("Publisher : "+buku.publisher);
            System.out.println("Tahun Terbit : "+buku.tahunTerbit);
            System.out.println("Kategori : "+buku.kategori);
            System.out.println("Stok : "+buku.stok);
            System.out.println("==============================================");

            System.out.println("Mau Pilih Lagi?");

            String tanya = input.next();
            if("T".equals(tanya)){
                System.out.println("==========================================");
                System.out.println("TERIMAKASIH");
                break;
            }
        }      
    }

    }

