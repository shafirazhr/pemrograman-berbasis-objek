


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner; /*untuk memasukkan fungsi pada scanner*/
public class Mahasiswa { /*nama kelas yang bersifat public/umum*/
    public static void main(String[] args) {  /*untuk menjalankan program*/
    String Nama,Nim, Prodi, Alamat; /*atribut*/
        int Umur; 
        
        /*string disitu merupakan tipe data*/
        /*nama, nim, prodi, alamat merupakan variabel*/
        Scanner keyboard = new Scanner(System.in); /*sebagai masukan bersifat dinamis*/   
        System.out.println("MAHASISWA");
        System.out.print("Nama Mahasiswa: ");
        Nama = keyboard.nextLine(); /*user diminta menginputkan nama*/
        System.out.print("Nim: ");
        Nim = keyboard.nextLine(); /*user diminta menginputkan nim*/
        System.out.print("Prodi: ");
        Prodi = keyboard.nextLine();/*user diminta menginputkan prodi*/
        System.out.print("Alamat: ");
        Alamat = keyboard.nextLine();/*user diminta menginputkan alamat*/
        System.out.print("Umur: " );
        Umur = keyboard.nextInt();
            /*untuk menampilkan hasil inputan dari yang diatas*/
        System.out.println("--------------------");
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("Nim: " + Nim);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Umur: " + Umur);
    }
}