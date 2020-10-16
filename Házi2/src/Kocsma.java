
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Kocsma extends VendéglátóipariEgység {
    
    public String [] sörlap;

    public Kocsma(String név, int férőhelyekSzáma, String[] sörlap){
        super(név, férőhelyekSzáma,true);
        this.sörlap= sörlap;
        
    }

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return this.getNév()+"\tFérőhelyek száma:"+this.getFérőhelyekSzáma()+"\tKínálat: "+Arrays.toString(this.getSörlap())+"\tdohányzó: "+this.isDohányzó(true)+"\n";
    }
    
    
    
}
