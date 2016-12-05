/**
 * DrawTorch.java
 *
 * Computer Science 111, Boston University
 *
 * Uses nested for loops to draw a complex figure (a torch) with
 * a fixed size.  See DrawTorch2.java for a scaleable version of the figure. 
 */

public class DrawTorch {
    public static void main(String[] args) {
        drawFlame();
        drawRim();
        drawTop();
        drawHandle();
        drawBottom();
    }
    
    /*
     * draws the flame portion of the figure
     */
    public static void drawFlame() {
        for (int line = 1; line <= 4; line++) {
            // spaces to the left of the flame
            for (int i = 0; i < 4 - line; i++) {
                System.out.print(" ");
            }

            // the flame itself -- first the left, then the right
            for (int i = 0; i < line; i++) {
                System.out.print("(");
            }
            for (int i = 0; i < line; i++) {
                System.out.print(")");
            }
            
            System.out.println();
        }
    }
    
    /*
     * draws the rim -- i.e., the line of = symbols at the top of the base
     * of the flame
     */
    public static void drawRim() { 
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
        }
        
        System.out.println();
    }
    
    /*
     * draws the top portion of the torch -- i.e., between the rim
     * and the handle
     */
    public static void drawTop() {
        for (int line = 1; line <= 2; line++) {
            // spaces to the left of the torch
            for (int i = 0; i < line - 1; i++) {
                System.out.print(" ");
            }
            
            // the torch itself
            System.out.print("|");
            for (int i = 0; i < 8 - 2*line; i++) {
                System.out.print(":");
            }
            System.out.print("|");
            
            System.out.println();
        }
    }
    
    /*
     * draws the handle of the torch
     */
    public static void drawHandle() {
        for (int line = 1; line <= 4; line++) {
            // spaces to the left of the handle
            for (int i = 0; i < 2; i++) {
                System.out.print(" ");
            }
            
            // the handle itself
            System.out.print("|");
            for (int i = 0; i < 2; i++) {
                System.out.print(":");
            }
            System.out.print("|");
            
            System.out.println();
        }
    }

    /*
     * draws the line of characters at the very bottom of the torch
     */
    public static void drawBottom() {
        // spaces to the left of the bottom
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        
        // the bottom itself
        System.out.print("+");
        for (int i = 0; i < 2; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        
        System.out.println();
    }
}
            __^__
         __/;;|;;\__
      __/;;;;;|;;;;;\__
   __/;;;;;;;;|;;;;;;;;\__
__/;;;;;;;;;;;|;;;;;;;;;;;\__
=============================
|......|......|......|......|
|.+--+.|.+--+.|.+--+.|.+--+.|
|.|  |.|.|  |.|.|  |.|.|  |.|
|.|  |.|.|  |.|.|  |.|.|  |.|
|.+--+.|.+--+.|.+--+.|.+--+.|
=============================
|.+--+.|.+--+.|.+--+.|.+--+.|
|.|  |.|.|  |.|.|  |.|.|  |.|
|.|  |.|.|  |.|.|  |.|.|  |.|
|.+--+.|.+--+.|.+--+.|.+--+.|
|......|......|......|......|
=============================
|.+--+.|..=========..|.+--+.|
|.|  |.|..|  /|\  |..|.|  |.|
|.|  |.|..| / | \ |..|.|  |.|
|.|  |.|..|/  |  \|..|.|  |.|
|.+--+.|..=========..|.+--+.|
=============================