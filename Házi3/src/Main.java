import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Main {
    
    public static Aszu[] ÖtPuttony (Bor [] t)
    {
        
        Aszu[] borok = new Aszu[t.length];
        int index = 0;
        int db=0;
        for (int i = 0; i < t.length; i++) {
            if(t[i] instanceof Aszu){    
                borok[index] = (Aszu) t[i];
                if(borok[index].getPuttonySzam()==5)
                {
                    db++;
                    index++;
                }
            }
        }
        Aszu[] aszuk = new Aszu[db];
        index=0;
        for (int j = 0; j < db; j++) {
            if(borok[j].getPuttonySzam()==5)
            {
                aszuk[j] = borok[j];
            }
            
        }
        
        return aszuk;
    }
    public static void kiír(Aszu [] t)
    {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
            
        }
    }
    
    public static void main(String[] args) {
    
        Bor[] borok = new Bor[]
        {
            new Bor("szőlő1","Tokaj","Száraz",35),
            new Bor("szőlő2","Eger","Édes",30),
            new Bor("szőlő3","Villány","Fél-Száraz",25),
            new Aszu(5,"Tokaj",30),
            new Aszu(6,"Tokaj",25),
            new Aszu(5,"Tokaj-Alsó",20)
        };
        kiír(ÖtPuttony(borok));
        
    
    }
    
}
