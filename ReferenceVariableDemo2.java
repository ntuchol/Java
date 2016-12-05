/*
 * ReferenceVariableDemo2.java
 *
 * Computer Science 111, Boston University
 */

import java.awt.*;     // The Rectangle class is in this package.

public class ReferenceVariableDemo2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 100, 20, 55);
        Rectangle rect2 = new Rectangle(10, 100, 20, 55);
        Rectangle rect3 = rect2;
        
        rect2.translate(30, 0);
        
        System.out.println(rect1.getX());
        System.out.println(rect2.getX());
        System.out.println(rect3.getX());
    }
}
