/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
import java.util.Date;
import java.util.Objects;
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár;
    protected Date gyártásiDátum;
    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
        Ital.ár = 10;

    }
    public String getNév() {
        return név;
    }
    public String getKiszerelés() {
        return kiszerelés;
    }
    public static int getÁr() {
        return ár;
    }
    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }
    public static void setÁr(int ár) {
        Ital.ár = ár;
    }
    
    public boolean equals(Ital obj) {
        if (this.név == obj.név && this.kiszerelés == obj.kiszerelés ){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static double getÁrEuróban(){
        return Ital.ár/360f;
    }

    @Override
    public String toString() {
        return "" + név + "," + kiszerelés + "," + ár + "Ft";
    }
    
    
    public static void main(String[] args) {
        Ital ital = new Ital("Fanta", "karton");
        Ital.setÁr(185);
        double ar = Ital.getÁrEuróban();
        System.out.println(ar);
        System.out.println(ital.toString());
    }
}
