/*
 * BlockLetterWriter.java
 * Natalia Tucholska (ntuchol@bu.edu)
 * This program writes the phrase "going going gone" in block letter format. 
 */
public class BlockLetterWriter{
    public static void main(String[] args) {
        writeGoing();
        createSpace();
        writeGoing();
        createSpace();
        writeGone();
        System.out.println();
    }
    // This method writes the word "going" in block letters.
    public static void writeGoing() {
        writeG();
        System.out.println();
        writeO();
        System.out.println();
        writeI();
        System.out.println();
        writeN();
        System.out.println();
        writeG();
    }
    // Writes the word "gone" in block letters.
    public static void writeGone() {
        writeG();
        System.out.println();
        writeO();
        System.out.println();
        writeN();
        System.out.println();
        writeE();
    }
    // Creates a space of five blank lines in between each word.
    public static void createSpace() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    // Writes the letter G.
    public static void writeG() {
        System.out.println("+------");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|   --+");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("+-----+");
    }
    // Writes the letter O.
    public static void writeO() {
        System.out.println("+-----+");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("+-----+");
    }
    // Writes the letter I.
    public static void writeI() {
        System.out.println("---+---");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("---+---");
    }
    // Writes the letter N.
    public static void writeN() {
        System.out.println("|     |");
        System.out.println("|\\    |");
        System.out.println("| \\   |");
        System.out.println("|  \\  |");
        System.out.println("|   \\ |");
        System.out.println("|    \\|");
        System.out.println("|     |");
    }
    // Writes the letter E.
    public static void writeE() {
        System.out.println("+------");
        System.out.println("|");
        System.out.println("|");
        System.out.println("+------");
        System.out.println("|");
        System.out.println("|");
        System.out.println("+------");
    }
}