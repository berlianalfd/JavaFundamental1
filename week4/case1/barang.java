/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @modificated Berliana Elfada
 */
public class barang {

    String kode_barang;
    String nama_barang;
    private int stok;
    
    public String getNama_barang() {
        return nama_barang;
    }
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void tambahStok(int tambah){
        stok += tambah; //method aritmatika untuk menambah stok
    }
    public barang(String kode, String nama, int stk) {  
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}


