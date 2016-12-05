/*
 * GradeSetArrayList - a blueprint class for representing 
 * a collection of grades.
 *
 * This version uses an ArrayList of type Grade, 
 * rather than an array.
 */

import java.util.*;    // needed for ArrayList

public class GradeSetArrayList {
    private String name;
    private int possiblePoints;
    private ArrayList<Grade> grades;
    // private int gradeCount;  no longer needed!
    
    /* constructor */
    public GradeSetArrayList(String name, int possPts, int numGrades) {
        this.setName(name);
        this.setPossiblePoints(possPts);
        /* ArrayList will adjust so that can go over numGrades, but need to 
         * initialize with some number of elements
         */ 
        this.grades = new ArrayList<Grade>(numGrades); 
    }

    /*** accessor methods for the fields ***/
    
    public String getName() {
        return this.name;
    }
    
    public int getPossiblePoints() {
        return this.possiblePoints;
    }
    
    public int getGradeCount() {
        return this.grades.size();    // note the difference
    }
    
    /* 
     * getGrade - returns the grade at the specified index in 
     * the collection of grades.
     */
    public Grade getGrade(int i) {
        // the get() method (of ArraySet class) already throws an exception as needed
        
        return this.grades.get(i);
    }
    
    /*** mutator methods for the fields ***/
    
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        
        this.name = name;
    }
    
    public void setPossiblePoints(int possPoints) {
        if (possPoints <= 0) {
            throw new IllegalArgumentException("invalid parameter: " + possPoints);
        }
        
        this.possiblePoints = possPoints;
    }
    
    /*
     * addGrade - adds the specified Grade to the collection.
     * The new grade is added after any existing grades in
     * the collection.
     */
    public void addGrade(Grade g) {
        /*
         * No longer needed, because an ArrayList will grow itself as needed
         * (ie is never full).
         * 
         * if (this.gradeCount == this.grades.length) {
         *   throw new IllegalArgumentException("no more room");
         * }
         */ 
        
        /* Some of the error checking is specific to our method
         * For instance, since the add method of the ArrayList 
         * object allows for null, we must check for null bieng 
         * passed in 
         */
        if( g == null) {
            throw new IllegalArgumentException();
        }
        this.grades.add(g);
    }
    
    /* Removes value at specified index and shifts remaining values over to the 
     * left, rather than rearranging the order of the values like we have done before.
     * The returns the removed object returned by the remove method of the ArrayList
     * class
     */ 
    public Grade removeGrade(int i) {
        return this.grades.remove(i);
    }
    
    /*
     * averageGrade - get the average of the grades in the
     * collection, either with the late penalty (if the parameter
     * is true) or without the late penalty (if the parameter
     * is false).
     */
    public double averageGrade(boolean includePenalty) {
        //size can't be zero bc can't divide by zero (see below)
        if(this.grades.size() == 0) {
            throw new IllegalArgumentException();
        }
        
        double total = 0.0;
        for (int i = 0; i < this.grades.size(); i++) {
            /* Returns a Grade object that must then get the score using method 
             * (bc fields encapsulated)
             */ 
            Grade g = this.grades.get(i); 
            if (includePenalty) {
                total += g.getAdjustedScore();
            } else {
                total += g.getRawScore();
            }
        }
        
        return total/this.grades.size();
    }
}