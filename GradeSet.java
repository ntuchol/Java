/*
 * GradeSet - a blueprint class for representing a collection
 * of grades, manages this collection of grade object indirectly
 * (ie. no access to fields and any private methods of each grade object).
 * 
 * This version uses an array of type Grade.
 * It is also a client program of the Grade class.
 */

public class GradeSet {
    private String name;         // name of the assignment, quiz, etc.
    private int possiblePoints;  // number of possible points
    private Grade[] grades;      // collection of grades
    private int gradeCount;      // number of grades added thus far (ie how many actual grades
                                 // are in the array)
    /* constructor-  
     * once again, error checking is done by mutators
     */
    public GradeSet(String name, int possPts, int numGrades) {
        this.setName(name);
        this.setPossiblePoints(possPts);
        /* only method using numGrades variable, therefore it would make
         * sense to throw an exception here for an invalid value of this variable
         * rather than letting this error checking be done in a mutator method.
         * No repetition here
         */ 
        if(numGrades <= 0) {
            throw new IndexOutOfBoundsException();
        }
        
        /* pass in max number of grades that the Grade array should be able to hold
         * and create Grade array (initialized with null in every element) of that length.
         * Note that grades hase already been declared above as a field so don't do it again 
         * here, just need to initialize the variable 
         */ 
        this.grades = new Grade[numGrades]; 
        this.gradeCount = 0;
    }
    
    /*** accessor methods for the fields ***/
    
    public String getName() {
        return this.name;
    }
    
    public int getPossiblePoints() {
        return this.possiblePoints;
    }
    
    public int getGradeCount() {
        return this.gradeCount;
    }
    
    /* 
     * getGrade - returns the grade at the specified index in 
     * the collection of grades.  If index passed in is larger
     * than the gradeCount, know that there is no grade object
     * at that position (rather there is just a null value, or
     * the index is out-of-bounds)
     */
    public Grade getGrade(int i) {
        if (i < 0 || i >= this.gradeCount) {
            throw new IndexOutOfBoundsException();
        }
        
        return this.grades[i];
    }
    
    /*** mutator methods for the fields 
      *   if mutator has more than one field be careful not to change one of fields 
      *   already before the exceptition for invalid value of other field is thrown.
      *   If one of values passed in for the fields is invalid, want to throw exception
      *   without changing any of the fields.
      */
    // Requires that the name is at least one character long
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        
        this.name = name;
    }
    /*
     * Doesn't need to check for null bc value passed in is a primative type (int),
     * only variables of object type can store null.
     */ 
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
        /* No bonus points for this assignment, each grade object has its own 
         * raw score field, and the data collection object(a set of grades for
         * a particular assignment) has its own field for the possible maximum
         * amount of points.
         */ 
        if (g.getRawScore() > this.possiblePoints) {
            throw new IllegalArgumentException();
        }
        /* Note the different error message, want to let user know exactly what 
         * they're doing wrong.  Other example when g == null, throws a
         * NullPointException. 
         * This also makes sure that gradeCount never gets bigger than last index
         * in array, or else would be trying to store grade in out-of-bounds index
         * (can see below that gradeCount also determines position of new grade object)
         */ 
        if (this.gradeCount == this.grades.length) {
            throw new IllegalArgumentException("no more room");
        }
        // gradeCount serves two purposes: position of new grade, and how many grades in all
        this.grades[this.gradeCount] = g;
        this.gradeCount++;
    }
    
    /* 
     * removeGrade - removes (filling hole with what is currently last in array)
     * and returns the grade at the specified index in the collection of grades.  
     * Want to return the removed grade so that it can be used later in the client
     * program, if the user chooses to do so 
     */
    public Grade removeGrade(int i) {
        Grade removed = this.getGrade(i);   // it will do the error checking
        
        // Replace the removed grade with the last grade (see lecture notes for diagram)
        this.grades[i] = this.grades[this.gradeCount - 1];
       
        /* replaces original reference to last grade with null, and reduces the gradeCount
         * (because now we have fewer grades). This process of changing the order of the 
         * grade objects in array in order to remove a grade(here, no references in 
         * array = removed)is easier than shifting all the references to the grade 
         * objects in the array 
         */ 
        this.grades[this.gradeCount - 1] = null;
        this.gradeCount--;
        
        /* return the reference to grade object that was removed from array.  This reference
         * no longer in array, therefore "removed", but stored  in temporary variable
         * so we can still use it outside of the array
         */ 
        return removed;
    }

    /*
     * averageGrade - get the average of the grades in the
     * collection, either with the late penalty (if the parameter
     * is true) or without the late penalty (if the parameter
     * is false).
     */
    public double averageGrade(boolean includePenalty) { // no way bad value can be passed in
        if (this.gradeCount == 0) { // no grades to average, therefore...
            throw new IllegalArgumentException();
        }
        // Must be double so that nothing is trunated and we get an accurate average
        double total = 0.0;
        /*this is why grades must be as far left as possible, so can be processed from 
         * left to right
         */ 
        for (int i = 0; i < this.gradeCount; i++) {
            /* Can't do total += grades[i], because this would result in an average of the 
             * memory locations, which is not possible considering these adresses include 
             * letters
             */ 
            Grade g = this.grades[i];
            // do NOT do includePenalty == true, bad style 
            if (includePenalty) {
                total += g.getAdjustedScore(); // total will still be double 
            } else {
                total += g.getRawScore();
            }
        }
        /* gradeCount can't be 0 (see above) because can't divide by 0 here.
         * Also, since total is a double, nothing is truncated and average is accurate
         */ 
        return total/this.gradeCount;
    }
}