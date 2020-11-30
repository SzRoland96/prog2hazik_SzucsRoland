/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roland
 */
public class ValosSzamok implements RealNumbers {

    private List<Double> l;
    
    public ValosSzamok() {
    this.l = new ArrayList<>();
    
    }

    
    
    @Override
    public void add(double num) {
        l.add(num);
    }

    @Override
    public double get(int idx) {
       return l.get(idx);
    }

    @Override
    public void delete(int idx) {
        l.remove(idx);
    }

    @Override
    public boolean contains(double num) {
        return l.contains(num);
    }

    @Override
    public int getFirstOccurrence(double num) {
         return l.indexOf(num);
    }

    public List<Double> getL() {
        return l;
    }
    
    
    
}

class Test {
    
    public static void main(String[] args) {
        ValosSzamok vsz = new ValosSzamok();
        vsz.add(4.25);
        vsz.add(0.26);
        vsz.add(25.2654);
        vsz.add(25.254);
        vsz.add(0.26);
        vsz.add(25.2654);
        System.out.println("Adott indexu elem: "+vsz.get(1));
        vsz.delete(3);
        
        for (Double i : vsz.getL() ) {
            System.out.println(i);
        }
        
        
        System.out.println("Tartalmazza: "+vsz.contains(25.254));
        System.out.println("Első fordulás: "+vsz.getFirstOccurrence(25.2654));
        
    }
    
}
