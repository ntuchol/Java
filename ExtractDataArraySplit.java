/*
 * ExtractDataArraySplit.java
 * 
 * Does the same thing as ExtractDataArray.java.
 *
 * However, this version reads in the file one line at a time,
 * and it uses the String.split() method to break the line into an
 * array of fields.
 *
 * For a sample input file, see meet_data2.txt 
 */ 

import java.util.*;
import java.io.*;

public class ExtractDataArraySplit {
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
        
        // Important: Because we are taking a line-based approach,
        // we don't need to change the delimiters of the Scanner.
        
        while (input.hasNextLine()) {
            String line = input.nextLine();
            
            // Split the line into an array of fields, using a comma 
            // as the delimiter. If this were a tab-delimited file, 
            // we would use '\t' instead of ','.
            String[] fields = line.split(",");
            
            String name = fields[0];
            String school = fields[1];
            String event = fields[2];
            String time = fields[3];
            
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