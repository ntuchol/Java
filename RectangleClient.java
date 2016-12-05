/*
 * RectangleClient.java
 * 
 * A client program of our Rectangle class.
 * 
 * This file must be put in the same directory as Rectangle.java.
 */
public class RectangleClient {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 100, 50);
        Rectangle r2 = new Rectangle(50, 100, 20, 80);

        System.out.println("r1: " + r1.getWidth() + " x " + r1.getHeight());
        System.out.println("area = " + r1.area());
        System.out.println("perimeter = " + r1.perimeter());
        System.out.println();
        
        System.out.println("r2: " + r2);   // the toString method will be called
        System.out.println("area = " + r2.area());
        System.out.println("perimeter = " + r2.perimeter());
        System.out.println();
        
        if (r1.equals(r2)) {
            System.out.println("The two rectangles are equivalent.");
        } else {
            System.out.println("The two rectangles are not equivalent.");
        }
        System.out.println();
        
        // grow both rectangles
        r1.grow(50, 10);
        r2.grow(5, 30);
        
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
    }
}