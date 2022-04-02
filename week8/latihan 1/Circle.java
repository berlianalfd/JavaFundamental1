/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author Berl
 */
public class Circle {

 double radius;
 public double getRadius() {
        return radius;
    }

    // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    public void setRadius(double radius) {
        this.radius = radius;
    }
 private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



 // Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
 }

 /** Constructs a Circle instance with the given radius and default color
     * @param r */
 public Circle(double r) { // 2nd constructor
    radius = r;
    color = "red";
 }

/** Returns the radius
     * @return  */
 
 /** Returns the area of this Circle instance
     * @return  */
  /** Returns the area of this Circle instance
     * @return  */
 public double getArea() {
    return radius*radius*Math.PI;
 }
 /** Return a self-descriptive string of this instance in the form of
Circle[radius=?,color=?] */
 @Override
 public String toString() {
    return "Circle[radius=" + radius + " color=" + color + "]";
 }
 
 public Circle (double radius, String color ){
     this.radius = radius;
     this.color = color;
 }
}


