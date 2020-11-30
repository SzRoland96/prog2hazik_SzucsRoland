
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Vízgyűjtő {
    private String név;
    private List<String> beleFolynak; // Azok a vizgyűjtők, amelyek ebbe a vízgyűjtőbe közvetlenül belefolynak

    public Vízgyűjtő(String név) {
        this.név = név;
        this.beleFolynak= new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public List<String> getBeleFolynak() {
        return beleFolynak;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vízgyűjtő)) 
            return false;
        
        Vízgyűjtő vz= (Vízgyűjtő)obj;
        return this.név.equals(vz.getNév());
        
       
    }

    @Override
    public String toString() {
        return this.név+": "+this.beleFolynak;
    }
    
    
}
