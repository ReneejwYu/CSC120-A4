/**
 * The Passanger class represents a passenger with a name and 
 * provides methods to board or get off a car.
 */
public class Passenger {
    private String name;

    /**
     * Constructs a Passenger object with the given name.
     * 
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the passenger.
     * 
     * @return the name of the passenger
     */
    public String getName() {
        return name;
    }

    /**
     * Attempts to board the specified car. If successful, the passenger 
     * is added to the car's passenger list.
     * 
     * @param c the car to board
     * @return true if the passenger successfully boards the car, 
     *         false otherwise
     */
    public boolean boardCar(Car c) {
        if (c.addPassenger(this)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Attempts to get off the specified car. If successful, the passenger 
     * is removed from the car's passenger list.
     * 
     * @param c the car to get off
     * @return true if the passenger successfully gets off the car, 
     *         false otherwise
     */
    public boolean getOffCar(Car c) {
        if (c.removePassenger(this)) {
            return true;
        } else {
            return false;
        }
    }
}
