/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public class Teherautó extends Autó {

    private int teherbírás;

    public Teherautó(String rendszám, int teljesítmény, boolean automata, int teherbírás) throws AutóException {
        super(rendszám, teljesítmény, automata);
        if (teherbírás > 0) {
            this.teherbírás = teherbírás;
        }
        else {
            throw new AutóException(3, "A teherbírás értéke teherautóknál csak pozitív értékű lehet!");
        }
        
    }

    public int getTeherbírás() {
        return teherbírás;
    }
    
    

    

    @Override

    public String toString() {
        return "{Teherautó}: rendsz\u00e1m=" + super.getRendszám() + ", teljes\u00edtm\u00e9ny=" + super.getTeljesítmény() + ", automata=" + super.isAutomata()+", teherbírás="+this.teherbírás;
    }
    
    
  

  
    
}
