/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class ErjedtGyümölcs extends Gyümölcs implements Alkoholos {
    
    private double alkoholTartalom;
    
    public ErjedtGyümölcs(String fajta, String íz, double alkoholTartalom) {
        super(fajta, íz);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGy\u00fcm\u00f6lcs{" + '}';
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
