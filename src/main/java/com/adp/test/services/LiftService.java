package com.adp.test.services;

import com.adp.test.models.Lift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiftService {

    @Autowired
    Lift lift;

    public Lift callLift(int floorFrom, int floorTo) {
        return getFloorsToMove(floorFrom, floorTo);
    };

    public Lift getFloorsToMove(int floorFrom, int floorTo){
        int diffBetFloors = getDiffBetweenFloors(floorFrom, floorTo);
        lift.setFloorsToMove(Math.abs(diffBetFloors));

        if(diffBetFloors > 0){
            lift.setDirection("UP");
            return lift;
        }
        lift.setDirection("DOWN");
        return lift;
    };

    public int getDiffBetweenFloors(int floorFrom, int floorTo){
        return floorTo - floorFrom;
    }

    public String getDirectionArrows(Lift lift) {
        return lift.getDirection();
    }

}
