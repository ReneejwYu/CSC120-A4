import java.util.ArrayList;

/**
 * The Car class represents a train car that holds passengers.
 * It has a maximum capacity and a list of current passengers.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructs a new Car with a specified maximum capacity.
     * 
     * @param maxCapacity the maximum number of passengers the car can hold
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>();
    }

    /**
     * Returns the maximum capacity of the car.
     * 
     * @return the maximum capacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Returns the number of available seats in the car.
     * 
     * @return the number of remaining seats
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * Adds a passenger to the car if there are available seats.
     * 
     * @param p the passenger to add
     * @return true if the passenger was added, false if the car is full
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengers.add(p);
            return true;
        } else {
            return false; 
        }
    }

    /**
     * Removes a passenger from the car if they are onboard.
     * 
     * @param p the passenger to remove
     * @return true if the passenger was removed, false if the passenger was not onboard
     */
    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prints the list of passengers currently onboard the car.
     * If no passengers are onboard, it prints "This car is EMPTY."
     */
    public void printManifest() {
        if (passengers.size() == 0) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }
}
