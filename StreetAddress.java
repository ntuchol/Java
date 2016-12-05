/*
 * StreetAddress.java
 * Encapsulated blueprint class for street address objects, whose fields
 * consist of the street name and number.  
 */ 
public class StreetAddress {
    private int num;
    private String name;

    public StreetAddress(int initialNum, String initialName) {
        this.setNum(initialNum);
        this.setName(initialName);
    }
    
    // Changes the value of the street number, making sure that it is always positive
    public void setNum(int newNum) {
        if (newNum <= 0) {
            throw new IllegalArgumentException();
        }

        this.num = newNum;
    }
    
    /*
     * Changes the value of the street name, making sure that it is no more than
     * 30 characters long
     */ 
    public void setName(String newName) {
        if (newName.length() > 30) {
            throw new IllegalArgumentException();
        }

        this.name = newName;
    }
    
    // Obtains the value of the street number
    public int getNum() {
        return this.num;
    }
    
    // Obtains the value of the street name
    public String getName() {
        return this.name;
    }
    public boolean onEvenSide() {
        return (this.num % 2 == 0);
    }

}

            