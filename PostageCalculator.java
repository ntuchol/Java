/*
 * PostageCalculator.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * This program computes the rate of sending an item of mail
 * based on the type of item, its weight, and/or the size of the 
 * Priority box needed to ship it.
 */

import java.util.*;

public class PostageCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Postage Calculator!"); 
        
        int choice = getChoice(console);
        int rate = 0;
        
        if (choice == 1) {
            rate = 33;
        } else {
            System.out.print("Enter its weight in ounces: ");
            int weight = console.nextInt();   
            
            if (choice == 2) {
                rate = letterRate(weight);
            } else if (choice == 3) {
                rate = flatRate(weight);
            } else {
                rate = parcelRate(console, weight);
            }
        }
        
        double dollarRate = rate / 100.0;
        System.out.printf("Required postage: $%.2f\n", dollarRate);
    }
    
    /*
     * Determines the type of item that the user wants to send and 
     * returns an integer corresponding to that item choice.
     */ 
    public static int getChoice(Scanner console) {
        System.out.println ("Supported item types:");
        System.out.println("1) postcard");
        System.out.println("2) letter");
        System.out.println("3) flat");
        System.out.println("4) parcel");
        System.out.println();
        System.out.print("Enter the type of item (1-4): ");
        int choice = console.nextInt();
        return choice;
    }
  
    // Determines and returns the rate for sending a letter based on its weight.
    public static int letterRate(int weight) {
        int rate;
        
        if (weight < 4) {
            rate = 46 + 20*(weight - 1);
        } else {
            rate = flatRate(weight);
        }
        return rate;
    }
    
    // Determines and returns the rate for sending a flat envelope based on its weight.
    public static int flatRate(int weight) {
        int rate; 
        
        if(weight < 14) {
             rate = 92 + 20*(weight - 1);
         } else {
             rate = 560;
         }
         return rate;
    }
    
    /*
     * Determines and returns the rate for sending a parcel based on its weight.
     * The rate for sending a parcel that is 14 ounces or heavier also depends on 
     * the size of the Priority mail box that the user must choose to ship the
     * parcel.
     */
    public static int parcelRate(Scanner console, int weight) {
        int rate;
        
        if (weight < 14) {
            if (weight > 3) {
                rate = 207 + 17*(weight - 3);
            } else {
                rate = 207;
            }
        } else {
            rate = boxRate(console);
        }
        return rate;
    }
    
    /*
     * Determines and returns the rate for sending an item in a Priority mail box 
     * based on the size of the box that the user chooses.
     */
    public static int boxRate(Scanner console) {
        System.out.print("Enter the box size (small, medium, large): ");
        String size = console.next(); 
        int rate;  
        
        if (size.equals("small")) {
            rate = 580;
        } else if (size.equals("medium")) {
            rate = 1235;
        } else {
            rate = 1685;
        }    
        return rate;
    }
}