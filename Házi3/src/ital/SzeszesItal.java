/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Roland
 */
public class SzeszesItal extends Ital{
    private double alkoholTartalom;
    
    public SzeszesItal(String név, String kiszerelés, int ár, double alkoholTartalom) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }
    
    @Override
    public String toString() {
        return this.alkoholTartalom+"% alkoholtartalmú "+this.név+", "+this.kiszerelés+", "+this.ár;
    }
    
    
}
