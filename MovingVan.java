   
public class MovingVan extends Truck {
    private int distanceToCargo;
    private boolean hasRamp;

    public MovingVan(String make, String model, int year, int numWheels, 
                     int distance, boolean rampPresent) {
        
        super(make, model, year, numWheels);
        if(distance <= 0) {
            throw new IllegalArgumentException();
        }
        this.distanceToCargo = distance;
        this.hasRamp = rampPresent;     
    }
    
    public int getDistanceToCargo() {
        return this.distanceToCargo;
    }   
    
    public boolean hasRamp() {
        return this.hasRamp;
    }
    
    public String toString() {
        String str = "capacity = " + this.getCapacity();
        str = str + ", distance to cargo = " + this.distanceToCargo + ", ";
        
        if(this.hasRamp) {
            str = str + "has a ramp";
        } else {
            str = str + "does not have a ramp";
        }
        return str;
    }
}
