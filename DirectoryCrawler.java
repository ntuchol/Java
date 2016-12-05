/*
 * DirectoryCrawler.java - based closely on an example program from
 * Chapter 12 of Reges & Stepp.
 *
 * Recursively prints the contents of a folder/directory -- including 
 * the contents of any subdirectories, their subdirectories, etc.
 */

import java.io.*;
import java.util.*;

public class DirectoryCrawler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("directory or file name: ");
        String name = console.nextLine();
     
        File f = new File(name);
        if (!f.exists()) {
            System.out.println("no such file/directory");
        } else {
            print(f);   // print the file or directory
        }
    }
    
    /*
     * print - a recursive method for printing a file or directory
     *
     * The parameter f is a File object representing the file or directory.
     *
     * If f is a regular file, the method prints its name and returns.
     * That is the base case of the method.
     *
     * If f is a directory, the method prints its name and then invokes
     * the method recursively on all of the contents of the directory;
     */
    public static void print(File f) {
        System.out.println(f.getPath());

        // If f represents a directory, recursively print its contents.
        if (f.isDirectory()) {
            File[] contents = f.listFiles();
            for (int i = 0; i < contents.length; i++) {
                print(contents[i]);
            }        
        }

        // Note: if f is NOT a directory, we've hit a base case 
        // and will just return.
    }
}
