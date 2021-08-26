package com.adp.test.services;

import com.adp.test.models.Floor;
import com.adp.test.models.Lift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiftService {

    @Autowired
    Lift lift;

    @Autowired
    Floor floor;

    public int askingForLift(Integer destinationFlor, String direction) {
        return getFloorsToMove(destinationFlor, direction);
    };

    public Integer getFloorsToMove(Integer floorTo, String direction){
        if(direction.equalsIgnoreCase("UP")){
            return floorTo - lift.getCurrentFloor();
        }
        return lift.getCurrentFloor() - floorTo;
    };

    String getLiftDirection(Integer floorsBetween) {
        if(floorsBetween > 0) {
            return "UP";
        } else {
            return "DOWN";
        }
    }

}
