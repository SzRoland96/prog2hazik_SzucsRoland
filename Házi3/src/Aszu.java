/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Aszu extends Bor {
    
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholtartalom) {
        super("fehér", termoTerulet, "száraz", alkoholtartalom);
        this.puttonySzam = puttonySzam;
    }

    public int getPuttonySzam() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Puttonyszám: "+this.puttonySzam+" |Termőterület: "+super.getTermoTerulet()+"| Alkoholtartalom:"+super.getAlkoholtartalom();
    }
    
    

    
    
    
    
}
