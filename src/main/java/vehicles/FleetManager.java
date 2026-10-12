
package vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Step 3: Implement the Polymorphic FleetManager.
 * Demonstrates:
 * - Polymorphism (holding heterogeneous subclasses in a List<Vehicle>)
 * - Invariant checking (rejecting null vehicles)
 * - Encapsulation (unmodifiable view)
 */
public class FleetManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Adds a vehicle to the fleet.
     *
     * @param vehicle vehicle to add (must not be null)
     */
    public void addVehicle(Vehicle vehicle) {
        // TODO [Step 3.1]: Validate vehicle
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }

        // TODO [Step 3.2]: Add vehicle to the list
        vehicles.add(vehicle);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    /**
     * Calculates the total passenger capacity across all vehicles.
     *
     * @return total passenger capacity
     */
    public int getTotalPassengerCapacity() {
        // TODO [Step 3.3]: Sum passenger capacity
        int totalCapacity = 0;

        for (Vehicle v : vehicles) {
            totalCapacity += v.getPassengerCapacity();
        }

        return totalCapacity;
    }

    /**
     * Finds the fastest vehicle based on maxSpeed.
     *
     * @return fastest Vehicle, or null if the fleet is empty
     */
    public Vehicle findFastestVehicle() {
        // TODO [Step 3.4]: Find the fastest vehicle
        if (vehicles.isEmpty()) {
            return null;
        }

        Vehicle fastest = vehicles.get(0);

        for (Vehicle v : vehicles) {
            if (v.getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = v;
            }
        }

        return fastest;
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }
}
