package com.adp.test;

import com.adp.test.models.Lift;
import com.adp.test.services.LiftService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


public class LiftTest {

    @Autowired
    LiftService liftService;

    @Test
    void testCallLift() {
        String direction = "UP";
        int destinationFloor = 3;
        Lift lift = new Lift();
        lift.setCurrentFloor(0);

        assertEquals(destinationFloor, liftService.askingForLift(destinationFloor, direction));
        verify(liftService).getFloorsToMove(destinationFloor, direction);
    }
}
