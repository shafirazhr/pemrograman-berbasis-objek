/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg2;

import java.util.Scanner;

public class Subclass extends Superclass{
    //static variabel
    static String Jurusan; 

    //static method setter
    public static void setJurusan(String mhsJurusan){
    Subclass.Jurusan = mhsJurusan;
    }
    //static method getter
    public static String getJurusan(){
    Scanner input = new Scanner(System.in);
    
    String ulang;
    do{
        switch (Jurusan){
        case "41" ->  {
        System.out.println("\n|==========================|");
        System.out.println("| DATA MAHASISWA |");
        System.out.println("|==========================|\n");
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "TEKNIK INFORMATIKA";
        ulang = "t";
        break;
    }
    case "42" ->  {
        System.out.println("\n|==========================|");
        System.out.println("| DATA MAHASISWA |");
        System.out.println("\n|==========================|");
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "TEKNIK INDUSTRI";
        ulang = "t";
        break;
    }
    case "43" ->  {
        System.out.println("\n|==========================|");
        System.out.println("| DATA MAHASISWA |");
        System.out.println("|==========================|\n");
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "TEKNIK ELEKTRO";
        ulang = "t";
        break;
    }
    case "44" ->  {
        System.out.println("\n|==========================|")
        ;
        System.out.println("| DATA MAHASISWA |");
        System.out.println("|==========================|\n")
        ;
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "SISTEM INFORMASI";
        ulang = "t";
        break;
    }
    case "45" ->  {
        System.out.println("\n|==========================|");
        System.out.println("| DATA MAHASISWA |");
        System.out.println("|==========================|\n");
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "TEKNIK MESIN";
        ulang = "t";
        break;
    }
    case "46" ->  {
        System.out.println("\n|==========================|");
        System.out.println("| DATA MAHASISWA |");
        System.out.println("|==========================|\n");
        System.out.println("UNIVERSITAS : " + Superclass.getUniversitas());
        System.out.println("NIM : " + Superclass.getNim());
        System.out.println("NAMA : " + Superclass.getNama());
        System.out.println("ALAMAT : " + Superclass.getAlamat());
        Jurusan = "TEKNIK MEKATRONIKA";
        ulang = "t";
        break;
    }
    default -> {
        System.out.println("Kode Jurusan Tidak Ada!!");
        System.out.print("Masukan Kode Jurusan Kembali : ");
        setJurusan(input.nextLine());
        ulang = "iya";
    }
    }
}
while (ulang=="iya");
return Jurusan;
}
}