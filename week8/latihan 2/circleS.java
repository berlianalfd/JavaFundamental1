/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author Berl
 */
public class circleS extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public circleS(Double radius){
        super();
        this.radius = radius;
    }
    
    public circleS(){
        super();
        this.radius = 1.0;
    }
    
    public circleS(String color, Boolean filled, Double radius){
        super(color, filled);
        this.radius = radius;
    }
    
    public Double getArea(){
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public Double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ",radius=" + radius +
                '}';
    }
}
