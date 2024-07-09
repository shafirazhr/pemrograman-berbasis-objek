/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shafira SS
 */
public class kelasObjek {
        /*nama kelas*/
    String nama;
    String umur;
    String Alamat;
    String Nim;
        /*atribut*//*nama, umur,alamat merupakan variabel*/
        /*syntax untuk menginputkan pada kelas*/
    public kelasObjek (String inputNama, String inputanumur, String inputAlamat, String masukanNim){
        nama = inputNama;
        umur = inputanumur;
        Alamat = inputAlamat;
        Nim = masukanNim;
    }
        /*method*/
    public void printNama() {
        System.out.println("Nama: "+ nama);
    }
    public void printumur() {
        System.out.println("umurnya: "+ umur + " tahun");
    }
    public void printAlamat() {
        System.out.println("Alamat: "+ Alamat);
    }   
    public void printNim() {
        System.out.println("NIM: "+ Nim);
    }   
    public void berjalandanberlari() {
        System.out.println("dia berjalan dan berlari");
    
    }
}
