package com.testing.jorge.service;

import com.testing.jorge.model.Lift;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class LiftServiceTest {

    @Autowired
    private LiftService liftService;

    @Test
    void liftShouldRespondToCall() throws InterruptedException {
        Lift lift = liftService.callLift(3, "up");
        Assert.isTrue(lift.getCurrentFloor() == 3, "Floor is correct");
        Assert.isTrue(lift.getCurrentDirection().equals("up"), "Direction is correct");
    }

    @Test
    void liftShouldRespondToRequest() throws InterruptedException {
        Lift lift = liftService.requestLift(5);
        Assert.isTrue(lift.getCurrentFloor() == 5, "Floor is correct");
    }
}
