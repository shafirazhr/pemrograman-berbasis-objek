/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package katalogproduk;

/**
 *
 * @author Shafira SS
 */
class MakeUp extends Produk {
    private String merek;
    private int stok;

    public MakeUp(String nama, double harga, String merek, int stok) {
        super(nama, harga);
        this.merek = merek;
        this.stok = stok;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Make Up: " + nama);
        System.out.println("Merek: " + merek);
        System.out.println("Stok Produk: " + stok);
        System.out.println("Harga: " + harga);
    }
}