/*
 * NumOccur.java
 *
 * Computer Science 111, Boston University
 *
 * A class that contains a recursive method for determining the
 * number of times that a character appears in a string.
 *
 * The main method includes two examples of using this method.
 *
 * You can also test this method by entering
 * NumOccur.numOccur(ch, str) -- where ch is replaced by a char
 * and str is replaced by a string -- from the Interactions Pane.
 */

public class NumOccur {
    /*
     * numOccur - a recursive method that returns the number of times 
     * that the character ch occurs in the String str.
     */
    public static int numOccur(char ch, String str) {
        // base case
        if (str == null || str.equals("")) {
            return 0;
        }
    
        // recursive case
        int numOccurInRest = numOccur(ch, str.substring(1));
        if (ch == str.charAt(0)) {
            return 1 + numOccurInRest;
        } else {
            return numOccurInRest;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("numOccur('s', \"Mississippi\") = " +
          numOccur('s', "Mississippi"));
        System.out.println("numOccur('e', \"Mississippi\") = " +
          numOccur('e', "Mississippi"));                   
    }
}