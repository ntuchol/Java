/*
 * Time.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * This blueprint class can be used to create objects that represent a specific
 * time, composed of an amount of hours and minutes, as well as whether or not 
 * the time is PM.
 */ 
public class Time {
    private int hour;
    private int minute;
    private boolean isPM;
    
    /* Takes three parameters and, if all three of these parameters are valid, 
     * constructs a new Time object with these specified values stored in its 
     * corresponding fields.  The hour amount parameter will be valid if it is 
     * between 1 and 12, and the minute amount will be valid if it is between 0
     * and 59.  The third parameter, which specifies whether or not it is 
     * PM or AM, will always be valid.
     */ 
    public Time(int newHour, int newMinute, boolean newIsPM) {
        if ((newHour < 1 || newHour > 12) || (newMinute < 0 || newMinute > 59)) {
            throw new IllegalArgumentException();
        }
        
        this.hour = newHour;
        this.minute = newMinute;
        this.isPM = newIsPM;
    }
    
    // Returns the hour field of a Time object
    public int getHour() {
        return this.hour;
    }
    
    // Returns the minute field of a Time object
    public int getMinute() {
        return this.minute;
    }
    
    // Returns "true" if the Time is PM, or "false" if the Time is AM
    public boolean isPM() {
        return this.isPM;
    }
    
    /* Advances the Time by one hour, adjusting the AM/PM setting and hour value
     * back to 1 as needed.
     */
    public void advanceHour() {
        if (this.hour == 11) {
            this.hour = 12;
            this.isPM = !(this.isPM);
            
        } else if (this.hour == 12) {
            this.hour = 1;
        } else {
            this.hour += 1;
        }
    }
    
    /* Advances the Time by one minute.  If the current minute is 59, sets the
     * minute to 0 and advances the hour.
     */ 
    public void advanceMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            this.advanceHour();
        
        } else {
            this.minute += 1;
        }
    }
    
    /* Advances the Time by the minute amount passed in, making sure that this 
     * amount is not negative and advancing the hour as needed.
     */ 
    public void advanceMinute(int totalMinutes) {
        if (totalMinutes < 0) {
            throw new IllegalArgumentException();
        }
        
        int numHours = totalMinutes / 60;
        while(numHours > 0) {
            this.advanceHour();
            numHours--;
        }
        
        int numMinutes = (totalMinutes % 60);
        while(numMinutes > 0) {
            this.advanceMinute();
            numMinutes--;
        }
    }
    
    /* Returns a String representation of a Time object in the format
     * "hour:minute AM/PM".  If the minute value is less than 10, the
     * method adds an extra "0" in front of the minute.
     */ 
    public String toString() {
        String output = this.hour + ":";
        
        if (this.minute < 10) {
            output += "0";
        }
        
        output += this.minute + " ";
        
        if (this.isPM) {
            output += "PM";
        } else {
            output += "AM";
        }
        
        return output;    
    }
    
    /* Determines whether or not the Time object that is passed in is equivalent 
     * to the called object, meaning that determining if all the fields of the
     * passed in Time are equal to those of the called Time.
     */ 
    public boolean equals(Time other) {
        return (other != null           
             && this.hour == other.hour 
             && this.minute == other.minute 
             && this.isPM == other.isPM);
    }
}