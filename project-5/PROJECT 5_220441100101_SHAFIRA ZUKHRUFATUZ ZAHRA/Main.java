/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author Shafira SS
 */
abstract class Animal {
    String nama;
    
    public Animal (String nama){
        this.nama = nama;
    }
    
    public abstract void makeSound();
    public void eat(){
        System.out.println(nama+" is eating.");
    }
}

class Dog extends Animal {
    public Dog (String nama){
        super(nama);
    }
    
    @Override
    public void makeSound(){
        System.out.println (nama + " is barking.");
    }
}

public class Main {
    //overloading
    static int tambah(int a, int b){
        return a+b;
    }
    static double tambah(double a, double b){
        return a+b;
    } //sampai sini
    public static void main (String[] args){
        Dog myDog = new Dog("Yeontan");
        myDog.makeSound();
        myDog.eat();
    }
}