
import static java.awt.Color.yellow;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class TriangleTeszt {
    public static void main(String[] args) {
        
        
        Triangle háromszög = new Triangle(1,1.5,1,"yellow",true);
        System.out.println("The area is " + háromszög.getArea());
        System.out.println("The perimeter is " + háromszög.getPerimeter());
        System.out.println("The triangle filled is: "+háromszög.isFilled(true));
        System.out.println("The triangle color is: "+háromszög.getColor());
    
}
}