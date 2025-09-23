package org.sysdesign.models;

import org.sysdesign.enums.VehicleType;

public class ParkingInfo {
    private String spot;

    private VehicleType vehicleType;

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }
}
