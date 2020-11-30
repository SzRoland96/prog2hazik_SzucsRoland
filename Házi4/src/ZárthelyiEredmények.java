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
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class ZárthelyiEredmények {
    
    private String hallgatóNév;
    private int pontszám;

    public ZárthelyiEredmények(String hallgatóNév, int pontszám) {
        this.hallgatóNév = hallgatóNév;
        this.pontszám = pontszám;
    }

    public String getHallgatóNév() {
        return hallgatóNév;
    }

    public int getPontszám() {
        return pontszám;
    }

    @Override
    public String toString() {
        return "Z\u00e1rthelyiEredm\u00e9nyek{" + "hallgat\u00f3N\u00e9v=" + hallgatóNév + ", pontsz\u00e1m=" + pontszám + '}';
    }
    
    
}


class Main3 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        Map<String,Integer> eredmények = new HashMap<>();
    String sor = null;
    ZárthelyiEredmények kh;
    while ( !(sor = sc.nextLine()).equals("")) {
        String[] token = sor.split(";");
        kh = new ZárthelyiEredmények(token[0], Integer.parseInt(token[1]));
        
        if (eredmények.containsKey(token[0])) {
            Integer value = eredmények.get(token[0]);
            eredmények.replace(token[0], value+Integer.parseInt(token[1]));
        }
        else {
            eredmények.put(token[0], Integer.parseInt(token[1]));
        }
    }
    
    //hozzávalók.forEach((key,value) -> System.out.println(key + ";" + value));
    
    List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(eredmények.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t, Map.Entry<String, Integer> t1) {
                if (t.getValue().compareTo(t1.getValue()) == 0) {
                    return t.getKey().compareTo(t1.getKey());
                }
                else {
                    return t1.getValue().compareTo(t.getValue());
                }
            }
        });
    
    for (Map.Entry<String, Integer> item : list) {
        String kimenet = item.getKey()+": "+item.getValue()+ " pont";
        System.out.println(kimenet);
    }
    
    }
    
}
