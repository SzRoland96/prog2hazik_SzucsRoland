
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






public class VendéglátóMain {
    
    
    public Kocsma[] adottItaltKínálóKocsmák(String ital,VendéglátóipariEgység []k)
    {
        int db=0;
        
        for (int i = 0; i < k.length; i++) {
            if(k[i] instanceof Kocsma)
            {
                 Kocsma tmp = (Kocsma)k[i];
                 for (int j = 0; j < tmp.getSörlap().length; j++) {
                     if(tmp.getSörlap()[j].equals(ital))
                     {
                         db++;
                         break;
                     }
                    
                }
            }
            
        }
        Kocsma [] p = new Kocsma[db];
        int index=0;
        for (int i = 0; i < k.length; i++) {
            if(k[i] instanceof Kocsma)
            {
                 Kocsma tmp = (Kocsma)k[i];
                 for (int j = 0; j < tmp.getSörlap().length; j++) {
                     if(tmp.getSörlap()[j].equals(ital))
                     {
                         p[index++]=tmp;
                         break;
                     }
                    
                }
            }
            
        }
        return p;
        
    }
    
    
    
    public static void main(String[] args) {
        
        VendéglátóipariEgység[] v = new VendéglátóipariEgység[]
        {   
            new Étterem("Étterem-1",20, new String[]{"Húsleves","Rántotthús"}),
            new Étterem("Étterem-2",25, new String[]{"Krumplileves","Töltöttkáposzta"}),
            new Étterem("Étterem-3",30, new String[]{"Babgulyás","Palacsinta"}),
            new Étterem("Étterem-4",35, new String[]{"Gyümölcsleves","Rántott sajt"}),
            new Étterem("Étterem-5",40, new String[]{"Paradicsomleves","Sült oldalas"}),
            new Kocsma("Kocsma-1",50,new String[]{"Heineken","Kőbányi","Borsodi"}),
            new Kocsma("Kocsma-2",95,new String[]{"Heineken","Corona","Soproni"}),
            new Kocsma("Kocsma-3",40,new String[]{"Soproni","Kőbányi","Borsodi"}),
            new Kocsma("Kocsma-4",70,new String[]{"Löwenbrau","Kőbányi","Guinness"}),
            new Kocsma("Kocsma-5",150,new String[]{"Steffl","Stella Artois","Borsodi"}),
            
        };
        VendéglátóMain k = new VendéglátóMain();
        System.out.println(Arrays.toString(k.adottItaltKínálóKocsmák("Borsodi",v)));
    }
    
}
