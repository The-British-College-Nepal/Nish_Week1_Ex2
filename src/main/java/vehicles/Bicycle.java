
package vehicles;

/**
 * Step 1: Complete the Bicycle subclass.
 * Extends Vehicle.
 *
 * Requirements:
 * 1. Constructor: Bicycle(String model, int maxSpeed, int gearCount)
 *    - Calls super(model, maxSpeed, 1).
 *    - Checks that gearCount > 0.
 *    - Stores gearCount in the private field.
 * 2. getGearCount(): Returns the gearCount.
 * 3. calculateTravelTime(double distanceInKm):
 *    - Throws IllegalArgumentException if distanceInKm <= 0.
 *    - Returns distanceInKm / getMaxSpeed().
 */
public class Bicycle extends Vehicle {

    private int gearCount;

    public Bicycle(String model, int maxSpeed, int gearCount) {
        super(model, maxSpeed, 1);

        // Validate gear count
        if (gearCount <= 0) {
            throw new IllegalArgumentException(
                    "Gear count must be positive"
            );
        }

        // Assign gear count
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {

        // Validate distance
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be positive"
            );
        }

        // Calculate travel time in hours
        return distanceInKm / (double) getMaxSpeed();
    }
}
