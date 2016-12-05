/*
 * Palindrome.java
 * Computer Science 111, Boston University
 *
 * A method that uses recursion to determine if a string is a palindrome.
 */

public class Palindrome {
    public static boolean isPalindrome(String str) {
 // base case 1: an empty or single-character string is a palindrome.
        if (str == null || str.length() <= 1) {
            return true;
        }
        
 // base case 2: if the first and last characters don't match,
 // the string is not a palindrome.
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        if (first != last) {
            return false;
        }
        
 // If we get here, the first and last characters must match.
 // Thus, str will be a palindrome if the rest of the string
 // (without the first and last characters) is a palindrome.
 // We make a recursive call to determine this, and return
 // whatever it returns.
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
