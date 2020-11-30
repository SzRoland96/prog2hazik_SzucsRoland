/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiFunction;

/**
 *
 * @author Roland
 */
public class Atomok {

    private String vegyjel;
    private String atomNev;

    public Atomok(String vegyjel, String atomNev) {
        this.vegyjel = vegyjel;
        this.atomNev = atomNev;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public String getAtomNev() {
        return atomNev;
    }

    @Override
    public String toString() {
        return "Molekul\u00e1k{" + "vegyjel=" + vegyjel + ", atomNev=" + atomNev + '}';
    }

}

class FoProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sor = null;
        Set<Atomok> li = new HashSet<>();
        List<Molekulák> li2 = new ArrayList<>();
        System.out.println("Vegyjel:elemnév");
        while (!(sor = reader.nextLine()).equals("-")) {
            String token[] = sor.split(":");
            Atomok a = new Atomok(token[0], token[1]);
            li.add(a);
        }

        // ------------------------------------------------------------------------------------------------------
        System.out.println("A beolvasott atomok:");

        Map<String, String> vegyjelek = new HashMap<>();
        List<Map<String, Integer>> lista = new ArrayList<>();
        List<Molekulák> molekula1 = new ArrayList<>();

        for (Atomok l : li) {
            vegyjelek.put(l.getVegyjel(), l.getAtomNev());
        }

        System.out.println("Molekulanév:vegyjel[vegyjel,vegyjel2,..]");
        while (!(sor = reader.nextLine()).equals("")) {
            String token2[] = sor.split(":|\\,");
            Molekulák m = new Molekulák(token2[0]);
            for (int i = 1; i < token2.length; i++) {
                m.getKomponensek().add(token2[i]);
            }
            li2.add(m);

        }

        for (Molekulák mo : li2) {
            Map<String, Integer> kemiaiElemek = new HashMap<>();
            for (String k : mo.getKomponensek()) {
                if (vegyjelek.containsKey(k)) {
                    String tmp = vegyjelek.get(k);
                    if (kemiaiElemek.containsKey(tmp)) {
                        kemiaiElemek.replace(tmp, kemiaiElemek.get(tmp) + 1);
                    } else {
                        kemiaiElemek.put(tmp, 1);
                    }
                    

                }
            }

            
            List<Map.Entry<String, Integer>> sortedList = new LinkedList<>(kemiaiElemek.entrySet());
            Collections.sort(sortedList, new Comparator<Entry<String, Integer>>() {
                @Override
                public int compare(Entry<String, Integer> t1, Entry<String, Integer> t2) {
                    if (t1.getValue().compareTo(t2.getValue()) == 0) {
                        
                        return t1.getKey().compareToIgnoreCase(t2.getKey());
                    } else {
                        return t2.getValue().compareTo(t1.getValue());
                    }
                }
            });
            mo.setOsszegzes(sortedList);
            molekula1.add(mo);

        }

        Collections.sort(molekula1);

        for (Molekulák l : molekula1) {
            System.out.print(l);

            
        }

    }

}
