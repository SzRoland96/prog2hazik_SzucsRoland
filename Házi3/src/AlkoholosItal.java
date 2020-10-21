/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos {
    
    private String iz;
    private double alkoholtartalom;

    public AlkoholosItal(String iz, double alkoholtartalom) {
        this.iz = iz;
        this.alkoholtartalom = alkoholtartalom;
    }

    public String getIz() {
        return iz;
    }

    public double getAlkoholtartalom() {
        return alkoholtartalom;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + '}';
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
