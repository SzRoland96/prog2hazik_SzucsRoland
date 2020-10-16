/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Circle extends GeometricShape {
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return Math.PI*2*radius;
    }
    public double getDiameter() //átmérő
    {
        return 2*radius;
    }
}
