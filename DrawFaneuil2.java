/*
 * DrawFaneuil2.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * This program prints the rear facade of Faneuil Hall using procedurial decomposition,
 * nested for loops, and parameters.  This version of the program is scalabe, 
 * producing the complex figure for the value of the scale factor (which can be set to 
 * any constant greater than or equal to 3).
 */
public class DrawFaneuil2 {
    public static final int SCALE_FACTOR = 5;
    
    public static void main(String [] args) {
        drawTop();
        drawWindows();
        drawEntrance();
    }
   
    //draws top of the building 
    public static void drawTop () {
        drawPoint();
        drawRoof();
        drawBeam();
    }
    
    /*
     * draws the two rows of windows of the building, with four windows in each row
     */
    public static void drawWindows() {
        drawLayer();
        drawRow();
        drawBeam();
        drawRow();
        drawLayer();
    }
    
    /* 
     * draws entrance of building, with a door in the center 
     * and a longer window on each side of the door.
     */
    public static void drawEntrance() {
        drawBeam();
        drawDoorEdge();
        drawDoorSides();
        drawDoorEdge();
        drawBeam();
    }
    
    // draws a row of four windows 
    public static void drawRow() {
        drawWindowsEdges();
        drawWindowsSides();
        drawWindowsEdges();
    }
    
    // draws the point at the very top of this building
    public static void drawPoint() {
        for(int i = 0; i < 3*SCALE_FACTOR; i++) {
            System.out.print(" ");
        }
        
        for(int i = 0; i < SCALE_FACTOR - 2; i++) {
            System.out.print("_");
        }
        System.out.print("^");
        
        for(int i = 0; i < SCALE_FACTOR - 2; i++) {
            System.out.print("_");
            }
        System.out.println();
    }
    
    // draws the tapering roof of the building
    public static void drawRoof() {
        for(int line = 1; line <= SCALE_FACTOR; line++) {
            
            for(int i = 0; i < -3*line + 3*SCALE_FACTOR; i++) {
                System.out.print(" ");
            }
            
            for(int i = 0; i < 2; i++) {
                System.out.print("_");
            }
            System.out.print("/");
            
            for(int i = 0; i < 3*line + (SCALE_FACTOR - 5); i++) {
                System.out.print(";");
            }
            System.out.print("|");
            
            for(int i = 0; i < 3*line + (SCALE_FACTOR - 5); i++) {
                System.out.print(";");
            }
            System.out.print("\\");
            
            for(int i = 0; i < 2; i++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
    
    /* draws a beam that is found at the bottom of each section of the  
     * building, including each of the two rows of windows 
     */
    public static void drawBeam() {
        for(int i = 0; i < 8*SCALE_FACTOR - 3; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    /*
     * draws the extra layer that frames the top and
     * bottom of the two rows of windows
     */ 
    public static void drawLayer() {
        System.out.print("|");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 2*SCALE_FACTOR - 2; j++) {
                System.out.print(".");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    
    // draws the edge (top or bottom) of each of the four windows in a row 
    public static void drawWindowsEdges() {
        drawEdge(4);
        System.out.println();
    }
    
    // draws the sides of each of the four windows in a row
    public static void drawWindowsSides() {
        for(int line = 0; line < SCALE_FACTOR - 2; line++) {
            drawSide(4);
            System.out.println();
        }
    }
    
    /*
     * draws the edge (top or bottom) of the building's door and of each of the 
     * two windows on either side of the door 
     */
    public static void drawDoorEdge() {
        // draws the top of the window to the door's left
        drawEdge(1); 
        
        for(int i = 0; i < SCALE_FACTOR - 2; i++) {
            System.out.print(".");
        }
        // draws the top of the door
        
        for(int i = 0; i < 2*SCALE_FACTOR + 1; i++) { 
            System.out.print("=");
        }
        
        for(int i = 0; i < SCALE_FACTOR - 2; i++) {
            System.out.print(".");
        }
        drawEdge(1);// draws the top of the window to the door's right        
        System.out.println();
    }
    
    // draws the sides of the door and of the window on each side of the door
    public static void drawDoorSides() {
        for (int line = 0; line < SCALE_FACTOR - 1; line++) {
            drawSide(1);// draws the sides of window to the left of door
           
            for(int i = 0; i < SCALE_FACTOR - 2; i++) {
                System.out.print(".");
            }
            /*
             * draws the sides of the double door as well as the diagonal line
             * that goes through each half of the door
             */ 
            System.out.print("|");
            
            for (int i = 0; i < SCALE_FACTOR - line - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            
            for(int i = 0; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            
            for(int i = 0; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            
            for (int i = 0; i < SCALE_FACTOR - line - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            
            for(int i = 0; i < SCALE_FACTOR - 2; i++) {
                System.out.print(".");
            }
            //draws the sides of the window to the right of the door
            drawSide(1); 
            System.out.println();
        }        
    }
    
    // draws the edge of a single window 
    public static void drawEdge(int a) {
        System.out.print("|");    
        for(int i = 0; i < a; i++) {
            System.out.print(".+");
            
            for(int j = 0; j < 2*SCALE_FACTOR - 6; j++) {
                System.out.print("-");
            }
            System.out.print("+.|");
        }
    }
    
    // draws the sides of a single window 
    public static void drawSide(int a) {
        System.out.print("|");
        for(int i = 0; i < a; i++) {
           System.out.print(".|");
           
           for(int j = 0; j < 2*SCALE_FACTOR - 6; j++) {
               System.out.print(" ");
           }
           System.out.print("|.|");
        }
    }   
}
   

            
