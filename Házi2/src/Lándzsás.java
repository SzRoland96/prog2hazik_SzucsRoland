/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Lándzsás extends Katona{

    public Lándzsás(int attack, int defense) {
        super(attack, defense);
    }
    @Override
    public String toString() {
        return "Lándzsás: [TE: "+super.getAttack()+"] "+"[VE: "+super.getDefense()+"]";
    }
    
    
}
