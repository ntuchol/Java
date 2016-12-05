/*
 * ReferenceVariableDemo.java
 *
 * Computer Science 111, Boston University
 */

import java.awt.*;     // The Rectangle class is in this package.

public class ReferenceVariableDemo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0, 100, 20, 55);
        Rectangle rect2 = rect1;        
        
     // We change the object to which rect1 refers.
     rect1.grow(10, 30);
        
     // The change is visible using rect2, because rect2 refers to
     // the same object as rect1. 
        System.out.println(rect2.getWidth());
        System.out.println(rect2.getHeight());
    }
}
