/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author Berl
 */
class employee{
public employee(String n, double s, int day, int month, int year){
 name = n;
 salary = s;
 hireday = day;
 hiremonth = month;
 hireyear = year;
}
public void print(){
 System.out.println(name + " " + salary + " " + hireYear());
}
public void raiseSalary(double byPercent){
 salary *= 1 + byPercent / 100;
}
public int hireYear(){
return hireyear;
}
private String name;
private double salary;
private int hireday;
private int hiremonth;
private int hireyear;
}

