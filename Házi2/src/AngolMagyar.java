
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
public class AngolMagyar {
    
    private String angol;
    private String magyar;

    public AngolMagyar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    @Override
    public String toString() {
        return this.angol+":"+this.magyar;
    }
    
    public static void rendez(AngolMagyar[] t)
    {
        for (int i = 0; i < t.length-1; i++) 
        {
            for (int j = i+1; j < t.length; j++)
            {
                if(t[i].getAngol().compareTo(t[j].getAngol()) > 0)
                {
                    AngolMagyar csere = t[i];
                    t[i] = t[j];
                    t[j] = csere;
                }
                else if(t[i].getAngol().compareTo(t[j].getAngol()) == 0)
                {
                    if(t[i].getMagyar().compareTo(t[j].getMagyar()) > 0)
                    {
                        AngolMagyar csere = t[i];
                        t[i] = t[j];
                        t[j] = csere;
                    }
                }
                
                
            }
            
        }
    }
    
    public static void kiír(AngolMagyar [] t)
    {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        String sor = null;
        AngolMagyar [] szótár = new AngolMagyar[n];
        
        int i = 0;
        while(i<n)
        {
            sor = sc.nextLine();
            String [] token = sor.split(":");
            AngolMagyar szó = new AngolMagyar(token[0],token[1]);
            szótár[i] = szó;
            
            
            
            i++;
        }
        
        rendez(szótár);
        System.out.println("-------------------------------");
        kiír(szótár);
    }
}
