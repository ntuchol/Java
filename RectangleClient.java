/*
 * RectangleClient.java
 * 
 * A client program for our rudimentary Rectangle class.
 * This version of the program has to do most of the work itself.
 * 
 * See the rectangle_final directory for the final version
 * of the client program.
 */

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.x = 10;       r1.y = 20;
        r1.width = 100;  r1.height = 50;
        
        Rectangle r2 = new Rectangle();
        r2.x = 50;       r2.y = 100;
        r2.width = 20;   r2.height = 80;
        
        System.out.println("r1: " + r1.width + " x " + r1.height);
        int area1 = r1.width * r1.height;
        System.out.println("area = " + area1);
        int perimeter1 = 2*r1.width + 2*r1.height;
        System.out.println("perimeter = " + perimeter1);
        System.out.println();

        System.out.println("r2: " + r2.width + " x " + r2.height);
        int area2 = r2.width * r2.height;
        System.out.println("area = " + area2);
        int perimeter2 = 2*r2.width + 2*r2.height;
        System.out.println("perimeter = " + perimeter2);
        System.out.println();

        if (r1.x == r2.x && r1.y == r2.y 
          && r1.width == r2.width && r1.height == r2.height) {
            System.out.println("The two rectangles are equivalent.");
        } else {
            System.out.println("The two rectangles are not equivalent.");
        }
        System.out.println();
        
        // grow both rectangles
        r1.width += 50;
        r1.height += 10;
        r2.width += 5;
        r2.height += 30;

        System.out.println("r1: " + r1.width + " x " + r1.height);
        System.out.println("r2: " + r2.width + " x " + r2.height);
    }
}