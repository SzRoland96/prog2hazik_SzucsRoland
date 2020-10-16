/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Katona {
    
    private int attack;
    private int defense;

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Katona() {
        this.attack=5;
        this.defense=5;
    }

    public Katona(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Katona: TE:"+this.attack+" "+"VE:"+this.defense;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    public boolean equals(Katona obj) {
        if((this.attack == obj.attack) && (this.defense == obj.defense))
        {
            return true;
           
        }
        else
        {
            return false;
        }
    }
    
}
