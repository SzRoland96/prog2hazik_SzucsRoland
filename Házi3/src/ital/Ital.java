/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Objects;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Roland
 */
public class Ital implements Comparable<Ital>  {
    
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return this.név+" ,"+this.kiszerelés+" ,"+this.ár+" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    public boolean equals(Ital obj) {
        if((this.név == obj.név) && (this.kiszerelés == obj.kiszerelés))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int CompareTo(Ital o) {
        if(this.ár ==  o.getÁr())
        {
            return 0;
        }
        else if(this.ár > o.getÁr())
        {
            return 1;
        }
        else
            return -1;
    }
    
    
    
}
