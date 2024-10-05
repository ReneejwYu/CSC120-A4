/**
 * The Engine class represents the locomotive engine of a train.
 * It manages the type of fuel, fuel levels, and simulates the engine running.
 */
public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructs an Engine with the specified fuel type and maximum fuel level.
     * The current fuel level is initialized to the maximum fuel level.
     * 
     * @param fuelType the type of fuel the engine uses
     * @param maxFuelLevel the maximum fuel level the engine can hold
     */
    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel; 
    }

    /**
     * Returns the type of fuel the engine uses.
     * 
     * @return the fuel type
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Returns the current fuel level of the engine.
     * 
     * @return the current fuel level
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * Returns the maximum fuel level the engine can hold.
     * 
     * @return the maximum fuel level
     */
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    /**
     * Refuels the engine by resetting the current fuel level to the maximum fuel level.
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    /**
     * Simulates the engine running, decreasing the current fuel level by 1 unit.
     * 
     * @return true if the engine has enough fuel to run, false if out of fuel
     */
    public boolean go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel -= 1;  
            return true;
        } else {
            return false;
        }
    }

    /**
     * Main method for testing the Engine class.
     * Creates an engine with ELECTRIC fuel type and a max fuel level of 100,
     * then runs the engine until it runs out of fuel.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
