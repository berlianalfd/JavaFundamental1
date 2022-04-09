/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.tujuhdua;

/**
 *
 * @author Berl
 */
class Overload {
    void demo (int a){
        System.out.println("a: " + a);
    }
    
    void demo (int a, int b){
        System.out.println("a and b: " + a + "," + b);
    }
    
    double demo (double a){
        System.out.println("double a: " +a);
        return a*a;
    }
}
