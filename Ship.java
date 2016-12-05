/*
 * Ship.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * Serves as a blueprint class for objects that represent a single ship.
 */ 
public class Ship {
    private String type;
    private int length;
    private int numHits;
    
    // Constructs a Ship object with a given type and length
    public Ship(String shipType, int shipLength) {
        if(shipType == null || shipType.equals("") || shipLength < 1) {
            throw new IllegalArgumentException();
        }
        this.type = shipType;
        this.length = shipLength;
        this.numHits = 0;
    }
    
    // Returns the ship's type
    public String getType() {
        return this.type;
    }
    
    // Returns the first character of the ship's type
    public char getSymbol() {
        return this.type.charAt(0);
    }
    
    // Returns the ship's length
    public int getLength() {
        return this.length;
    }
    
    // Returns the number of times that the ship has been hit
    public int getNumHits() {
        return this.numHits;
    }
    
    // Increases the number of times that the ship has been hit by 1.
    public void applyHit() {
        this.numHits++;
    }
    
    // Determines whether or not the ship has been sunk
    public boolean isSunk() {
        return(this.numHits >= this.length);
    }
    
    // Returns a string representation of the ship
    public String toString() {
        return (this.type + " of length " + this.length);
    }
}