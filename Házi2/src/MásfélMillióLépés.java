
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
public class MásfélMillióLépés {
    
    private String túristanév;
    private String útvonal;
    private int kék;
    private int többi;

    public MásfélMillióLépés(String túristanév, String útvonal) {
        this.túristanév = túristanév;
        this.útvonal = útvonal;
    }

    public String getTúristanév() {
        return túristanév;
    }

    public String getÚtvonal() {
        return útvonal;
    }

    public int getKék() {
        return kék;
    }

    public int getTöbbi() {
        return többi;
    }
    

    public void setKék(int kék) {
        this.kék = kék;
    }

    public void setTöbbi(int többi) {
        this.többi = többi;
    }

    @Override
    public String toString() {
        return this.túristanév;
    }
    
    public static int kékútvonalakszáma(String t)
    {
        int db =0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'K')
            {
                
                db++;
                
            }
            
        }
        return db;
    }
    public static int többiútvonalakszáma(String t)
    {
        int db =0;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == 'P' || t.charAt(i) == 'S' || t.charAt(i) == 'Z')
            {
                db++;
            }
            
        }
        return db;
    }
    
    
    public static void kiír(MásfélMillióLépés [] t)
    {
        for (int i = 0; i < t.length; i++) {
            
            System.out.println(t[i]);
            
        }
    }
    public static void rendez(MásfélMillióLépés [] t)
    {
        for (int i = 0; i < t.length-1; i++) 
        {
            for (int j = i+1; j < t.length; j++) 
            {
                if(t[i].getKék() < t[j].getKék())
                {
                    MásfélMillióLépés csere = t[i];
                    t[i] = t[j];
                    t[j]=csere;
                }
                else if(t[i].getKék() == t[j].getKék())
                {
                    if(t[i].getTöbbi() < t[j].getTöbbi())
                    {
                        MásfélMillióLépés csere = t[i];
                        t[i] = t[j];
                        t[j]=csere;
                    }
                    else if(t[i].getTöbbi() == t[j].getTöbbi())
                    {
                        if(t[i].getTúristanév().compareTo(t[j].getTúristanév()) > 0)
                        {
                            MásfélMillióLépés csere = t[i];
                            t[i] = t[j];
                            t[j]=csere;
                        }
                    }
                }
                
            }
            
        }
    }
    
    public static void main(String[] args) {      
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MásfélMillióLépés [] túristák = new MásfélMillióLépés[n];
        int i = 0;
        
        String sor = null;
        while(i<n)
        {
            sor = sc.nextLine();
            String [] token = sor.split(";");
            MásfélMillióLépés út = new MásfélMillióLépés(token[0],token[1]);
            túristák[i] = út;
            túristák[i].setKék(kékútvonalakszáma(túristák[i].getÚtvonal()));
            túristák[i].setTöbbi(többiútvonalakszáma(túristák[i].getÚtvonal()));
            i++;
        }
        rendez(túristák);
        System.out.println("--------------------------------------------");
        kiír(túristák);
            
    }
    
    
}
