/*
 * Player.java - blueprint class for objects that represent a single
 * human player in the game of Battleship.
 * 
 * Computer Science 111, Boston University
 */

import java.util.*;

public class Player {
    private String name;
    private Ship[] fleet;
    private int numShips;
    
    /*
     * constructor for a Player with the specified name
     */
    public Player(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("name must have at least one character");
        }
        
        this.name = name;
        this.fleet = new Ship[BattleshipGame.SHIPS_PER_PLAYER];
        this.numShips = 0;
    }
    
    /*
     * getName - returns the name of the player
     */
    public String getName() {
        return this.name;
    }
    
    /*
     * addShip - add the specified ship to the player's collection of ships
     */
    public void addShip(Ship s) {
        if (s == null) {
            throw new IllegalArgumentException("parameter must be non-null");
        }
        
        if (this.numShips == this.fleet.length) {
            throw new IllegalArgumentException("no more room");
        }
        this.fleet[this.numShips] = s;
        this.numShips++;
    }
    
    /*
     * removeShip - removes the specified ship from the player's collection of ships
     */
    public void removeShip(Ship s) {
        if (s == null) {
            throw new IllegalArgumentException("parameter must be non-null");
        }
        
        for(int i = 0; i < this.numShips; i++) {
            
            if(s.getType().equals(fleet[i].getType())) {
               
                this.fleet[i] = this.fleet[this.numShips - 1];
                this.fleet[this.numShips - 1] = null;
                this.numShips--;
                return;
            }
        }
    }
    
    /*
     * printShips - prints whatever ships remain in the player's collection
     */
    public void printShips() {
        for(int i = 0; i < this.numShips; i++) {
            System.out.println(fleet[i]);
        }
    }
    
    /*
     * hasLost - has this player lost the game?
     * Returns true if this is the case, and false otherwise.
     */
    public boolean hasLost() {
        return (numShips == 0);
    }
    
    /*
     * nextGuess - returns a Guess object representing the player's
     * next guess for the location of a ship on the board specified
     * by the parameter otherBoard.
     */
    public Guess nextGuess(Scanner console, Board otherBoard) {
        int row;
        int col;
        
        // Keep randomly selecting coordinates until we get 
        // a position that has not already been tried.
        do {
            row = Board.RAND.nextInt(otherBoard.getDimension());
            col = Board.RAND.nextInt(otherBoard.getDimension());
        } while (otherBoard.hasBeenTried(row, col));
        
        Guess guess = new Guess(row, col);
        return guess;
    }
    
    /*
     * toString - returns a string representation of the player
     */
    public String toString() {
        return this.name;
    }
}