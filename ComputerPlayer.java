/*
 * ComputerPlayer.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * Serves as a blueprint class for objects that represent a single
 * computer player in the game of Battleship.
 */ 
import java.util.*;

public class ComputerPlayer extends Player {
    private boolean firstMove; // whether or not this is the player's first move
    private Guess lastGuess; 
    
    // Constructs a new computer player with a given name 
    public ComputerPlayer(String name) {
        super(name);
        this.firstMove = true; // The player begins on thier first move
        lastGuess = null;
    }
    
    /*
     * returns a Guess object representing the player's
     * next guess for the location of a ship on the board specified
     * by the parameter otherBoard.
     */ 
    public Guess nextGuess(Scanner console, Board otherBoard) {
        // If this is the first move, a random Guess will be returned 
        if(this.firstMove) {
            this.firstMove = !(this.firstMove); // no longer the first move 
            this.lastGuess = super.nextGuess(console, otherBoard);
            return this.lastGuess;
        } else { // If it is not the first move..
            int row = lastGuess.getRow();
            int col = lastGuess.getColumn();
            // ..and the previous Guess was a miss, a random guess will be returned
            if (otherBoard.previousMiss(row, col)) {
                this.lastGuess = super.nextGuess(console, otherBoard);
                return this.lastGuess;
            //.. and the previous Guess was a hit...
            } else {
                // ...and resulted in sunken ship, then random Guess
                if(otherBoard.sunkShipAt(row, col)) {
                    this.lastGuess = super.nextGuess(console, otherBoard);
                    return this.lastGuess;
                } else {
                 /*..and ship was not sunken, then will check for an in bounds 
                  * position that has not been previously been tried, and will 
                  * return a Guess with this position
                  */ 
                    if((row - 1 > 0) && (row - 1 < otherBoard.getDimension()) 
                           && !(otherBoard.hasBeenTried(row - 1, col))) {
                        
                        this.lastGuess = new Guess(row - 1, col);
                        return this.lastGuess;
                        
                    } else if((col + 1 >= 0) && (col + 1 < otherBoard.getDimension()) 
                                  && !(otherBoard.hasBeenTried(row, col + 1))) {
                        
                        this.lastGuess = new Guess(row, col + 1);
                        return this.lastGuess;
                        
                    } else if((row + 1 >= 0) && (row + 1 < otherBoard.getDimension())
                                  && !(otherBoard.hasBeenTried(row + 1, col))) {
                        
                        this.lastGuess = new Guess(row + 1, col);
                        return this.lastGuess;
                    } else if((col - 1 >= 0) && (col - 1 < otherBoard.getDimension()) 
                                  && !(otherBoard.hasBeenTried(row, col - 1))) {
                        
                        this.lastGuess = new Guess(row, col - 1);
                        return this.lastGuess;
                    }
                    /*...however, if all of the adjacent positions to the previous Guess
                     * either have already been tried or are out of bounds, 
                     * then a random Guess will be returned 
                     */ 
                    this.lastGuess = super.nextGuess(console, otherBoard);
                    return this.lastGuess;
                }
            }
        }
    }
}
 
                 