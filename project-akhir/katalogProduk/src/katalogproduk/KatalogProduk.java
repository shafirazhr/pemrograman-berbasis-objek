/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package katalogproduk;
import java.util.Scanner;

/**
 *
 * @author Shafira SS
 */
public class KatalogProduk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("==== Katalog Produk ====");
        System.out.println("1. Skincare");
        System.out.println("2. Make Up");
        System.out.print("Pilih jenis produk (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi karakter newline setelah memasukkan pilihan

        if (pilihan == 1) {
            System.out.print("----------------------------");
            System.out.print("Hasil Katalog:");
            System.out.print("=============================");
            System.out.print("Masukkan Nama Skincare: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga Skincare: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // Mengonsumsi karakter newline setelah memasukkan harga
            System.out.print("Masukkan Kategori Skincare: ");
            String kategori = scanner.nextLine();
            System.out.print("Masukkan Stok Skincare: ");
            int stok = scanner.nextInt();
            System.out.print("----------------------------");

            Produk Skincare = new Skincare(nama, harga, kategori, stok);
            Skincare.tampilkanInfo();
        } else if (pilihan == 2) {
            System.out.print("----------------------------");
            System.out.print("Hasil Katalog:");
            System.out.print("=============================");
            System.out.print("Masukkan Nama MakeUp: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga MakeUp: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // Mengonsumsi karakter newline setelah memasukkan harga
            System.out.print("Masukkan Merek MakeUp: ");
            String merek = scanner.nextLine();
            System.out.print("Masukkan Stok Make Up: ");
            int stok = scanner.nextInt();
            System.out.print("----------------------------");

            Produk MakeUp = new MakeUp(nama, harga, merek, stok);
            MakeUp.tampilkanInfo();
        }
        
        System.out.println("Mau Pilih Lagi?");

                    String tanya = scanner.nextLine();
                    if("T".equals(tanya)){
                        System.out.println("==========================================");
                        System.out.println("TERIMAKASIH");
                        break;

        }      
    }
    }
}
