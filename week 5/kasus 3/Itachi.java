/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author 
 */
public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    
    void printDojutsu() {
    System.out.println(this.Dojutsu);
    setDojutsu(); //mengubah nilai dari Dojutsu
    System.out.println(this.Dojutsu);
    }
    
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}
