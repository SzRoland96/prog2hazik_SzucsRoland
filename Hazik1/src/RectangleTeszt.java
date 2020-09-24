/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class RectangleTeszt {
    public static void main(String[] args) {
        Rectangle tegla1 = new Rectangle(4,40);
        Rectangle tegla2 = new Rectangle(3.5,35.9);
        System.out.println(tegla1.width);
        System.out.println(tegla1.height);
        System.out.println(tegla1.getArea());
        System.out.println(tegla1.getPerimeter());
        System.out.println(tegla2.width);
        System.out.println(tegla2.height);
        System.out.println(tegla2.getArea());
        System.out.println(tegla2.getPerimeter());
    }
}
