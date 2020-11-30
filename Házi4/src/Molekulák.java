/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/**
 *
 * @author Roland
 */
public class Molekulák implements Comparable<Molekulák> {

    private String molekulaNev;
    private List<String> komponensek;
    private List<Map.Entry<String, Integer>> osszegzes;
    
    public Molekulák(String molekulaNev) {
        this.molekulaNev = molekulaNev;
        this.komponensek = new ArrayList<>();
        this.osszegzes = new LinkedList<>();
    }
    
    public String getMolekulaNev() {
        return molekulaNev;
    }
    
    public List<String> getKomponensek() {
        return komponensek;
    }
    
    public List<Map.Entry<String, Integer>> getOsszegzes() {
        return osszegzes;
    }
    
    public void setOsszegzes(List<Map.Entry<String, Integer>> osszegzes) {
        this.osszegzes = osszegzes;
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
        final Molekulák other = (Molekulák) obj;
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.molekulaNev);
        hash = 79 * hash + Objects.hashCode(this.komponensek);
        hash = 79 * hash + Objects.hashCode(this.osszegzes);
        return hash;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.molekulaNev).append(":").append("\n");
        for (Map.Entry<String, Integer> item : osszegzes) {
            sb.append(item.getValue()).append(" ").append(item.getKey()).append("\n");
        }


        return sb.toString();
        
    }
    
    @Override
    public int compareTo(Molekulák t) {
        
        return 2;
        
    }
    
}
