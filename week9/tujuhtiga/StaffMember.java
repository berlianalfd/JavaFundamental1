/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author Berl
 */

abstract public class StaffMember{
   protected String name;
   protected String address;
   protected String phone;

 

   //-----------------------------------------------------------------

   //  Sets up a staff member using the specified information.

   //-----------------------------------------------------------------

   public StaffMember (String eName, String eAddress, String ePhone){
      name = eName;
      address = eAddress;
      phone = ePhone;
   }
   //----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------

   public String toString(){
      String result = "Name: " + name + "\n";
      result += "Address: " + address + "\n";
      result += "Phone: " + phone;
      return result;
   }

    double pay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}