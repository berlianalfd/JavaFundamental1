/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Ber
 */
public class Restaurant {
    private IsiMenu[] Menu;
    public static byte id=0;
    
    
    public Restaurant() {
        Menu = new IsiMenu[10];
        for(int b=0; b<10; b++){
            Menu[b] = new IsiMenu();
        }
    }


    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.Menu[id].setNama_Makanan(nama);
        this.Menu[id].setHarga_Makanan(harga);
        this.Menu[id].setStok(stok);
    }

    public void tampilMenuMakanan(){
        for(int b =0; b<=id;b++){
            if(!isOutOfStock(b)){
                System.out.println(Menu[b].getNama_Makanan() +"[" +Menu[b].getStok()+"]"
                        +"\tRp. "+Menu[b].getHarga_Makanan());
            }
        }
    }
    

    public boolean isOutOfStock(int id){
        if(Menu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
    
    
    public void penguranganStok(int id, int jumlahPesanan){
        int stok = 0;
        stok = Menu[id].getStok() - jumlahPesanan;
        Menu[id].setStok(stok);
    }
    
}


