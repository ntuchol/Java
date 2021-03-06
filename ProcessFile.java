/*
 * ProcessFile.java
 *
 * Illustrates how to: 
 *    print the lines of a file using iteration
 *    print the lines of a file using recursion
 *    print the lines of a file in reverse order using recursion
 *
 * Note: Printing in reverse order is easy using recursion.
 *       To do this using iteration would require an extra data structure
 *       to store the lines as they are read.
 *       We don't need an extra data structure when using recursion
 *       because the lines are stored in the stack frames for the method calls.
 */

import java.io.*;
import java.util.*;

public class ProcessFile {
    // Uses iteration to print the lines of a file from first to last.
    public static void print(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
    }

    // Uses recursion to print the lines of a file from first to last.
    public static void printRecursive(Scanner input) {
        // base case
        if (!input.hasNextLine()) {
            return;
        }
        
        // recursive case:
     // (a) print the current line
        String line = input.nextLine();
        System.out.println(line);

     // (b) make a recursive call to print the rest of the file
        printRecursive(input);
    }

    // Uses recursion to print the lines of a file in reverse order,
    // from first to last.
    public static void printRecursiveReverse(Scanner input) {
        // base case
        if (!input.hasNextLine()) {
            return;
        }
        
        // recursive case:
     // (a) read the current line
        String line = input.nextLine();

     // (b) make a recursive call to print the rest of the file
        printRecursive(input);

     // (c) print the current line *after* the rest of the file 
     //     has been printed
        System.out.println(line);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("name of file: ");
        String filename = console.nextLine();
        
        Scanner input = new Scanner(new File(filename));
        print(input);

     // reopen the file to start over at the beginning
     input = new Scanner(new File(filename));

        printRecursive(input);

     // reopen the file to start over at the beginning
     input = new Scanner(new File(filename));

        printRecursiveReverse(input);
    }
}