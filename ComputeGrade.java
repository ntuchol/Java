/*
 * ComputeGrade.java
 * Dave Sullivan (dgs@cs.bu.edu)
 *
 * This program computes a grade as a percentage.
 */

public class ComputeGrade {
    public static void main(String[] args) {
        int pointsEarned = 13;
        int possiblePoints = 15;

        // Compute and print the grade as a percentage.
        double grade;

        // This line doesn't work, because we get integer division:
        //    grade = pointsEarned / possiblePoints * 100;
        //grade = (double)pointsEarned / possiblePoints * 100;

        // This line doesn't work either, because the division is
        // evaluated first:
        //    grade = pointsEarned / possiblePoints * 100.0;

        // Instead, we need to use a type cast:
        grade = (double)pointsEarned / possiblePoints * 100;
        System.out.println("The grade as a percentage is:");
        System.out.println(grade);
    }
}
