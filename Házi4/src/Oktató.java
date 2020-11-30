/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public class Oktató extends Személy {
    private String tanszék;

    public Oktató(String név, int életkor, boolean férfi, String tanszék) {
        super(név, életkor, férfi);
        this.tanszék = tanszék;
    }

    public String getTanszék() {
        return tanszék;
    }
    
    

    @Override
    public String toString() {
        return "{Oktató:} "+"név= "+super.getNév()+" , "+"életkor= "+super.getÉletkor()+" , "+"férfi= "+super.isFérfi()+" , "+"tanszék= "+this.tanszék;
    }
    
    
}
