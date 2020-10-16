
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Fejesek2_teszt {
    
    public static void TornaSor(Fejesek2[] t)
    {
        String aktuálismin = t[0].getNév();
        String keres = t[0].getElőtte();
        int length = t.length;
        String[] sorrend = new String[length];
        sorrend[0] = t[0].getNév();
        
        int db=1;
        for (int i = 1; i < length;) {
            if(db==length)
            {
                break;
            }
            if(t[i].getElőtte().equals(aktuálismin))
            {
                sorrend[db]=t[i].getNév();
                aktuálismin= t[i].getNév();
                db++;
                i=1;
            }
            else 
            {
                i++;
            }
            
        }
        
        int piros = 0;
        int kék = 0;
        int sorszám=0;
        for (int j = 0; j < sorrend.length; j++) {
            if(sorrend[j].equals(keres))
            {
                sorszám=j+1;
            }
            
        }
        while(sorszám > 1)
        {
            sorszám--;
            if(sorszám % 2 == 0)
            {
                kék++;
            }
            else
            {
                piros++;
            }
        }
        System.out.println(piros+ " "+ kék);
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sor  = null;
        
        sor = input.nextLine();
        String [] token = sor.split(";");
        
        int n = Integer.parseInt(token[0]);
        
        Fejesek2 [] tornasor = new Fejesek2[n];
        Fejesek2 minta = new Fejesek2(token[1],token[2]);
        tornasor [0]= minta;
        
        int i =1;
        while(i<n)
        {
            sor= input.nextLine();
            String [] token2 = sor.split(";");
            Fejesek2 t = new Fejesek2 (token2[0],token2[1]);
            tornasor[i] = t;
            i++;
        }
        TornaSor(tornasor);
    
    }
    
}
