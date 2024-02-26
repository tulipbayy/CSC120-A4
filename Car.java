/**
 * The Car class represents a passenger car in a train system.
 * It stores information about the passengers aboard the car and its maximum capacity.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructs a new Car object with the specified maximum capacity.
     *
     * @param maxCapacity the maximum number of passengers the car can accommodate
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengers = new ArrayList<>(maxCapacity);
    }

    /**
     * Returns the maximum capacity of the car.
     *
     * @return the maximum number of passengers the car can accommodate
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Returns the number of remaining seats in the car.
     *
     * @return the number of seats available for passengers to board
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * Adds a passenger to the car if there is available space.
     *
     * @param p the passenger to add to the car
     * @return true if the passenger is successfully added, false otherwise
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        } else {
            return false; // No seats available
        }
    }

    /**
     * Removes a passenger from the car.
     *
     * @param p the passenger to remove from the car
     * @return true if the passenger is successfully removed, false otherwise
     */
    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    /**
     * Prints the manifest of passengers aboard the car.
     * If the car is empty, it prints a message indicating so.
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers aboard the car:");
            for (Passenger passenger : passengers) {
                System.out.println(passenger.getName());
            }
        }
    }
}
