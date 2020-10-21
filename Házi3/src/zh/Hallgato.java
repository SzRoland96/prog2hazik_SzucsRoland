/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Random;

/**
 *
 * @author Roland
 */
public class Hallgato {
    
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        if(mennyitKeszult >=0 && mennyitKeszult<=5)
        {
            this.mennyitKeszult = mennyitKeszult;
        }
        
        this.sokatTanul = sokatTanul;
    }
    public Dolgozat dolgozatotIr()
    {
        
        Random random = new Random();
        int veletlenszam = random.nextInt(100)+1;
        int [] t = new int[2];
        for (int i = 0; i < 1; i++) {
            t[0] = random.nextInt(100)+1;
            t[1]= random.nextInt(100)+1;
            
        }
        if(veletlenszam == t[0] || veletlenszam == t[1])
        {
            Dolgozat doga1 = new Dolgozat(-1);
            System.out.println("Nem írt!");
            return doga1;
        }
        else if(this.sokatTanul== true)
        {
            Random random2 = new Random();
            int pont= (random.nextInt(4)+4)*this.mennyitKeszult;
            Dolgozat doga1 = new Dolgozat(pont);
            return doga1;
        }
        else
        {
            Random random3 = new Random();
            int pont= (random.nextInt(6))*this.mennyitKeszult;
            Dolgozat doga1 = new Dolgozat(pont);
            return doga1;
        }
        
        
    }
    
}
