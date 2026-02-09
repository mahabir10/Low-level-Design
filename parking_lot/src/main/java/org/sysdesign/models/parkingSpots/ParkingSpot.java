package org.sysdesign.models.parkingSpots;

import org.sysdesign.models.vehicles.Vehicle;
import org.sysdesign.models.vehicles.VehicleType;

public interface ParkingSpot {
    String getId();
    boolean isAvailable();
    void occupy(Vehicle vehicle);
    void vacate();
    VehicleType getType();

    Vehicle getParkedVehicle();
}
