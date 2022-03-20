/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author Berl
 */

class Person 
{
  String name;
  long id;
  
  Person(String name, long id) 
  {
    this.name = name;
    this.id = id;
  }
}

class NIM extends Person 
{
  String personName;
  
  NIM(String name, long id) 
  {
    super(name, id);
    this.personName = name;
  }
}

public class Association {
  public static void main(String args[]) {
    NIM obj = new NIM("Alyissa", 2015432);
    System.out.println(obj.personName + " is a person with a NIM number: " + obj.id);
  }
}