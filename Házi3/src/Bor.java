/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Bor extends AlkoholosItal{

    private String szoloFajta;
    private String termoTerulet;
    
    @Override
    public String mibőlKészült() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String milyenIzű() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Bor(String szoloFajta, String termoTerulet, String iz, double alkoholtartalom) {
        super(iz, alkoholtartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String getSzoloFajta() {
        return szoloFajta;
    }

    public String getTermoTerulet() {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + '}';
    }
    
    
    
}
