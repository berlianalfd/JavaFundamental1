import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *program ini untuk mengetahui ada berapa banyak kata dalam satu kalimat yang diinput.
 * @author berlianlfd
 * @version 2022-02-18
 */

public class stringtoken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String splits[] = s.split("[!,?._'@ ]");
        System.out.println(splits.length);
        for(String z : splits){
            System.out.println(z);
            }
        }
    }


