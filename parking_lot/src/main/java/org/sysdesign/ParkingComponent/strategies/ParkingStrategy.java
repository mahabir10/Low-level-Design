package org.sysdesign.ParkingComponent.strategies;

import org.sysdesign.ParkingComponent.dto.ParkingLotInfo;

public interface ParkingStrategy {
    void init(ParkingLotInfo parkingLotInfo);

    ParkingInfo getParking(VehicleInfo vehicleInfo);

    void clearSpot(ParkingInfo parkingInfo);
}
