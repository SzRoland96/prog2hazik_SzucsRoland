
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
public class BudapestKupaTeszt {
    
    private String év;
    private String hónap;
    private String nap;
    private String túranév;
    private int résztáv;

    public BudapestKupaTeszt(String év, String hónap, String nap, String túranév) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.túranév = túranév;
    }

    public String getÉv() {
        return év;
    }

    public String getHónap() {
        return hónap;
    }

    public String getNap() {
        return nap;
    }

    public String getTúranév() {
        return túranév;
    }

    public int getRésztáv() {
        return résztáv;
    }

    public void setRésztáv(int résztáv) {
        this.résztáv = résztáv;
    }

    @Override
    public String toString() {
        return év+";"+ hónap+";"+nap+";"+ túranév;
    }
    public static int Max(BudapestKupaTeszt [] t)
    {
        int max =0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getRésztáv() > max) {
                max=t[i].getRésztáv();
                
            }
            
        }
        return max;
    }
    
    public static void Rendez(BudapestKupaTeszt [] t)
    {
        for (int i = 0; i <t.length-1; i++) {
            for (int j = i+1; j < t.length; j++) {
                if (t[i].getRésztáv() < t[j].getRésztáv()) {
                    BudapestKupaTeszt csere = t[i];
                    t[i] = t[j];
                    t[j] = csere;
                    
                }
                else if(Integer.parseInt(t[i].getÉv()) > Integer.parseInt(t[j].getÉv()))
                {
                    BudapestKupaTeszt csere = t[i];
                    t[i] = t[j];
                    t[j] = csere;
                }
                else if(Integer.parseInt(t[i].getÉv()) == Integer.parseInt(t[j].getÉv()))
                {
                    if(Integer.parseInt(t[i].getHónap()) > Integer.parseInt(t[j].getHónap()))
                    {
                        BudapestKupaTeszt csere = t[i];
                        t[i] = t[j];
                        t[j] = csere;
                    }
                    else if(Integer.parseInt(t[i].getHónap()) == Integer.parseInt(t[j].getHónap()))
                    {
                        if(Integer.parseInt(t[i].getNap()) > Integer.parseInt(t[j].getNap()))
                        {
                            BudapestKupaTeszt csere = t[i];
                            t[i] = t[j];
                            t[j] = csere;
                        }
                        
                        if(Integer.parseInt(t[i].getNap()) == Integer.parseInt(t[j].getNap()))
                        {
                            if(t[i].getTúranév().compareTo(t[j].getTúranév())>0)
                            {
                                BudapestKupaTeszt csere = t[i];
                                t[i] = t[j];
                                t[j] = csere;
                            }
                        }
                    }
                }
                
            }
            
        }
    }
    
    
    
    
    
    public static void kiír(BudapestKupaTeszt [] t)
    {
        for (int i = 0; i < t.length; i++) {
            
            if(t[i].getRésztáv() == Max(t))
            {
                System.out.println(t[i]);
            }
        }
    }
    

    
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        int i =0;
        BudapestKupaTeszt [] túra = new BudapestKupaTeszt[n];
        while(i<n)
        {
            String sor = input.nextLine();
            String [] token = sor.split(";");
            BudapestKupaTeszt bk = new BudapestKupaTeszt(token[0],token[1],token[2],token[3]);
            for (int j = 4; j < token.length; j++) {
                
                bk.setRésztáv(bk.getRésztáv()+Integer.parseInt(token[j]));
            }
            túra [i] =bk;
            i++;
            
        }
        Rendez(túra);
        System.out.println("--------------------------");
        kiír(túra);
        
    }
}
