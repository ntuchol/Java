/*
 * StringRecursion.java
 *
 * starter code by: Computer Science 111, Boston University
 * 
 * modified by: Natalia Tucholska
 * username: ntuchol@bu.edu
 *
 * A class that contains recursive methods that operate on strings.
 */

public class StringRecursion {
    /* 
     * You may want to add test code for your methods to this
     * main method, although doing so is not required. 
     * See the section of the assignment entitled
     * "Testing your methods".
     * 
     * IMPORTANT: If your method does not return anything
     * (i.e., it is a void method), you should NOT try
     * to call it from within a println command. Instead,
     * you should call it on its own line -- for example:
     *     printSeries(3, 8);
     */
    public static void main(String[] args) {
        System.out.println("test 1 gives: " + numOccur('s', "Mississippi"));
        System.out.println("test 2 gives: " + numOccur('e', "Mississippi"));                   
        System.out.println("test 3 gives: " + removeVowels("Mississippi"));
        System.out.println("test 4 gives: " + removeVowels("apple"));  
        
        printDoubled("recursion");
        printMirrored("hello");
        System.out.println();
        System.out.println(trim("  I like to recurse!    ")); 
        System.out.println(weave("GIVE", "thanks"));
        System.out.println(lastIndexOf(' ', "Miss is sip pi"));
    }
    
    /*
     * numOccur - a recursive method that returns the number of times 
     * that the character ch occurs in the String str.
     * 
     * The main method includes two examples of using this method.
     *
     * You can also test this method by entering
     * StringRecursion.numOccur(ch, str) -- where ch is replaced 
     * by a char and str is replaced by a string -- in the 
     * Interactions Pane.
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

    /*
     * removeVowels - a recursive method that creates the String
     * that results from removing vowels from the String str.
     * 
     * The main method includes two examples of using this method.
     *
     * You can also test this method by entering
     * StringRecursion.removeVowels(str) -- where str is replaced
     * by a string -- in the Interactions Pane.
     * 
     * NOTE: There are examples of debugging printlns included below,
     * but they have been commented out.
     */
    public static String removeVowels(String str) {
        // System.out.println("starting removeVowels(" + str + ")");
        if (str == null || str.equals("")) {
            // System.out.println("removeVowels(" + str + ") returns " + str);
            return str;
        }
        
        String removedFromRest = removeVowels(str.substring(1));
        char first = str.charAt(0);
        
        // We assume that the string is all lowercase.
        if (first == 'a' || first == 'e' || first == 'i'
           || first == 'o' || first == 'u') {
            // System.out.println("removeVowels(" + str + ") returns " + removedFromRest);
            return removedFromRest;
        } else {
            // System.out.println("removeVowels(" + str + ") returns " + (first + removedFromRest));
            return first + removedFromRest;
        }
    }
    
    /* Prints each character in the given string twice, with the copy of each
     * character immediately after the original character 
     */ 
    public static void printDoubled(String str) {
        if(str == null || str.equals("")) {
            System.out.println();
        } else {
            System.out.print(str.charAt(0) + "" + str.charAt(0));
            printDoubled(str.substring(1));
        }
    }
    
    /* Prints the given string, immediately followed by the 
     * same string printed backwards
     */
    public static void printMirrored(String str) {
        if(str == null || str.equals("")) {
            return;
        }
        
        System.out.print(str.charAt(0));
        printMirrored(str.substring(1));
        System.out.print(str.charAt(0));   
    } 
    
    // Returns new string with all the leading and lagging spaces removed
    public static String trim(String str) {
        // base cases
        if(str == null) {
            return null;
        }
        if(str.equals("")) {
            return "";
        }
        // In the last base case, the string has no leading or lagging spaces
        if(!(str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ')) {
            return str;
        }
       
        /* recursive cases:
         * With each recursive call, the method removes any 
         * leading space, then any lagging space from the string until the 
         * third base case is reached (where the string has no leading or 
         * lagging spaces).  At this point this trimmed string replaces the 
         * method call and is returned on the way back from the base case.
         */ 
        String trimedStr;
        if(str.charAt(0) == ' ') {
            trimedStr = trim(str.substring(1));
        } else {
            trimedStr = trim(str.substring(0, str.length() - 1));
        } 
        return trimedStr;
    }
   
    // Returns a new string by alternating the characters of the first and second strings.
    public static String weave(String str1, String str2) {
        // base cases
        if(str1 == null || str2 == null)  {
            throw new IllegalArgumentException("the parameters cannot be null");
        }
       
        if (str1.equals("")) {
            return str2;
        } else if (str2.equals("")) {
            return str1;
        } 
       
        // recursive case
        String wovenStr = str1.charAt(0) + "" + str2.charAt(0) + weave(str1.substring(1), str2.substring(1));
        return wovenStr;
    }
   
    /* Finds and returns the index of the last occurence of a give character 
     * in a string, or -1 if the character does not occur in the string
     */ 
    public static int lastIndexOf(char ch, String str) {
        // base case
        if(str == null || str.equals("")) {
            return -1;
        }
       
        /* recursive case:
         * On the way back from the base case(when the string is 
         * empty), the value returned is the index of the most recent occurence 
         * of a character in the string, starting from the beginning of the 
         * original string.
         */ 
        int index = lastIndexOf(ch, str.substring(0, str.length() - 1)); 
        if(ch == str.charAt(str.length() - 1)) {
            index = str.length() - 1;
        }
        return index;
    } 
}
