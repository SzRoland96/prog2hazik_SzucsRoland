
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
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int osszeg = 0;
        int reszosszeg = 0;
        String szam = new String();
        szam = sc.nextLine();

        for(int i=0; i<16; i++){
           if(i%2==0){
               reszosszeg = 2*Character.getNumericValue(szam.charAt(i));
               if(reszosszeg>9){
                   reszosszeg -=9; 
               } 
               osszeg += reszosszeg; 
           }
           else
               osszeg += Character.getNumericValue(szam.charAt(i));
        }
        if(osszeg%10==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
