/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class QuadraticTest {
    public static void main(String[] args) {
        QuadraticEquation qe1 = new QuadraticEquation(7, -2, 9);
        QuadraticEquation qe2 = new QuadraticEquation(-1, 9, 12);
        QuadraticEquation qe3 = new QuadraticEquation(4, 11, 21);
        if(qe1.getDiscriminant()>0)
        {
            System.out.println("Első diszkrimináns: "+qe1.getRoot1());
            System.out.println("Második diszkrimináns: "+qe1.getRoot2());
           
        }
        else if(qe1.getDiscriminant()==0)
        {
            System.out.println(qe1.getRoot1());
        }
        else
             System.out.println("The equation has no roots.");
        
        System.out.println("________________________________________");
        //--------------------------------------------------------//
        
        if(qe2.getDiscriminant()>0)
        {
            System.out.println("Első diszkrimináns: "+qe2.getRoot1());
            System.out.println("Második diszkrimináns: "+qe2.getRoot2());
           
        }
        else if(qe2.getDiscriminant()==0)
        {
            System.out.println(qe2.getRoot1());
        }
        else
             System.out.println("The equation has no roots.");
        
        System.out.println("________________________________________");
        //-------------------------------------------------------------//
        if(qe3.getDiscriminant()>0)
        {
            System.out.println("Első diszkrimináns: "+qe3.getRoot1());
            System.out.println("Második diszkrimináns: "+qe3.getRoot2());
           
        }
        else if(qe3.getDiscriminant()==0)
        {
            System.out.println(qe3.getRoot1());
        }
        else
             System.out.println("The equation has no roots.");
    }
    
}
