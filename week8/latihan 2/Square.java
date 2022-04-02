/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author Berl
 */
public class Square extends Rectangle{
 public Square(){
        super();
 }
 
 public Square(Double side){
        super(side, side);
 }   
    
 public Square(double side) {
    super(side, side); // Call superclass Rectangle(double, double)
 }
 public Double getSide() {
        return super.getWidth();
    }

 public void setSide(Double side){
        super.setWidth(side);
        super.setLength(side);
 }
 
 @Override
 public String toString() {
    return "Square{" + super.toString() + "}";
 }
}
