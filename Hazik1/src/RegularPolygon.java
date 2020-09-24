/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Ez az osztály az N-oldalú sokszögek modellezésére szolgál!
 * @author Roland
 */
import java.lang.Math;
public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;
    /**
     * Ez a konstruktor egy megadott oldalhosszú és oldalú sokszöget hoz létre
     *  (0;0) középpontal.
     */
    public RegularPolygon() {
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }
    /**
     * Ez a konstruktor egy random oldalszámú és oldalhosszú sokszöget hoz létre
     * (0;0) középpontal.
     * @param n
     * @param side 
     */
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter()
    {
        return this.n*this.side;
    }
    public double getArea()
    {
        return 0.25*this.n*Math.pow(this.side, 2)*(1/Math.tan((Math.PI/n)));
    }

    @Override
    public String toString() {
        return "RegularPolygon{" + "n=" + n + ", side=" + side + '}';
    }
}
