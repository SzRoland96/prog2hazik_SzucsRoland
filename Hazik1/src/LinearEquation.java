/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Ez az osztály segít megoldani a való világbeli lineáris egyenletrendszereket.
 * @author Roland
 */
public class LinearEquation {
    
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    /**
     * Ez a konstruktor létrehoz egy random összeállított lineáris egyenletet.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f 
     */
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    /**
     * Ez a metódus megmondja, hogy a lineáris egyenletünknek van e megoldása.
     * Ha van True, ha nincs False értéket ad vissza.
     * @return 
     */
    public boolean isSolvable()
    {
        if(((this.a*this.d)-(this.b*this.c))!=0)
            return true;
        else
            return false;
            
    }
    /**
     * Megadja a lineáris egyenletből az X értékét.
     * @return 
     */
    public double getx()
    {
        return ((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c));
    }
    /**
     * Megadja a lineáris egyenletből az Y értékét.
     * @return 
     */
    public double gety()
    {
        return ((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c));
    }
    
}
