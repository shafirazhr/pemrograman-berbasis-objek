/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg2;

/**
 *
 * @author Shafira SS
 */
class Superclass {

    //static variabel
    //keyword static
    static String Univ;
    static String Nim;
    static String Nama;
    static String Alamat;
    //static method setter
    
    //setter untuk mengisi variabel dan dapat juga mengubah variabel di class ini menjadi publik agar bisa di akses di class lain
    //constructor
    public static void setUniversitas(String Universitas){
    Univ = Universitas;
    }
    //static method getter
    //getter untuk mendapatkan dan pemanggilan nilai dari variabel yang sudah di setter
    public static String getUniversitas(){
    return Univ;
        }
    
    //static method setter 
    //untuk mengatur dan memperbarui
    public static void setNIM(String NIM){
    Nim = NIM;
    }
    //static method getter
    //mengambil nilai yang diperbarui
    public static String getNim(){
    return Nim;
    }
    //static method setter
    public static void setNAMA(String NAMA){
    Nama = NAMA;
    }
    //static method getter
    public static String getNama(){
    return Nama;
    }
    //static method setter
    public static void setAlamat (String ALAMAT){
    Alamat = ALAMAT;
    }
    //static method getter
    public static String getAlamat(){
    return Alamat;
    }
}
