/*
 ***** THIS FILE IS FOR TESTING PURPOSES ONLY. *****
 * 
 * Put the final versions of your methods for problem 1 
 * in your ps4_partI.txt file.
 * 
 * Do NOT submit them in this file.
 */

public class Problem1Test {
    /*** Put your methods for problems 1b and 1c below ***/
 public static double perimeter(double length, double width) {
    double perim = 2*(length + width); 
    return perim;
}


public static void printPattern(char ch, int numRows, int numCols) {
    for(int i = 1; i <= numRows; i++) {
        for(int j = 0; j < numCols; j++) {
     System.out.print(ch);
        }
     System.out.println();
    }
}  str1.substring(2, 6)
    str2.indexOf('c')
    str2.indexOf('d')
    str2.substring(6).toUpperCase()
    str2.toUpperCase().substring(6)
    str1.toLowerCase().charAt(1) + str2.substring(6, 9)
    
    
i. str1.toLowerCase() + str2
ii. str1.substring(0,6) + str2.charAt(14)
iii. str1.toLowerCase().substring(0,2) + str2.substring(11,14)
iv. str2.charAt(5)
v. str2.replace('s', 'n') 

    /*
     * This main method includes several tests for your methods.
     * 
     * It will not compile until you have added correct definitions
     * for both of the methods above.
     * 
     * We encourage you to add additional tests as well.
     */ 
    public static void main(String[] args) {
        double length = 10.0;
        double width = 6.3;
        System.out.println(perimeter(145.7777, 13345));
        System.out.println("The first perimeter is " + perimeter(length, width));
        
        System.out.println("Here's another perimeter: " + perimeter(7, 3));
        
        double perim = perimeter(2 * length, 3 * width);
        System.out.println("A third perimeter is " + perim);
        
        System.out.println();
        printPattern('$', 5, 16);
        printPattern('#', 2, 4);
        System.out.println();
        printPattern('@', 4, 3);
    }
}    