/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        Hallgato[] hallgatok = new Hallgato[n];
        
        int i =0;
        String sor = null;
        
        while(i<n)
        {
            sor = sc.nextLine();
            String[] token = sor.split(" ");
            Hallgato hallgato = new Hallgato(Integer.parseInt(token[0]), Boolean.parseBoolean(token[1]));
            hallgatok[i] = hallgato;
            i++;
            
        }
        for (int j = 0; j < hallgatok.length; j++) {
            boolean a =hallgatok[j].dolgozatotIr().megfelelt();
            boolean b =hallgatok[j].dolgozatotIr().megfelelt();
            if(a && b)
            {
                System.out.println("Megfelelt!");
            }
            else
            {
                System.out.println("Nem felelt meg!");
            }
        }
        
        
    }
    
}
