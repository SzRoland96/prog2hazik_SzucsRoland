/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class KarácsonyiHozzávalók {

    private String hozzávaló;
    private int mennyiség;

    public KarácsonyiHozzávalók(String hozzávaló, int mennyiség) {
        this.hozzávaló = hozzávaló;
        this.mennyiség = mennyiség;
    }

    public String getHozzávaló() {
        return hozzávaló;
    }

    public void setHozzávaló(String hozzávaló) {
        this.hozzávaló = hozzávaló;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public String toString() {
        return "Kar\u00e1csonyiHozz\u00e1val\u00f3k{" + "hozz\u00e1val\u00f3=" + hozzávaló + ", mennyis\u00e9g=" + mennyiség + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.hozzávaló);
        hash = 17 * hash + this.mennyiség;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KarácsonyiHozzávalók other = (KarácsonyiHozzávalók) obj;
        return true;
    }
    
    

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> hozzávalók = new HashMap<>();
        String sor = null;
        KarácsonyiHozzávalók kh;
        while (!(sor = sc.nextLine()).equals("")) {
            String[] token = sor.split(";");
            kh = new KarácsonyiHozzávalók(token[0], Integer.parseInt(token[1]));

            if (hozzávalók.containsKey(token[0])) {
                Integer value = hozzávalók.get(token[0]);
                hozzávalók.replace(token[0], value + Integer.parseInt(token[1]));
            } else {
                hozzávalók.put(token[0], Integer.parseInt(token[1]));
            }
        }

        //hozzávalók.forEach((key,value) -> System.out.println(key + ";" + value));
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(hozzávalók.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> t1, Entry<String, Integer> t2) {
                if (t2.getValue().compareTo(t2.getValue()) == 0) {
                    return t2.getKey().compareTo(t2.getKey());
                } else {
                    return t2.getValue().compareTo(t2.getValue());
                }
            }
        });

        for (Entry<String, Integer> item : list) {
            String kimenet = item.getKey() + ";" + item.getValue();
            System.out.println(kimenet);
        }

    }

}


