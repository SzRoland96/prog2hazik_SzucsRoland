/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Ez az osztály egy téglalap reprezentálására szolgál.
 * @author Roland
 */
public class Rectangle {
    
    public double width;
    public double height;
    
    /**
     * Ez a konstruktor létrehoz, egy 1 szélességű és 1 hosszúságú téglalapot.
     */
    public Rectangle() {
        this.width=1;
        this.height=1;
    }
    /**
     * Ez a konstruktor létrehoz, egy random szélességű és hosszúságú téglalapot.
     * @param width
     * @param height 
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * Ez a metódus adja vissza, az aktuális téglalap területét.
     * @return 
     */
    public double getArea()
    {
        return this.width*this.height;
    }
    
    /**
     * Ez a metódus adja meg, az aktuális téglalap kerületét.
     * @return 
     */
    public double getPerimeter()
    {
        return 2*(this.width+this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
    
}
