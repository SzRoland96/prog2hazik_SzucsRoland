/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fejesek implements Comparable<Fejesek>{
    public String nev;
    public int osszgol;
    public int szabadrugas;
    public int bunteto;
    public int akciogol;
    public double fejgol;

    public Fejesek(String nev, int osszgol, int szabadrugas, int bunteto, int akciogol, double fejgol) {
        super();
        this.nev = nev;
        this.osszgol = osszgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
        this.akciogol = akciogol;
        this.fejgol = fejgol;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOsszgol() {
        return osszgol;
    }

    public void setOsszgol(int osszgol) {
        this.osszgol = osszgol;
    }

    public int getSzabadrugas() {
        return szabadrugas;
    }

    public void setSzabadrugas(int szabadrugas) {
        this.szabadrugas = szabadrugas;
    }

    public int getBunteto() {
        return bunteto;
    }

    public void setBunteto(int bunteto) {
        this.bunteto = bunteto;
    }

    public int getAkciogol() {
        return akciogol;
    }

    public void setAkciogol(int akciogol) {
        this.akciogol = akciogol;
    }

    public double getFejgol() {
        return fejgol;
    }

    public void setFejgol(double fejgol) {
        this.fejgol = fejgol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(nev).append(": ").append((int)fejgol);
        
        return sb.toString();
    }
    
    @Override
    public int compareTo(Fejesek o) {
       int diff=Double.compare(o.fejgol, this.fejgol);
       if(diff!=0) return diff;
       
       int diff2=Integer.compare(o.osszgol, this.osszgol);
       if(diff2!=0) return diff2;
       
       int diff3=Integer.compare(this.bunteto, o.bunteto);
       if(diff3!=0) return diff3;
       
       return this.nev.compareTo(o.nev);
    }
    
    
    public static void main(String[] args) throws IOException {
        String line;
        String[] token;
        int esetszam,i;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Fejesek[] tomb;
        
        esetszam=Integer.parseInt(br.readLine());
        tomb=new Fejesek[esetszam];
        
        for(i=0;i<esetszam;i++)
        {
            line=br.readLine();
            token=line.split(";");
            
            tomb[i]=new Fejesek(token[0], Integer.parseInt(token[1]), Integer.parseInt(token[2]), Integer.parseInt(token[3]), 0, 0);
            tomb[i].akciogol=tomb[i].osszgol-(tomb[i].szabadrugas+tomb[i].bunteto);
            tomb[i].fejgol=tomb[i].akciogol*0.2+tomb[i].szabadrugas*0.4;
        }
        
        Arrays.sort(tomb);
        
        for (Fejesek j : tomb) {
            System.out.println(j);
        }
    }

    
    }
