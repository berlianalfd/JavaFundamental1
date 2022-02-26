/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@author berlianlfd
//@version 2022-02-19

import java.util.*;

public class gajiAgent {
    public static void main(String[] args){
        
        double gajiPokok, hargaitem, bonus,totalGaji, denda;
        int totalitem; 
        
        gajiPokok = 500000;
        hargaitem = 50000;
        
        Scanner input = new Scanner(System.in);
        totalitem = input.nextInt();
        
        if (totalitem >= 40){
            bonus = (0.25 * totalitem * hargaitem);
            totalGaji = (gajiPokok + bonus);
        }
        else if (totalitem > 80){
            bonus = (0.35 * totalitem * hargaitem);
            totalGaji = (gajiPokok + bonus);
        }
        else if (totalitem < 15){
            totalitem = (15 - totalitem);
            denda = (0.15 * totalitem * hargaitem);
            totalGaji = (gajiPokok - denda);
        }
        else{
            bonus = (0.1 * totalitem * hargaitem);
            totalGaji = (gajiPokok + bonus);
        }
        
        System.out.println((int)totalGaji);
    }
}