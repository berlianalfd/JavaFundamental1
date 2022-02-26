import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@author berlianlfd
//@version 2022-02-19

public class bukaTutupJalan {
    public static void main(String[] args){
        String[] Number;
        String total = "";
        
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        
        Number = text.split(" ");
        
        for(String Numb:Number){
            total = total+Numb;
        }        
        double plat = Double.parseDouble(total);
        
        plat = plat - 999999;
        if (plat % 5 == 0){
            System.out.println("berhenti");
        }
        else{
            System.out.println("jalan");
        }
        
    }
}
