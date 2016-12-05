/*
 * StringManipulator.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * Collection of static methods that operate on String objects.
 */ 

import java.util.*;

public class StringManipulator {
    // Prints every other character of a string.
    public static void printEveryOther(String str) {
        int length = str.length();
        for(int i = 0; i < length; i += 2) {
            char character = str.charAt(i);
            System.out.print(character);
        }
        System.out.println();
    }
    
    // Prints each character of a string on a separate line, with enough
    // spaces before each character so that the string is printed "diagonally".
    public static void printDiagonal(String str) {
        int length = str.length();
        for(int line = 1; line <= length; line++) {
            int i;
            for(i = 0; i < line - 1; i++) {
                System.out.print(" ");
            }
            char character = str.charAt(i);
            System.out.println(character);  
        }
    }
    
    // Returns the length of the longer of two strings.
    public static int longerLength(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 > length2) {
            return length1;
        } else {
            return length2;
        }
    }
    
    // Creates a new string by alternating characters from two strings.
    public static String interleave(String str1, String str2) {
        String result = "";
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);
        
        for(int i = 0; i < maxLength; i++) {
            if (i >= length1) {
                result = result + str2.charAt(i);
            } else if (i >= length2) {
                result = result + str1.charAt(i);
            } else {
                result = result + str1.charAt(i) + str2.charAt(i);
            }
        }
        return result;
    }
}
            