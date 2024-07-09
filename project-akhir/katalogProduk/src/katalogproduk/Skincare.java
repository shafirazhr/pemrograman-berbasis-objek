/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package katalogproduk;

/**
 *
 * @author Shafira SS
 */
class Skincare extends Produk {
    private String kategori;
    private int stok;

    public Skincare(String nama, double harga, String kategori, int stok) {
        super(nama, harga);
        this.kategori = kategori;
        this.stok = stok;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Stok Produk: " + stok);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
    }
}