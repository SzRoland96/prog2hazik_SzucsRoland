/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Teherautó extends Autó{
    
    private int maxSzállíthatóTeher;

    public Teherautó(String rendszám, int MotorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, MotorTeljesítmény);
        this.maxSzállíthatóTeher=maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Rendszám: "+this.getRendszám()+" Teljesítmény: "+this.getMotorTeljesítmény()+" Max teher: "+this.getMaxSzállíthatóTeher();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.maxSzállíthatóTeher;
        return hash;
    }

    
    public boolean equals(Teherautó obj) {
        if(this.maxSzállíthatóTeher==obj.maxSzállíthatóTeher && this.getRendszám() == obj.getRendszám())
        {
            return true;
        }
        else
            return false;
            
    }
    
    
    
}
