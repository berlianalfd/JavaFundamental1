/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @modificated Berliana Elfada
 */
public class inventori {
    barang[] barangs;
    void initbarang() {
        barangs = new barang[2];
        barangs[0] = new barang ("001", "Baju", 10);
        barangs[1] = new barang ("002", "Celana", 20);
    }
    void showbarang() {
        System.out.println(barangs[0].getNama_barang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama_barang() + "(" + barangs[1].getStok() + ")");
    }
    void pengadaan() {
        initbarang();
        barangs[0].tambahStok(10);
        barangs[1].tambahStok(20);
        showbarang(); 
        }
    public static void main(String[] args) {
        inventori beli = new inventori();
        beli.pengadaan();
        }
}


