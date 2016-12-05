/*
 * Clock.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * This blueprint class can be used to create objects that represent a clock, 
 * with each clock featuring a current time and its own set of alarms. The alarms
 * (if any) and current time of each Clock object are all Time objects, meaning 
 * that the Clock class is a client program of the Time class.
 */ 
public class Clock {
    private Time current;
    private Time[] alarms;
    private int alarmCount;
    
    /* Constructs a Clock object with an initial alarmCount of 0, an array that
     * will have room to store at most 10 alarms, and a new Time object representing
     * the current time(with the passed in hour amount, minute amount, and whether 
     * or not it is PM).
     */ 
    public Clock(int newHour, int newMinute, boolean newIsPM) {
        this.current = new Time(newHour, newMinute, newIsPM);
        this.alarms = new Time[10];
        this.alarmCount = 0;
    }
    
    // Constructs a Clock object with a current time of 12:00pm
    public Clock() {
        this(12, 0, true);
    }
    
    /* Adds the passed in alarm to the next available position in the array 
     * of alarms of the Clock object, and increments the alarmCount to 
     * reflect the new alarm added to the Clock's collection.  Also, checks for
     * valid input and prevents the Clock object from getting into a bad state by 
     * throwing an Exception if the Time object passed in is null or if the 
     * Clock already has 10 alarms.
     */ 
    public void addAlarm(Time newAlarm) {
        if(newAlarm == null) {
            throw new IllegalArgumentException();
        }
        
        if (this.alarmCount == this.alarms.length) {
            throw new IllegalArgumentException("no more room");
        }
        
        this.alarms[this.alarmCount] = newAlarm;
        this.alarmCount++;
    }
    
    // Returns the Time object representing the current time.
    public Time getCurrentTime() {
        return this.current;
    }
    
    // Returns the number of alarms that are currently stored in the clock
    public int getAlarmCount() {
        return this.alarmCount;
    }
    
    /* Takes an index value as a parameter, and (if this index is valid), returns 
     * the Time object at the given position of the clock's array. 
     */ 
    public Time getAlarm(int i) {
        if (i < 0 || i >= this.alarmCount) {
            throw new IndexOutOfBoundsException();
        }
        
        return this.alarms[i];
    }
    
    // Advances the current time by one hour
    public void advanceCurrentHour() {
        this.current.advanceHour();
    }
    
    // Advances the current time by one minute
    public void advanceCurrentMinute() {
        this.current.advanceMinute();
    }
    
    /* Prints each of the clock's alarm times (if any) on a separate line.
     * Also, indicates to the user (in the form of a printed line) if no alarm
     * times are associated with the clock 
     */ 
    public void printAlarms() {
        if (this.alarmCount == 0) {
            System.out.println("No alarms have been set.");
        }
        
        for(int i = 0; i < alarmCount; i++) {
            System.out.println(alarms[i]);
        }
    }
    
    /* Returns "true" if one of the clock's alarm times is the same as the 
     * current time, and "false" otherwise
     */ 
    public boolean alarmShouldSound() {
        for (int i = 0; i < alarmCount; i++) {
            if(this.current.equals(alarms[i])) {
                return true;
            }
        }
        return false;
    }
    
    /* Removes the alarm at the passed in index of the clock's array of alarms
     * (if this index is valid).  Does this by replacing the alarm at the position
     * of interest with the last alarm in the array, thus rearranging the remaining 
     * alarm times so that they occupy the leftmost positions of the array
     */ 
    public void removeAlarm(int i) {
        // Makes sure that "i" is a valid index of the array of alarms
        this.getAlarm(i);  
        
        this.alarms[i] = this.alarms[this.alarmCount - 1];
        
        /* replaces original reference to the last alarm with null, 
         * and reduces the alarmCount(because now there is one less alarm in
         * the clock's array).
         */ 
        this.alarms[this.alarmCount - 1] = null;
        this.alarmCount--;
    }
    
    /* Returns a string representation of the Clock object, including the 
     * current time and an indication that an alarm is sounding, if an alarm
     * should be sounding
     */ 
    public String toString() {
        String output = this.current.toString();
        
        if (alarmShouldSound()) {
            output += " *** ALARM!! ***";
        }
        return output;
    }
}