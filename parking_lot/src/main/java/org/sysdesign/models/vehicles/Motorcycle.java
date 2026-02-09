package org.sysdesign.models.vehicles;

import org.sysdesign.enums.PowerType;
import org.sysdesign.enums.VehicleSize;

public class Motorcycle implements Vehicle{

    private final String licencePlate;

    public Motorcycle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String getLicencePlate() {
        return licencePlate;
    }

    @Override
    public VehicleType getType() {
        return new VehicleType(VehicleSize.COMPACT, PowerType.GAS);
    }
}
