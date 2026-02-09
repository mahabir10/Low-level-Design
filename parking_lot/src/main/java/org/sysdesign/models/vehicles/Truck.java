package org.sysdesign.models.vehicles;

import org.sysdesign.enums.PowerType;
import org.sysdesign.enums.VehicleSize;

public class Truck implements Vehicle{
    private final String licencePlate;

    public Truck(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String getLicencePlate() {
        return licencePlate;
    }

    @Override
    public VehicleType getType() {
        return new VehicleType(VehicleSize.LARGE, PowerType.GAS);
    }
}
