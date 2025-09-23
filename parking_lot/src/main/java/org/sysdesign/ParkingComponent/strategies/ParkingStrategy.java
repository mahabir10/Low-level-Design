package org.sysdesign.ParkingComponent.strategies;

import org.sysdesign.ParkingComponent.dto.ParkingLotInfo;
import org.sysdesign.models.ParkingInfo;
import org.sysdesign.models.VehicleInfo;

public interface ParkingStrategy {
    void init(ParkingLotInfo parkingLotInfo);

    ParkingInfo getParking(VehicleInfo vehicleInfo);

    void clearSpot(ParkingInfo parkingInfo);
}
