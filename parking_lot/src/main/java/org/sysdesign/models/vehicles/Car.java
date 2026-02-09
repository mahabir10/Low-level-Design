package org.sysdesign.models.vehicles;

import org.sysdesign.enums.PowerType;
import org.sysdesign.enums.VehicleSize;

public class Car implements Vehicle{
    private final String licencePlate;

    public Car(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String getLicencePlate() {
        return licencePlate;
    }

    @Override
    public VehicleType getType() {
        return new VehicleType(VehicleSize.MEDIUM, PowerType.GAS);
    }
}
