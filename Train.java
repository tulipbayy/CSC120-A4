import java.util.ArrayList;

/**
 * Represents a train consisting of an engine and multiple cars.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructs a train with the specified parameters.
     *
     * @param fuelType         the type of fuel for the engine
     * @param fuelCapacity     the maximum fuel capacity of the engine
     * @param nCars            the number of cars in the train
     * @param passengerCapacity the maximum passenger capacity per car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Gets the engine of the train.
     *
     * @return the engine of the train
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Gets the car at the specified index.
     *
     * @param i the index of the car
     * @return the car at the specified index, or null if index is out of bounds
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            return null;
        }
    }

    /**
     * Calculates the maximum capacity of the train.
     *
     * @return the maximum capacity of the train
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * Calculates the remaining seats in the train.
     *
     * @return the remaining seats in the train
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    /**
     * Prints the manifest of passengers onboard the train.
     */
    public void printManifest() {
        System.out.println("Passengers onboard the train:");
        for (Car car : cars) {
            car.printManifest();
        }
    }
}
