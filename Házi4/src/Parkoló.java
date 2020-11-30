


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class Parkoló implements Comparable<Parkoló>{
    
    private String cím;
    private double terület;
    private int kapacitás;
    private List<String> parkoló_autók;

    public Parkoló(String cím, double terület, int kapacitás) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
        this.parkoló_autók = new ArrayList<>();
    }

    public String getCím() {
        return cím;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public double getTerület() {
        return terület;
    }
    
    

    public List<String> getParkoló_autók() {
        return parkoló_autók;
    }

    @Override
    public String toString() {
        return this.cím+": "+(this.kapacitás-this.parkoló_autók.size())+" szabad hely";
    }
    
    int getSzabadHelyek() {
        return (this.kapacitás - this.parkoló_autók.size());
    }

    @Override
    public int compareTo(Parkoló t) {
             if (this.getSzabadHelyek() == t.getSzabadHelyek()) {
             return this.cím.compareTo(t.getCím());
         }
             else {
                 //return this.getSzabadHelyek() - t.getSzabadHelyek();
             return Integer.compare(t.getSzabadHelyek(), this.getSzabadHelyek());
             //return Double.compare(kapacitás, kapacitás);
         }
   
    }
    
}


class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<Parkoló> li = new ArrayList<>();
        System.out.println("Az állományvégjel az üres sor!");
        while (!(sor = sc.nextLine()).equals("")) {
            String [] tmp = sor.split(";");
            Parkoló p = new Parkoló(tmp[0], Double.parseDouble(tmp[1]),Integer.parseInt(tmp[2]));
            
            for (int i = 3; i < tmp.length; i++) {
                p.getParkoló_autók().add(tmp[i]);
                
            }
            
            li.add(p);
        }
        
        Collections.sort(li);
        
        for (Parkoló j : li) {
            if (j.getSzabadHelyek() >= 3) {
                System.out.println(j);
            }
            
        }
        
    }
}
