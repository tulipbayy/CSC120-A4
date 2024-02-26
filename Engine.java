
// Define FuelType enum
enum FuelType {
    STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER;
}
 /**
 * Represents an engine that powers a train.
 */
public class Engine {
    // Attributes
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Constructs an Engine object with the specified fuel type and maximum fuel capacity.
     *
     * @param fuelType   the type of fuel used by the engine
     * @param maxFuel    the maximum fuel capacity of the engine
     */
    public Engine(FuelType fuelType, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
    }

    /**
     * Gets the fuel type of the engine.
     *
     * @return the fuel type of the engine
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Gets the current fuel level of the engine.
     *
     * @return the current fuel level of the engine
     */
    public double getCurrentFuel() {
        return currentFuel;
    }

    /**
     * Gets the maximum fuel capacity of the engine.
     *
     * @return the maximum fuel capacity of the engine
     */
    public double getMaxFuel() {
        return maxFuel;
    }

    /**
     * Refuels the engine, resetting the current fuel level to the maximum capacity.
     */
    public void refuel() {
        currentFuel = maxFuel;
    }

    /**
     * Simulates the operation of the engine by decreasing the current fuel level.
     *
     * @return true if the engine can continue operating (fuel level > 0), false otherwise
     */
    public boolean go() {
        if (currentFuel > 0) {
            currentFuel -= 1; // Adjust as needed
            System.out.println("Remaining fuel level: " + currentFuel);
            return true;
        } else {
            System.out.println("Out of fuel!");
            return false;
        }
    }
}
