/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Gyümölcs {
    
    private String fajta;
    private String íz;

    public Gyümölcs(String fajta, String íz) {
        this.fajta = fajta;
        this.íz = íz;
    }
    
    /*public String milyenFajtaju()
    {
        return fajta;
    }
    public String milyenIzu()
    {
        return íz;
    }*/

    public String getFajta() {
        return fajta;
    }

    public String getÍz() {
        return íz;
    }
    

    @Override
    public String toString() {
        return "Gy\u00fcm\u00f6lcs{" + '}';
    }
    
    
    
}
