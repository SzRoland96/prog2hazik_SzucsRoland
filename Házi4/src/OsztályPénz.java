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
public class OsztályPénz {
    
    private String tanulóNév;
    private int osztálypénz;

    public OsztályPénz(String tanulóNév, int osztálypénz) {
        this.tanulóNév = tanulóNév;
        this.osztálypénz = osztálypénz;
    }

    public String getTanulóNév() {
        return tanulóNév;
    }

    public int getOsztálypénz() {
        return osztálypénz;
    }

    public void setTanulóNév(String tanulóNév) {
        this.tanulóNév = tanulóNév;
    }

    public void setOsztálypénz(int osztálypénz) {
        this.osztálypénz = osztálypénz;
    }

    @Override
    public String toString() {
        return "Oszt\u00e1lyP\u00e9nz{" + "tanul\u00f3N\u00e9v=" + tanulóNév + ", oszt\u00e1lyp\u00e9nz=" + osztálypénz + '}';
    }
    
    
    
    
}

class Main4 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        Map<String,Integer> hozzávalók = new HashMap<>();
    String sor = null;
    OsztályPénz kh;
    while ( !(sor = sc.nextLine()).equals("")) {
        String[] token = sor.split(";");
        kh = new OsztályPénz(token[0], Integer.parseInt(token[1]));
        
        if (hozzávalók.containsKey(token[0])) {
            Integer value = hozzávalók.get(token[0]);
            hozzávalók.replace(token[0], value+Integer.parseInt(token[1]));
        }
        else {
            hozzávalók.put(token[0], Integer.parseInt(token[1]));
        }
    }
    
    //hozzávalók.forEach((key,value) -> System.out.println(key + ";" + value));
    
    List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hozzávalók.entrySet());
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
        String kimenet = item.getKey()+";"+item.getValue();
        System.out.println(kimenet);
    }
    
    }
    

    }
