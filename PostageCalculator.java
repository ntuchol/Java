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
import java.io.*;

public class PostageCalculator {
    public static void main(String[] args) 
        throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
    int count = 0;
    while (input.hasNextDouble()) {
        System.out.println(input.nextDouble());
        count++;
    }
    System.out.println("count: " + count);




        }
 
}