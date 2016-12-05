/*
 * Temperature.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * This blueprint class can be used to create objects that are used to
 * represent temperature readings.  Each temperature object features a field 
 * for its value and scale type, as well as several instance methods that can 
 * be used by the object to change and get information about its fields.
 */ 
public class Temperature {
    private double value;
    private char scale;
    
    /* Constructs a Temperature object with an both an initial temperature value and 
     * scale, the values of which are specified by the user
     */ 
    public Temperature(double initialValue, char initialScale) {
        this.changeTo(initialValue, initialScale);
    }
    
    /* Constructs a Temperature object with an initial temperature value specified  
     * by the user, and assumes that the intended scale is Celcius.
     */ 
    public Temperature(double initialValue) {
        this(initialValue, 'C');
    }
    
    /*
     * Changes the value and scale of the Temperature object only if the two parameters 
     * passed into this method are valid, meaning that the temperature value bieng can't be
     * less than absolute zero and scale must be either F, C, or K.
     */
    public void changeTo(double newValue, char newScale) {
        if ((newScale == 'F' && newValue < -459.67) 
         || (newScale == 'C' && newValue < -273.15) 
         || (newScale == 'K' && newValue < 0.0)
         || !(newScale == 'F' || newScale == 'C' || newScale == 'K')) {
            throw new IllegalArgumentException();
        }
        
        this.value = newValue;
        this.scale = newScale;
    }
    
    // Returns Temperature's value
    public double getValue() {
        return this.value;
    }
    
    // Returns the Temperature's scale, in the form of a single character
    public char getScale() {
        return this.scale;
    }
    
    // Returns the name of the Temperature's scale
    public String getScaleName() {
        if(this.scale == 'F') {
            return "Fahrenheit";
        } else if(this.scale == 'C') {
            return "Celcius";
        } else {
            return "Kelvin";
        }
    }
    
   /* Takes as a parameter a character representing the temperature scale
    * and returns the value of the Temperature object in that scale, 
    * without actually changing the object's value field.
    */ 
    public double valueIn(char newScale) {
        if (!(newScale == 'F' || newScale == 'C' || newScale == 'K')) {
            throw new IllegalArgumentException();
        }
        
        double tempValue = this.getValue();
        char tempScale = this.getScale();
        
        if(newScale == tempScale) {
            return tempValue;
        } 
        
        /* Converts the temperature value of the object from its value in the 
         * object's scale to that passed in as a parameter.  The new temperature 
         * value will be calculated differently for each of the following six 
         * cases (where the new and original scales are different):  when the
         * new scale is F and the original scale is C, F and K, C and F, C and K,
         * K and F, or K and C respectively.
         */ 
        if(newScale == 'F') {
            if(tempScale == 'C') {
                tempValue = tempValue * (9.0 / 5) + 32;
            } else {
                tempValue = tempValue * (9.0 / 5) - 459.67;
            }
        } else if (newScale == 'C') {
            if(tempScale == 'F') {
                tempValue = (tempValue - 32) * (5.0 / 9);
            } else {
                tempValue = tempValue - 273.15;
            }
        } else {
            if(tempScale == 'F') {
                tempValue = (tempValue + 459.67) * (5.0 / 9);
            } else {
                tempValue = tempValue + 273.15;
            }
        }
        
        return tempValue;
    }
    
   /* Takes as a parameter a character representing the temperature scale
    * and changes the value field of the Temperature object to its value 
    * in that scale.
    */ 
    public void convertTo(char newScale) {
        this.value = this.valueIn(newScale);
        this.scale = newScale;
    }
    
    // Returns a String representation of the Temperature object
    public String toString() {
        if(this.scale == 'K') {
            return this.value + " " + this.scale;
        }
        
        return this.value + " \u00b0" + this.scale;
    }
    
    /* Returns true if Temperature object represents a temperature
     * below the freezing point of water, and false if otherwise.
     */ 
    public boolean isBelowFreezing() {
        double tempValue = this.valueIn('C');
        return (tempValue < 0.0);
    }
    
    /* Determines whether or not called Temperature object and
     * the Temperature object passed in as a parameter are equivalent,
     * meaning that the temperatures that they represent are equivalent 
     * even if the scales are different.
     */ 
    public boolean equals(Temperature other) {
        if(other == null) {
            return false;
        }
        
        double tempValue = this.valueIn('C');
        double otherValue = other.valueIn('C');
        return (Math.abs(tempValue - otherValue) < 0.0000001); 
    }
}