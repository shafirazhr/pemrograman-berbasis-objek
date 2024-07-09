/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg2;

/**
 *
 * @author Shafira SS
 */
import java.util.Scanner;
public class Modul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String ulang ="iya";
    
        //Superclass = new Superclass();
        //Subclass = new Subclass();
        while ("iya".equals(ulang)){
            Scanner input = new Scanner(System.in);
            System.out.println("|===========================|");
            System.out.println("| MASUKKAN DATA MAHASISWA |");
            System.out.println("|===========================|\n");
                //memasukan data pada method setter
            System.out.print("UNIVERSITAS : ");
            Superclass.setUniversitas (input.nextLine());
            System.out.print("NIM : ");
            Superclass.setNIM (input.nextLine());
            System.out.print("NAMA : ");
            Superclass.setNAMA(input.nextLine());
            System.out.print("ALAMAT : ");
            Superclass.setAlamat(input.nextLine());
            System.out.println("|========KODE JURUSAN=======|");
            System.out.println("|41--TEKNIK INFORMATIKA |");
            System.out.println("|42--TEKNIK INDUSTRI |");
            System.out.println("|43--TEKNIK ELEKTRO |");
            System.out.println("|44--SISTEM INFORMASI |");
            System.out.println("|45--TEKNIK MESIN |");
            System.out.println("|46--TEKNIK MEKATRONIKA |");
            System.out.println("|===========================|");
            System.out.print("MASUKAN KODE JURUSAN : ");
            Subclass.setJurusan(input.nextLine());
            System.out.println("JURUSAN : " + Subclass.getJurusan());
            System.out.print("\nApakah Anda ingin memasukan data lagi? (iya) iya; (T)Tidak. : ");
            ulang = input.nextLine();
    if (    !ulang.startsWith("iya")){
        System.out.println("|==========================|");
        System.out.println("| TERIMAKASIH |");
        System.out.println("|==========================|");
    }
    else{
        System.out.println("\n\n\n");
        ulang = "iya";
    }
   }
 }
}