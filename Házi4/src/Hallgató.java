/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public class Hallgató extends Személy {
    private double átlag;
    public static double joKepessegu = 4.0; 

    public Hallgató(String név, int életkor, boolean férfi,  double átlag) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    public double getÁtlag() {
        return átlag;
    }

    public static void setJoKepessegu(double joKepessegu) {
        Hallgató.joKepessegu = joKepessegu;
    }
    
    
    
    

    @Override
    public String toString() {
        StringBuilder h = new StringBuilder();
        h.append(super.getNév()).append("\n");
        h.append(super.getÉletkor()).append("\n");
        h.append(super.isFérfi()).append("\n");
        h.append(this.átlag);
        
        return h.toString();
    }
    
    public boolean joKepessegu () {
        if (this.átlag >= Hallgató.joKepessegu ) {
            return true;
        }
        return false;
    }
    
    
    
    
}
