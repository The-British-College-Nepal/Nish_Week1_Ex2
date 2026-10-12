
package vehicles;

/**
 * Step 2: Complete the Car subclass.
 * Extends {@link Vehicle}.
 *
 * Requirements:
 * 1. Constructor validates fuel level between 0 and 100.
 * 2. getFuelLevelPercent() returns fuelLevelPercent.
 * 3. refuel(int amount) adds fuel, capped at 100.
 * 4. calculateTravelTime(double distanceInKm) validates distance
 *    and returns distanceInKm / getMaxSpeed().
 */
public class Car extends Vehicle {

    private int fuelLevelPercent;

    public Car(String model, int maxSpeed, int passengerCapacity, int fuelLevelPercent) {
        super(model, maxSpeed, passengerCapacity);

        // TODO [Step 2.1]: Validate fuel level
        if (fuelLevelPercent < 0 || fuelLevelPercent > 100) {
            throw new IllegalArgumentException(
                    "Fuel level must be between 0 and 100"
            );
        }

        // TODO [Step 2.2]: Assign fuel level
        this.fuelLevelPercent = fuelLevelPercent;
    }

    public int getFuelLevelPercent() {
        // TODO [Step 2.3]: Return fuel level
        return fuelLevelPercent;
    }

    public void refuel(int amount) {
        // TODO [Step 2.4]: Validate refuel amount
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Refuel amount must be positive"
            );
        }

        // TODO [Step 2.5]: Add fuel, capped at 100
        this.fuelLevelPercent = Math.min(
                100,
                this.fuelLevelPercent + amount
        );
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        // TODO [Step 2.6]: Validate distance
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be positive"
            );
        }

        // TODO [Step 2.7]: Calculate travel time
        return distanceInKm / (double) getMaxSpeed();
    }
}
