/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Ez az osztály egy kétdimenziós pont modellezésére szolgál.
 * @author Roland
 */
public class Pont {
    
    private double x;
    private double y;
    /**
     * Ez szolgál a Pont életre keltésére, megkonstruálására.
     * @param x: Tartalmazza a Pont X koordinátáit.
     * @param y : Tartalmazza a Pont Y koordinátáit.
     */
    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
