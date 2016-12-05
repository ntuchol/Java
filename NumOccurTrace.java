/*
 * NumOccurTrace.java
 *
 * Computer Science 111, Boston University
 *
 * A class that contains a recursive method for determining the
 * number of times that a character appears in a string.
 *
 * This version adds debugging println statements to numOccur that
 * allow you to trace the series of recursive calls.
 */

public class NumOccurTrace {
    public static int numOccur(char ch, String str) {
        System.out.println("entering numOccur(" + ch + ", " + str + ")");

        // base case
        if (str == null || str.equals("")) {
            System.out.println("base case: numOccur(" + ch + ", " + str + ") returns 0"); 
            return 0;
        }
        
        // recursive case
        int numOccurInRest = numOccur(ch, str.substring(1));
        
        if (str.charAt(0) == ch) {
            System.out.println("numOccur(" + ch + ", " + str + ") returns " + (1 + numOccurInRest));
            return 1 + numOccurInRest;
        } else {
            System.out.println("numOccur(" + ch + ", " + str + ") returns " + numOccurInRest);
            return numOccurInRest;
        }
    }
}

