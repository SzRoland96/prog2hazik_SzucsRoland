/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon RP1 = new RegularPolygon();
        RegularPolygon RP2 = new RegularPolygon(6,4);
        RegularPolygon RP3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(RP1.getPerimeter());
        System.out.println(RP1.getArea());
        System.out.println(RP2.getPerimeter());
        System.out.println(RP2.getArea());
        System.out.println(RP3.getPerimeter());
        System.out.println(RP3.getArea());
        
    }
}
