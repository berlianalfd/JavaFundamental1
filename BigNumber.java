import java.math.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@author berlianlfd
//@version 2022-02-19

public class BigNumber {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger b;
    BigInteger e;
    BigInteger sum = BigInteger.valueOf(0);
    BigInteger result = BigInteger.valueOf(0);
        
    b = new BigInteger(sc.nextLine());
    e = new BigInteger(sc.nextLine());
        
    sum = sum.add(b);
    sum = sum.add(e);
    result = b.multiply(e);
        
    System.out.println(sum);
    System.out.println(result);
    }
}