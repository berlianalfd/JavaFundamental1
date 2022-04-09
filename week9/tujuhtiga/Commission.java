/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author Berl
 */

public class Commission extends Hourly {

    private double totalSales;
    private double rateComission;

    public Commission(String eName, String eAddress, String ePhone, String SocSecNumber, double rate, double comrate){
        super(eName, eAddress, ePhone, SocSecNumber, rate );
        this.rateComission = rateComission;
    }

    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    public double pay(){

        double payment = super.pay() + (this.totalSales * rateComission);
        this.totalSales = 0;
        return payment;
        
    }

    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
