
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
public class IzzasztóFeladat {
    
    
    private String város;
    private int hőfok;

    public IzzasztóFeladat(String város, int hőfok) {
        this.város = város;
        this.hőfok = hőfok;
    }

    public IzzasztóFeladat(String város) {
        this.város = város;
    }
    

    public String getVáros() {
        return város;
    }

    public int getHőfok() {
        return hőfok;
    }

    public void setHőfok(int hőfok) {
        this.hőfok = hőfok;
    }
    

    
    public String toString() {
        return this.város+" ("+this.hőfok+")";
    }
    
    
    public static boolean Rendezhető_e(IzzasztóFeladat[] t)
    {
        String keres= t[0].getVáros();
        boolean rendezhető = false;
        
        for (int i = 1; i < t.length; i++)
        {
            if(t[i].getVáros().equals(keres))
            {
                t[0].setHőfok(t[i].getHőfok());
               rendezhető = true;
            }
        }
        return rendezhető;
    }
    
    public static void Rendez(IzzasztóFeladat [] t)
    {
        
        for (int i = 1; i < t.length-1; i++) {
            for (int j = i+1; j < t.length; j++) {
                if(t[i].getHőfok() == t[j].getHőfok())
                {
                    if(t[i].getVáros().compareTo(t[j].getVáros()) > 0)
                    {
                        IzzasztóFeladat csere = t[i];
                        t[i]= t[j];
                        t[j] =csere;
                    }
                }
                else if(t[i].getHőfok() < t[j].getHőfok())
                {
                    IzzasztóFeladat csere = t[i];
                    t[i] = t[j];
                    t[j] = csere;
                }
            }
            
        }
        
    }
    
    public static void kiír(IzzasztóFeladat [] t)
    {
        
        for (int i = 1; i < t.length; i++) {
            if(t[i].getHőfok() > t[0].getHőfok())
            {
                System.out.println(t[i]);
            }
            else
            {
                continue;
            }
            
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sor = null;
        sor = input.nextLine();
        String[] token = sor.split(" ");
        int n= Integer.parseInt(token[0]);
        IzzasztóFeladat[] sorok = new IzzasztóFeladat[n+1];
        IzzasztóFeladat város = new IzzasztóFeladat(token[1]);
        sorok[0]=város;
        
        int i=1;
        while(i <= n)
        {
            sor= input.nextLine();
            String [] token2 = sor.split(":");
            IzzasztóFeladat city = new IzzasztóFeladat(token2[0], Integer.parseInt(token2[1]));
            sorok[i]=city;
            i++;
        }
        if(Rendezhető_e(sorok))
        {
            Rendez(sorok);
            System.out.println("--------------------------------------");
            kiír(sorok);
        }
        else
        {
            System.out.println("--------------------------------------");
            System.out.println("Missing data");
        }        
        
    }
    
    
}
