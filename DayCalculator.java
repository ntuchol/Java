/*
 * DayCalculator.java
 * 
 * A program that determines the day of the week of a given date.
 * 
 * Computer Science 111, Boston University
 *
 * modified by: Natalia Tucholska, ntuchol@bu.edu
 */

import java.util.*;

public class DayCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Reads month number, day, and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = console.nextInt();
        System.out.print("Enter the day: ");
        int day = console.nextInt();
        System.out.print("Enter the year: ");
        int year = console.nextInt();
        
        int dayNum = dayNumber(month, day, year);
        String dayOfWeek = dayOfWeek(dayNum);
        
        System.out.print(month + "/" + day + "/" + year); 
        System.out.println(" falls on a " + dayOfWeek + ".");
    }
    
    // Determines the date's day-of-week-number.
    public static int dayNumber(int month, int day, int year) {
        int y = year - (14 - month)/12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12*((14 - month)/12) - 2;
        int dayNum = (day + x + (31*m)/12) % 7;
        return dayNum;
    }
    
    // Determines the date's day of the week.
    public static String dayOfWeek(int dayNum) {
        String dayOfWeek;
        if (dayNum == 0) {
            dayOfWeek = "Sunday";
        } else if (dayNum == 1) {
            dayOfWeek = "Monday";
        } else if (dayNum == 2) {
            dayOfWeek = "Tuesday";
        } else if (dayNum == 3) {
            dayOfWeek = "Wednesday";
        } else if (dayNum == 4) {
            dayOfWeek = "Thursday";
        } else if (dayNum == 5) {
            dayOfWeek = "Friday";
        } else {
            dayOfWeek = "Saturday";
        }
        return dayOfWeek;
    }
}
            