/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Tea implements Rendezheto {
    
    public String nev;
    public int ár;
    public Tea(String s,int j) {
            nev=s;
            ár=j;
    }

    public int getÁr() {
        return ár;
    }
    
    @Override
    public boolean egyenlo(Object o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
            
        }
        Tea tmp = (Tea) o;
        return this.ár == tmp.getÁr();
    }

    @Override
    public boolean nagyobbMint(Object o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
            
        }
        Tea tmp = (Tea) o;
        return this.ár > tmp.getÁr();
        
    }

    @Override
    public boolean kisebbMint(Object o) {
        if (o == null || !(o instanceof Tea)) {
            return false;
            
        }
        Tea tmp = (Tea) o;
        return this.ár < tmp.getÁr();
        
    }

    
}
