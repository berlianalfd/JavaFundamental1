/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author Berl
 */

class NAps {
    private String aplikasi;
    private String versi;

    public String getaplikasi() {
        return aplikasi;
    }

    public String getversi() {
        return versi;
    }

    public void setaplikasi(String aplikasi) {
        this.aplikasi = aplikasi;
    }

    public void setversi(String versi) {
        this.versi = versi;
    }
    
}

class About {
    void print(NAps aplikasi){
        aplikasi.setaplikasi("Twitter");
        aplikasi.setversi("13.42.78v.");
        
        System.out.println("Aplikasi : " + aplikasi.getaplikasi());
        System.out.println("Versi : " + aplikasi.getversi());
    }   
}

public class Dependence {
    public static void main(String[] args) {
        About ANap = new About();
        NAps ANaps = new NAps();
        
        System.out.println("\t APLIKASI");
        ANap.print(ANaps);
    }
}
