/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class KatonaTeszt {
    public static Katona megkuzd(Katona k1, Katona k2)
    {
        if(k1.getAttack()>k2.getDefense())
        {
            System.out.println(k1+" vs "+k2);
            System.out.println("A győztes: "+k1+"\n");
            return k1;
        }
        else if(k2.getAttack()>k1.getDefense())
        {
            System.out.println(k1+" vs "+k2);
            System.out.println("A győztes: "+k2+"\n");
            return k2;
        }
        else
        {   
            System.out.println(k1+" vs "+k2);
            System.out.println("A győztes: "+k1+"\n");
            return k1;
        }
    }
    
    public static void main(String[] args) {
        
        Nyilas ny1 = new Nyilas(15,20,10);
        Nyilas ny2 = new Nyilas(12,24,15);
        Lándzsás l1 = new Lándzsás(100,30);
        megkuzd(megkuzd(ny1,ny2),l1);
    }
}
