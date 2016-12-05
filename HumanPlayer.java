/*
 * HumanPlayer.java
 * 
 * Natalia Tucholska (ntuchol@bu.edu)
 * 
 * Blueprint class for objects that represent a single human player 
 * in the game of Battleship, which allows this player to enter 
 * guesses from the console. 
 */ 
import java.util.*;

public class HumanPlayer extends Player {
    
    // Constructs a HumanPlayer with a given name
    public HumanPlayer(String name) {
        super(name);
    }
    
    /*
     * Returns a Guess object representing the human player's
     * next guess for the location of a ship on the board specified
     * by the parameter otherBoard.
     */
    public Guess nextGuess(Scanner console, Board otherBoard) {
        int row;
        int col;
        
        do {
            System.out.println("Enter your guess.");
            System.out.println("     row: ");
            row = console.nextInt();
            System.out.println("  column: ");
            col = console.nextInt();
        } while (otherBoard.hasBeenTried(row, col));
        
        Guess guess = new Guess(row, col);
        return guess;
    }
}