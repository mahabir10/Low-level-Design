package org.sysdesign.ParkingComponent;

import org.sysdesign.ParkingComponent.dto.ParkingLotInfo;
import org.sysdesign.ParkingComponent.interfaces.ParkingApplication;
import org.sysdesign.ParkingComponent.strategies.ParkingStrategy;
import org.sysdesign.exceptions.SpotNotFoundException;

public class ParkingApplicationImpl implements ParkingApplication {

    private ParkingLotInfo parkingLotInfo;
    private final ParkingStrategy parkingStrategy;

    ParkingApplicationImpl(ParkingLotInfo parkingLotInfo, ParkingStrategy parkingStrategy){
        this.parkingStrategy = parkingStrategy;
        this.parkingLotInfo = parkingLotInfo;

        this.parkingStrategy.init(this.parkingLotInfo);
    }

    @Override
    public ParkingInfo getParkingForVehicle(VehicleInfo vehicleInfo) {

        try{
            return this.parkingStrategy.getParking(vehicleInfo);
        }
        catch (Exception e){
            System.out.println("Could not get the parking lot for the vehicle: " + vehicleInfo.toString());
            throw new SpotNotFoundException("Parking Spot not found, Exception Occurred: " + e.getMessage());
        }

    }

    @Override
    public void clearSpot(ParkingInfo parkingInfo) {
        try{
            this.parkingStrategy.clearSpot(parkingInfo);
        }
        catch (Exception e){
            System.out.println("Exception occurred while clearing the parking spot.");
        }
    }

    @Override
    public void updateParkingLot(ParkingLotInfo parkingLotInfo) {
        this.parkingLotInfo = parkingLotInfo;
        this.parkingStrategy.init(this.parkingLotInfo);
    }
}
