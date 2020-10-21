/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Roland
 */
public class Dolgozat implements Pontozhato{
    private int pontszám;

    public Dolgozat(int pontszám) {
        this.pontszám = pontszám;
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszám>15)
        {
            return true;
        }
        else if(this.pontszám == -1)
        {
            return false;
        }
        else
        {
            return false;
        }
    }

    public int getPontszám() {
        return pontszám;
    }

    public void setPontszám(int pontszám) {
        this.pontszám = pontszám;
    }

    @Override
    public String toString() {
        return "Pontszám:" +this.pontszám;
    }
    
    
    
}
