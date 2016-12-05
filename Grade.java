/*
 * Grade - a blueprint class for representing a single grade --
 * both its raw score and the associated late penalty (if any).
 */

public class Grade {
    // Note that each field has its own mutator and accessor method.
    private double rawScore;
    private int latePenalty;
    
    /* constructor: 
     * lets mutators do the error checking to avoid repitition. 
     * If a bad value is passed in for either of the two fields,
     * the Grade object will not be created.
     * If this constructor calls any other methods before fields set,
     * this other method must assume that the fields have not been set.
     */
    public Grade(double raw, int late) {
        this.setRawScore(raw);
        this.setLatePenalty(late);
    }
    
    /* 
     * alternate constructor that takes just a raw score
     * and assumes that the late penalty is 0.
     * Constructor for common case where there is no late 
     * penalty, this way the client program does not need 
     * to worry about passing in the late penalty explicitly 
     * (like in the first constructor)
     * If the value passed in for this field is not valid,
     * object will not be created
     * If constructor wants to call another constructor in
     * its class, have to use keyword "this" and specify the 
     * correct number and types of parameters.
     */
    public Grade(double raw) {
        this(raw, 0);
    }
 
    /*** accessor methods for the fields ***/
    
    public double getRawScore() {
        return this.rawScore;
    }
    
    public int getLatePenalty() {
        return this.latePenalty;
    }
    
    /*** mutator methods for fields
      *  If the value passed in is valid, each mutator method assigns the value
      *  passed into it to its corresponding field 
      */
    
    public void setRawScore(double newScore) {
        if (newScore < 0.0) {
            throw new IllegalArgumentException();
        }
        
        this.rawScore = newScore;
    }
    
    public void setLatePenalty(int newPenalty) {
        if (newPenalty < 0) {
            throw new IllegalArgumentException();
        }
        
        this.latePenalty = newPenalty;
    }
    
    /*
     * getAdjustedScore - accessor method that returns
     * the score that results from applying the late penalty.
     */
    public double getAdjustedScore() {
        double adjustedScore = this.rawScore * (100.0 - this.latePenalty)/100;
        return adjustedScore;
    }

    /*
     * toString - returns a string representation of this Grade object.  
     * need this method if want to print Grade object in print/println statement
     * because otherwise this statement would print the memory address of the object
     * (ie. reference of the object) bc it will use the default toString method,
     * which just prints the value stored inside variable of interest.
     * The late penalty is only included if it is greater than 0.
     * Note that methods other than constructors can also call other methods in the 
     * same class to do their job.
     */
    public String toString() {
        String str = "" + this.rawScore;
        if (this.latePenalty > 0) {
            str += "(after late penalty = " + this.getAdjustedScore() + ")";
        }
        return str;
    }
}