/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@author berlianlfd
//@version 2022-02-19

import java.util.*;

public class berhitung3{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); 
    
    int A, B, hasil;
    char operator;
    
    //input angka dan operasi
    A = input.nextInt();
    operator = input.next().charAt(0);
    B = input.nextInt();
    
    if((A >= 1 && A <= 1000) && ( B >= 1 && B <=1000)) {
        switch (operator) {
          case '+': //operasi penjumlahan
            hasil = A + B;
            System.out.println(hasil);break;
            
          case '-': //operasi pengurangan
            hasil = A - B;
            System.out.println(hasil);break;

          case '*': //operasi perkalian
            hasil = A * B;
            System.out.println(hasil);break;

          case '/': //operasi pembagian
            hasil = A / B;
            System.out.println(hasil);break;
            
          case '%': //operasi sisa bagi
            hasil = A % B;
            System.out.println(hasil);break;
            
          default: //operator lain
            System.out.println("operator error");
            break;
        }
    }
    else{
        System.out.println("operator error");
    }
  }
}