/**
 * MedicineDose.java
 * Computer Science 111, Boston University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: Natalia Tucholska (ntuchol@bu.edu) 
 * 
 * This program converts the volume of a bottle of medicine
 * and computes the number of doses in the bottle.
 */

import java.util.*;

public class MedicineDose {
    public static void main(String[] args) {
        int volumeMilli;    // total volume in milliliters
        double dose;        // a single dose in teaspoons
        
        // Read the values from the user.
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the total volume to the nearest mL: ");
        volumeMilli = console.nextInt();
        System.out.print("Enter the dose amount in teaspoons: ");
        dose = console.nextDouble();
        
        /*
         * The lines above read the volume and dose amount 
         * from the user and store them in variables.
         * Fill in the rest of the program below, using those
         * variables to compute the values specified in
         * the assignment.
         */
        
        double totalTeaspoons = volumeMilli / 5.0;
        int totalTablespoons = (int)(totalTeaspoons / 3);
        double remainTeaspoons = totalTeaspoons  - (3 * totalTablespoons);
        int numDoses = (int)(totalTeaspoons / dose);
        
        System.out.println("The total volume is " + totalTeaspoons + 
            " teaspoons (" + totalTablespoons + " tablespoons and " 
                + remainTeaspoons + " teaspoons).");
        System.out.println("There is enough medicine for " + numDoses 
            + " full doses.");
    }
}