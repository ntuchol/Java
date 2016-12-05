/*
 * CensusCalculator.java
 * 
 * Computer Science 111, Boston University
 *
 * This program performs various computations on census data stored in a text file.
 * It uses arrays in several ways, including for storage of the results of
 * the computations.
 * 
 * modified by: [put your name and BU email here]
 *        date:
 */

import java.util.*;
import java.io.*;

public class CensusCalculator {
    /* the name of the data file */
    public static final String DATA_FILE_NAME = "census.txt";
    
    /* 
     * The number of population counts for each county.
     * Changing the value of this constant should be all that is needed
     * to allow your program to handle a data file with a different
     * number of counts.
     */
    public static final int NUM_POPULATION_COUNTS = 2;    
    
    /* 
     * A class-constant array of Strings containing the names of the states
     * in the data file.
     * 
     * The index of a given state name in the array is the
     * same as the numeric code of the state in the data file.
     * For example, Alaska has a state code of 1 in the data file, 
     * so its name is at position 1 in this array.
     */
    public static final String[] STATE_NAMES = {"Alabama", "Alaska",
      "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
      "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois",
      "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
      "Maryland", "Massachusetts", "Michigan", "Minnesota",
      "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
      "New Hampshire", "New Jersey", "New Mexico", "New York",
      "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", 
      "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
      "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
      "West Virginia", "Wisconsin", "Wyoming", "District of Columbia"};
    
    /* 
     * A class-constant array of Strings containing the names of 
     * the nine divisions used by the Census Bureau.
     * 
     * The Census Bureau also numbers the divisions, and we have
     * used a division's number as its index in this array.
     * For example, New England is Division 1, so its name is at
     * position 1 in this array.
     * 
     * Note that there is no division 0, so we have put the name
     * "none" in position 0 of the array.
     */
    public static final String[] DIVISION_NAMES = {
      "none",
      "New England (CT,ME,MA,NH,RI,VT)            ", 
      "Mid-Atlantic (NJ,NY,PA)                    ", 
      "East North Central (IL,IN,MI,OH,WI)        ",
      "West North Central (IA,KS,MN,MO,NE,ND,SD)  ", 
      "South Atlantic (DE,FL,GA,MD,NC,SC,VA,WV,DC)", 
      "East South Central (AL,KY,MS,TN)           ",
      "West South Central (AR,LA,OK,TX)           ", 
      "Mountain (AZ,CO,ID,MT,NV,NM,UT,WY)         ", 
      "Pacific (AK,CA,HI,OR,WA)                   "};  

    /*
     * A class-constant array of integers that allows you to
     * determine the number of the division to which each
     * state belongs.
     * 
     * For example, Alaska has a state code of 1.
     * Element 1 of this array is the integer 9, which indicates
     * that Alaska is in division 9 (Pacific).
     */
    public static final int[] DIVISION_FOR_STATE = {6, 9,
      8, 7, 9, 8, 1, 5, 5, 5, 9, 8, 3, 3, 4, 4, 6, 7, 1, 5, 
      1, 3, 4, 6, 4, 8, 4, 8, 1, 2, 8, 2, 5, 4, 3, 7, 9, 2,
      1, 5, 4, 6, 7, 8, 1, 5, 9, 5, 3, 8, 5};

    /*
     * printOneDivision - prints the counts for a single division with the
     * specified name, old population (oldPop), and new population (newPop).
     * It computes the percent change for you. It displays the results so that
     * the full list of division results will be lined up in columns, and
     * it adds commas and rounds the percents to one place after the decimal.
     */
    public static void printOneDivision(String name, int oldPop, int newPop) {
        double percChange = (newPop - oldPop) * 100.0 / oldPop;
        System.out.printf("%43s\t  %,d\t  %,d\t  %4.1f%%\n", name, oldPop, newPop, percChange);
    }
    
    /*
     * getStateCode - finds and returns the state code for
     * the specified state name, and -1 if the specified
     * state name is not found.
     * 
     * You will complete this method so that it searches 
     * through the STATE_NAMES array and returns the index
     * of stateName in that array, or -1 is stateName
     * is not found in that array.
     */
    public static int getStateCode(String stateName) {
        /**** 
         * REPLACE THE LINE BELOW WITH YOUR 
         * IMPLEMENTATION OF THIS METHOD.
         * 
         * We've included this line so that the code
         * we've given you will compile, but you should
         * remove it and replace it with code that includes 
         * one or more appropriate return statements.
         * 
         * You should also remove these comments!
         ****/
        
        return 0;    // remove this line!
    }

    /**** PUT THE REST OF YOUR CODE BELOW. ****/


}