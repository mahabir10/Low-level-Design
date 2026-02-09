package org.sysdesign.models.vehicles;

import org.sysdesign.enums.PowerType;
import org.sysdesign.enums.VehicleSize;

public record VehicleType(VehicleSize size, PowerType powerType) {

    public boolean isElectric() {
        return powerType == PowerType.ELECTRIC;
    }

    @Override
    public String toString() {
        return size + "_" + powerType;
    }
}
