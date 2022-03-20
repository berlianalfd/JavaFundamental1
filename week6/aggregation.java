/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author Berl
 */

class Member 
{
  int old;
  String name;
  String posic;
  
  Member(int old, String name, String posic) 
  {
    this.old = old;
    this.name = name;
    this.posic = posic;
    System.out.println("\nMember name is " + name);
    System.out.println( old + " years old");
    System.out.println("as " + posic );
  }
}
class position 
{
  String poscName;
  int noOfmember;
  
  position(String name, int numberOfmember) 
  {
    this.poscName = name;
    this.noOfmember = numberOfmember;
  }
}

class Group 
{
  String groupname;
  int noOfposc;

  Group(String name, int position) 
  {
    this.groupname = name;
    this.noOfposc = position;
  }
}

public class aggregation 
{
    public static void main(String[] args) 
    {
    Member m1 = new Member(25, "Jungkook", "Main Vocalist, Golden maknae, and frontman.");
    Member m2 = new Member(30, "Suga", "Main rapper, producer, and songwriter.");
    Member m3 = new Member(28, "RM", " Leader of BTS, rapper, songwriter, and producer.");
  
    }
}
