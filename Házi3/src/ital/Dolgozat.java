/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Roland
 */
public class Dolgozat {
    
    public static SzeszesItal[] MaxAlkohol(Ital[] t)
    {
        SzeszesItal [] alkohol;
        alkohol = new SzeszesItal[t.length];
        int db=0;
        int index =0;
        for (int i = 0; i < t.length; i++) {
            if(t[i] instanceof SzeszesItal)
            {
                alkohol[index] = (SzeszesItal) t[i];
                if(alkohol[index].getAlkoholTartalom()!= 0)
                {
                    db++;
                    index++;
                    }
                
            }
        }
        SzeszesItal [] ital = new SzeszesItal[db];
        for (int i = 0; i < db; i++) {
            ital[i] = alkohol[i];
            
        }
        if(db >=3)
        {
            
             for (int i = 0; i < db-1; i++) {
                 for (int j = i+1; j < db; j++) {
                     if(ital[i].getAlkoholTartalom() < ital[j].getAlkoholTartalom())
                     {
                         SzeszesItal csere = ital[i];
                         ital[i] = ital[j];
                         ital[j] = csere;
                     }
                     
                 }
            }
            //return ital;
        }
        else
            {
             
                return null;
            }
        SzeszesItal [] top3 = new SzeszesItal[3];
        for (int i = 0; i < 3; i++) {
            top3[i]= ital[i];
            
        }
        return top3;
    }
    
    public static void rendez(Ital [] t)
    {
        for (int i = 0; i < t.length-1; i++) {
            for (int j = i+1; j < t.length; j++) {
                if(t[i].getNév().compareTo(t[j].getNév())>0 )
                {
                    Ital csere = t[i];
                    t[i] = t[j];
                    t[j] = csere;
                }
                    
                
            }
            
        }
    }
    
    public static void kiír(Ital [] t)
    {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
            
        }
    }
    
    
    public static void main(String[] args) {
        
        Ital [] italok = new Ital[]
        {
            new Ital("Coca-Cola","0.5L",200),
            new Ital("Fanta","1.75L",450),
            new Ital("Coca-Cola","1.5L",360),
            new Ital("Sprite","0.5L",250),
            new SzeszesItal("Borsodi","0.5L",300,5),
            new SzeszesItal("Jack Danials","0.75L",6800,40),
            new SzeszesItal("Captain Morgan","0.75L",5500,38),
            new SzeszesItal("Egri Bikavér","1L",1250,15),
        };
        
        kiír(MaxAlkohol(italok));
        System.out.println("------------------");
        rendez(italok);
        kiír(italok);
    }
    
}
