/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Roland
 */
public class Hátizsák implements Comparable<Hátizsák> {
    
    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSz\u00e1ma=" + zsebekSzáma + ", v\u00edzhatlan=" + vízhatlan + '}';
    }

    @Override
    public int compareTo(Hátizsák t) {
       if (this.márka.compareTo(t.getMárka()) == 0) {
          return (-1)*Integer.compare(this.zsebekSzáma, t.getZsebekSzáma());
       }
       else {
           return this.márka.compareTo(t.getMárka());
       }
    }
    
    
}

class Test2 {
    
    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben (List<Hátizsák> lista) {
        for (Hátizsák i : lista ) {
            System.out.println(i);
        }
    }
    
    
    public static void main(String[] args) {
        List<Hátizsák> li = new ArrayList<>();
        li.add(new Hátizsák("Nike",5.5,4,true));
        li.add(new Hátizsák("Adidas",6.00,3,false));
        li.add(new Hátizsák("Puma",10.00,6,true));
        li.add(new Hátizsák("Fila",8.5,2,false));
        li.add(new Hátizsák("Zara",12.0,6,true));
        li.add(new Hátizsák("Budmil",12.0,5,true));
        li.add(new Hátizsák("Budmil",10.0,4,false));
        li.add(new Hátizsák("Adidas",12.0,3,true));
        li.add(new Hátizsák("Nike",10.00,5,false));
        li.add(new Hátizsák("Zara",12.00,5,true));
        li.add(new Hátizsák("Nike",15.0,4,true));
        li.add(new Hátizsák("Adidas",20.0,3,true));
        li.add(new Hátizsák("Nike",12.00,5,false));
        li.add(new Hátizsák("Budmil",12.50,5,true));
        
        
        
        
        
        Collections.sort(li);
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(li);
        
        
    }
}