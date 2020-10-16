
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
public class Hullámvasutak {
    private String nev;
    private String világ;
    private int magassag;
    private int varakozasiIdo;

    public Hullámvasutak(String nev, String világ, int magassag, int varakozasiIdo) {
        this.nev = nev;
        this.világ = világ;
        this.magassag = magassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getNev() {
        return nev;
    }

    public String getVilág() {
        return világ;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    @Override
    public String toString() {
        return this.nev+" ("+this.világ+"): "+this.varakozasiIdo;               
      }

    private static void rendez(Hullámvasutak[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i].getVarakozasiIdo() == a[j].getVarakozasiIdo()) {
                    if (a[i].getMagassag() == a[j].getMagassag()) {
                        if (a[i].getNev().compareTo(a[j].getNev()) > 0) {
                            Hullámvasutak tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;

                        }
                    }else if(a[i].getMagassag()<a[j].getMagassag())
                        {  Hullámvasutak tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                    
                       }
                } else if(a[i].getVarakozasiIdo()>a[j].getVarakozasiIdo())
                      {
                            Hullámvasutak tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;                
                       }
            }
        }
    }

    public static void kiir(Hullámvasutak [] t)
    { 
        for (int i=0;i<t.length;i++)
            System.out.println(t[i]);
    
    
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Hullámvasutak[] t = new Hullámvasutak[n];
        int i = 0;

        String sor = null;

        while (i < n) {

            sor = sc.nextLine();

            String[] tokens = sor.split(";");

            Hullámvasutak h = new Hullámvasutak(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
            t[i] = h;
            i++;

        }

        rendez(t);
        System.out.println("-------------------------Kimenet---------------");
        kiir(t);
    }
    
}
