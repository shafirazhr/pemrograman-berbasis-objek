/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author Shafira SS
 */
abstract class OperasiBilABS {
  protected double a, b, c;

  protected abstract void setA(double a);
  protected abstract void setB(double b);
  protected abstract void setC();
  protected abstract double getA();
  protected abstract double getB();
  protected abstract double getC();
  protected abstract void tampil();

  public void hitung() {
    setC();
    tampil();
  }
}

class Penjumlahan extends OperasiBilABS {
  @Override
  protected void setA(double a) {
    this.a = a;
  }

  @Override
  protected void setB(double b) {
    this.b = b;
  }

  @Override
  protected void setC() {
    this.c = a + b;
  }

  @Override
  protected double getA() {
    return this.a;
  }

  @Override
  protected double getB() {
    return this.b;
  }

  @Override
  protected double getC() {
    return this.c;
  }

  @Override
  protected void tampil() {
    System.out.println(getA() + " + " + getB() + " = " + getC());
  }
}

class Pengurangan extends OperasiBilABS {
  @Override
  protected void setA(double a) {
    this.a = a;
  }

  @Override
  protected void setB(double b) {
    this.b = b;
  }

  @Override
  protected void setC() {
    this.c = a - b;
  }

  @Override
  protected double getA() {
    return this.a;
  }

  @Override
  protected double getB() {
    return this.b;
  }

  @Override
  protected double getC() {
    return this.c;
  }

  @Override
  protected void tampil() {
    System.out.println(getA() + " - " + getB() + " = " + getC());
  }
}

class Perkalian extends OperasiBilABS {
  @Override
  protected void setA(double a) {
    this.a = a;
  }

  @Override
  protected void setB(double b) {
    this.b = b;
  }

  @Override
  protected void setC() {
    this.c = a * b;
  }

  @Override
  protected double getA() {
    return this.a;
  }

  @Override
  protected double getB() {
    return this.b;
  }

  @Override
  protected double getC() {
    return this.c;
  }

  @Override
  protected void tampil() {
    System.out.println(getA() + " x " + getB() + " = " + getC());
  }
}

class Pembagian extends OperasiBilABS {
  @Override
  protected void setA(double a) {
    this.a = a;
  }

  @Override
  protected void setB(double b) {
    this.b = b;
  }

  @Override
  protected void setC() {
    this.c = a / b;
  }

  @Override
  protected double getA() {
    return this.a;
  }

  @Override
  protected double getB() {
    return this.b;
  }

  @Override
  protected double getC() {
    return this.c;
  }

  @Override
  protected void tampil() {
    System.out.println(getA() + " : " + getB() + " = " + getC());
  }
}
public class Main {
  public static void main(String[] args) {
    double a = 9.25;
    double b = 1.25;

    OperasiBilABS[] operasiMatematika = new OperasiBilABS[4];
    operasiMatematika[0] = new Penjumlahan();
    operasiMatematika[1] = new Pengurangan();
    operasiMatematika[2] = new Perkalian();
    operasiMatematika[3] = new Pembagian();

    for (OperasiBilABS op : operasiMatematika) {
      op.setA(a);
      op.setB(b);
      op.hitung();
    }
  }
}