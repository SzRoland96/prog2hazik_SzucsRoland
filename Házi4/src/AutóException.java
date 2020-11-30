/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public class AutóException extends Exception {
    private int hibakód;

    public int getHibakód() {
        return hibakód;
    }

    public AutóException(int hibakód, String string) {
        super(string);
        this.hibakód = hibakód;
    }
    
    
}
