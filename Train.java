import java.util.ArrayList;

/**
 * The Train class represents a train consisting of an engine and multiple cars.
 * It manages the engine, cars, and passengers on the train.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructs a Train with the specified fuel type, fuel capacity, number of cars, and passenger capacity per car.
     * Initializes the engine and creates the cars with the given passenger capacity.
     * 
     * @param fuelType the type of fuel the engine uses
     * @param fuelCapacity the maximum fuel capacity of the engine
     * @param nCars the number of cars in the train
     * @param passengerCapacity the passenger capacity of each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the engine of the train.
     * 
     * @return the engine of the train
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns the car at the specified index.
     * 
     * @param i the index of the car to retrieve
     * @return the car at the specified index, or null if the index is invalid
     */
    public Car getCar(int i) {
        if (i < cars.size()) {
            return cars.get(i);
        } else {
            return null;  // Invalid index
        }
    }

    /**
     * Returns the maximum total capacity of the train across all cars.
     * 
     * @param passengerCapacity the capacity of a single car
     * @return the maximum total capacity of the train
     */
    public int getMaxCapacity(int passengerCapacity) {
        return passengerCapacity * cars.size();
    }

    /**
     * Returns the number of remaining seats across all cars.
     * 
     * @return the total number of remaining seats on the train
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    /**
     * Prints the manifest of all passengers on the train.
     * Each car's passenger list is printed along with the car number.
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }
}
