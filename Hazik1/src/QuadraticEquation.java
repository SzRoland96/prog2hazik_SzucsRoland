/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Ez az osztály segít megoldani a való világbeli másodfokú egyenleteket.
 * @author Roland
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    
    /**
     * Ez a konstruktor létrehoz egy random másodfokú egyenletet.
     * @param a
     * @param b
     * @param c 
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    /**
     * Ez a metódus segít kiszámolni a másodfokú egyenlet diszkriminánsát /gyök alatti területét/.
     * @return 
     */
    public double getDiscriminant()
    {
        return (this.b*this.b)-(4*this.a*this.c);
    }
    /**
     * Ez a metódus a kiszámolt diszkrimináns segítségével adja meg a másodfokú egyenlet
     * első megoldását.
     * Ha a diszkrimináns nulla, hibaüzenettel félbeszakad a program.
     * @return 
     */
    public double getRoot1()
    {
      if(this.getDiscriminant()<0)
      { System.out.println("Negatív diszkriminans, nincs valós gyök");
         return 0;
      }
      else 
      return (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
    
    }
    /**
     * Ez a metódus a kiszámolt diszkrimináns segítségével adja meg a másodfokú egyenlet
     * második megoldását.
     * @return 
     */
       public double getRoot2()
    {
     
        return (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
    
    
    }

    @Override
    public String toString() {
        return "QuadraticEquation:" +this.a+"x^2+"+this.b+"x+"+this.c;
    }
}