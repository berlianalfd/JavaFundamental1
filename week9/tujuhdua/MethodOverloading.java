/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.tujuhdua;

/**
 *
 * @author Berl
 */
class MethodOverloading {
    public static void main (String args[]){
        Overload Obj = new Overload ();
        double result;
        Obj .demo(10);
        Obj .demo(10,20);
        result = Obj .demo(5.5);
        System.out.println("O/P: " + result);
    }
}
