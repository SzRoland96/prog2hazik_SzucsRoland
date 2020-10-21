/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public abstract class Gyümölcslé extends Ital {

    @Override
    public String mibőlKészült() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String milyenIzű() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Gyümölcslé(Gyümölcs gy){
        
    }
    
    public abstract String mibolFacsartak();

    @Override
    public String toString() {
        return "Gy\u00fcm\u00f6lcsl\u00e9{" + '}';
    }
    
    
}
