/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class Bankkartya {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int subtotal = 0;
        String szam = "";
        int c = 1;
        System.out.println("Az állományvégjel az üres sor!");
        try {
        while (szam != null) {
            szam = sc.nextLine();

        for(int i=0; i<16; i++){
           if(i % 2 == 0){
               subtotal = 2*Character.getNumericValue(szam.charAt(i));
               if(subtotal>9){
                   subtotal  -= 9; 
               } 
               sum += subtotal; 
           }
           else
               sum += Character.getNumericValue(szam.charAt(i));
        }
        if(sum % 10 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        c++;
        
}
        } catch (Exception ex) {
            sc.close();
        }

    }
}