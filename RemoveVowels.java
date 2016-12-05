/*
 * RemoveVowels.java
 *
 * Computer Science 111, Boston University
 *
 * A class that contains a recursive method for removing all
 * lower-case vowels that appear in a string.
 */

public class RemoveVowels {
    /*
     * removeVowels - a recursive method that returns 
     * string formed by removing all lower-case vowels
     * (a, e, i, o, u) from the String str.
     */
    public static String removeVowels(String str) {
        System.out.println("starting removeVowels(" + str + ")");
        
        // base cases
        if (str == null) {
            System.out.println("Parameter should not be null.");
        
        }
        if (str.equals("")) {
            System.out.println("removeVowels(" + str + ") returns " + str);
            return "";
        }
    
        // recursive case
        
        // Make a recursive call to remove vowels from the
        // rest of the string.
        String removedFromRest = removeVowels(str.substring(1));
        
        // If the first character in str is a vowel,
        // we don't include it in the return value.
        // If it isn't a vowel, we do include it.
        char first = str.charAt(0);
        if (first == 'a' || first == 'e' || first == 'i'
          || first == 'o' || first == 'u') {
            System.out.println("removeVowels(" + str + ") returns " + removedFromRest);//print statement must be before return 
            return removedFromRest;
        } else {
            System.out.println("removeVowels(" + str + ") returns " + (first + removedFromRest));//before return
            return first + removedFromRest;
        }
    }
}