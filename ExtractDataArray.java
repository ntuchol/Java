/*
 * ExtractDataArray.java
 * 
 * Reads a comma-delimited text file containing track-meet results
 * and extracts results that match the school entered by the user.
 * 
 * In addition, it uses an array to keep track of how many
 * matching and how many non-matching records there are. 
 * This array is created in the main method and passed into the
 * method that processes the file.
 *
 * This version reads in the file using a token-based approach, using
 * a Scanner to read in one token at a time.
 *
 * For a sample input file, see meet_data2.txt 
 */ 

import java.util.*;
import java.io.*;

public class ExtractDataArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Name of file: ");
        String fileName = console.next();
        System.out.print("School to extract: ");
        String targetSchool = console.next();
        
        //
        // We will use an array of two integers to keep track of
        // how many matching and how many non-matching records
        // there are in the file.
        //
        // counts[0] will keep track of the number of non-matching records.
        // counts[1] will keep track of the number of matching records.
        //
        int[] counts = new int[2];
        processFile(fileName, targetSchool, counts);
        
        System.out.println();
        System.out.print("There were " + counts[1] + " matching records ");
        System.out.println("and " + counts[0] + " non-matching records.");
    }
    
    /*
     * processFile - process the data in the file with the specified file name,
     * looking for and printing results for the specified target school.
     * 
     * In addition, the method will use the specified array of two integers 
     * to keep track of how many matching and how many non-matching records
     * there are in the file.  
     * 
     * The advantage of using an array for the counts is that it allows us 
     * to "return" both counts -- because the calling method will be able 
     * to see any changes made to the array.  We can't return them as
     * separate ints, because a method cannot return more than one value.
     */
    public static void processFile(String fileName, String targetSchool, int[] counts) 
        throws FileNotFoundException
    {
        Scanner input = new Scanner(new File(fileName));
        
        // Change delimiters to handle comma-delimited text.
        // If it were tab-delimited, we would replace the comma with
        // a tab (\t).
        input.useDelimiter(",|\r\n|\r|\n");
        
        while (input.hasNext()) {
            String name = input.next();
            String school = input.next();
            String event = input.next();
            String time = input.next();
            
            // If the school matches the one we're looking for,
            // print the record, but leave out the school.
            if (school.equals(targetSchool)) {
                System.out.println(name + " " + event + " " + time);
                
                // increment the count of matching records
                counts[1]++;
            } else {
                // increment the count of non-matching records
                counts[0]++;
            }
        }
    }
}