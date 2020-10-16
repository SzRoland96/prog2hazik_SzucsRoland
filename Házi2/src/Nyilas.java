/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Nyilas extends Katona {
    private int lőtáv;

    public int getLőtáv() {
        return lőtáv;
    }
    
    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public Nyilas(int attack, int defense,int lőtáv) {
        super(attack, defense);
        this.lőtáv = lőtáv;
        super.setAttack(attack+lőtáv);
    }
    @Override
    public String toString() {
        return "Nyilas [TE:"+super.getAttack()+"] ["+"VE:"+super.getDefense()+"]";
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    public boolean equals(Nyilas obj) {
        if((super.getAttack()== obj.getAttack()) && (super.getAttack()== obj.getAttack()) && (this.lőtáv == obj.lőtáv))
        {
            return true;
           
        }
        else
        {
            return false;
        }
    }
        
}
