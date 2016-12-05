/*
 * PrintMultiples
 *
 * Uses a while loop to print all multiples of a number less than 100
 *
 * Computer Science 111, Boston University
 */

import java.util.Scanner;

public class PrintMultiples {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = console.nextInt();
                
        System.out.println("\nThe multiples of " + num + 
          " less than 100 are:");
                
        int mult = num;
        while (mult < 100) {
            System.out.print(mult + " ");
            mult = mult + num;
        }
                
        System.out.println();
    }
}