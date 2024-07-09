/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shafira SS
 */
public class Manusia { 
    public static void main (String[] args) {
           
        kelasObjek shafira = new kelasObjek("Shafira Zukhrufatuz Zahra", "19", "Lamongan", "220441100101");
           
            
        System.out.println ("Nama Mahasiswa: " + shafira.nama);
        shafira.printumur();
        shafira.printAlamat();
        shafira.printNim ();
        shafira.berjalandanberlari();
    }
}