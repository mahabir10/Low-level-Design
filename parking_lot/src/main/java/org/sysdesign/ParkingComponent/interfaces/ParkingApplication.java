package org.sysdesign.ParkingComponent.interfaces;

import org.sysdesign.ParkingComponent.dto.ParkingLotInfo;
import org.sysdesign.exceptions.SpotNotFoundException;

public interface ParkingApplication {

    ParkingInfo getParkingForVehicle(VehicleInfo vehicleInfo) throws SpotNotFoundException;
    void clearSpot(ParkingInfo parkingInfo);

    void updateParkingLot(ParkingLotInfo parkingLotInfo);

}
