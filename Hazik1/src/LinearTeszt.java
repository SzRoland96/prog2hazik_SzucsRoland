/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class LinearTeszt {
    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation le2 = new LinearEquation(7,8,9,10,11,12);
        LinearEquation le3 = new LinearEquation(13,14,15,16,17,18);
        
        if((le1.isSolvable())==false)
        {
            System.out.println("The equation has no solution.");
        }
        else
            System.out.println("X= "+le1.getx());
            System.out.println("Y= "+le1.gety());
        
            
        System.out.println("__________________________________");
        
        if((le2.isSolvable())==false)
        {
            System.out.println("The equation has no solution.");
        }
        else
            System.out.println("X= "+le2.getx());
            System.out.println("Y= "+le2.gety());
            
            
        System.out.println("__________________________________");  
            
        if((le3.isSolvable())==false)
        {
            System.out.println("The equation has no solution.");
        }
        else
            System.out.println("X= "+le3.getx());
            System.out.println("Y= "+le3.gety());
    }
    
}
