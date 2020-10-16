/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class NégySzám {
    
    public static boolean isConsecutiveFour(int[] values)
    {
        int db=1;
        
        if(values.length<4)
        {
            return false;
            
        }
        int szám=values[0];
        boolean igaz = false;
        for (int i = 1; i < values.length; i++) {
            if(values[i]==szám)
            {
                db++;
            }
            else
            {
                db=1;
                szám=values[i];
            }
            if(db>4)
            {
                igaz = false;
            }
            else if(db == 4)
            {
                igaz = true;
            }
            
            
        }
        return igaz;
    }
    
    
    
    
    public static void main(String[] args) {
        int [] tomb= new int[]{1,2,3,3,3,4,4,4,4,5,6,7,8,9,10};
        int [] tomb2 = new int[]{1,1,1,0,1,4,5,1};
        int [] tomb3 = new int []{1,3,4};
        int [] tomb4 = new int[]{1,2,3,4,5};
        int [] tomb5 = new int []{9,9,9};
        System.out.println("Az adott tömbben van  4 egymást követő egyforma szám: "+isConsecutiveFour(tomb));
        System.out.println("Az adott tömbben van  4 egymást követő egyforma szám: "+isConsecutiveFour(tomb2));
        System.out.println("Az adott tömbben van  4 egymást követő egyforma szám: "+isConsecutiveFour(tomb3));
        System.out.println("Az adott tömbben van  4 egymást követő egyforma szám: "+isConsecutiveFour(tomb4));
        System.out.println("Az adott tömbben van  4 egymást követő egyforma szám: "+isConsecutiveFour(tomb5));
        
    
    }
}
