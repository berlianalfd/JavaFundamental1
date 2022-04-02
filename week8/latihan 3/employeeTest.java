/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author Berliana Elfada
 */
public class employeeTest{
public static void main (String[] args){
 employee[] staff = new employee[3];
 staff[0] = new employee("Antonio Rossi", 2000000, 1, 10, 1989);
 staff[1] = new employee("Maria Bianchi", 2500000, 1, 12, 1991);
 staff[2] = new employee("Isabel Vidal", 3000000, 1, 11, 1993);
 int i;
 for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
 for (i = 0; i < 3; i++) staff[i].print();
}
}
