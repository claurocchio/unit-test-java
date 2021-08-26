package com.adp.test;

import com.adp.test.models.Lift;
import com.adp.test.services.LiftService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Tag("Service")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LiftTest {

    @Autowired
    LiftService liftService;

    Lift lift = new Lift();

    @BeforeEach
    void setUp() {
        lift.setCurrentFloor(0);
        lift.setDestinationFloor(3);
        lift.setDirection("UP");
        lift.setFloorsToMove(3);
    }

    @Test
    void testCallLift() {
        assertEquals(lift.getFloorsToMove(), liftService.callLift(lift.getCurrentFloor(), lift.getDestinationFloor()).getFloorsToMove());
        assertEquals(lift.getDirection(), liftService.callLift(lift.getCurrentFloor(), lift.getDestinationFloor()).getDirection());
    }

    @Test
    void testGetDirectionArrows() {
        String directionUP = "UP";
        String directionDown = "DOWN";

        assertEquals(directionUP, liftService.callLift(lift.getCurrentFloor(), lift.getDestinationFloor()).getDirection());
        assertNotEquals(directionDown, liftService.callLift(lift.getCurrentFloor(), lift.getDestinationFloor()).getDirection());
    }
}
