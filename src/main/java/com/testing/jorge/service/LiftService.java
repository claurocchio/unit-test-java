package com.testing.jorge.service;

import com.testing.jorge.model.Lift;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class LiftService {

    private Lift lift = new Lift();
    private List<Integer> floorList = IntStream.range(1, 10).boxed().collect(Collectors.toList());

    public Lift callLift(int sourceFloor, String sourceDirection) throws InterruptedException {
        if (!floorList.contains(sourceFloor)) {
            throw new RuntimeException("Floor doest not exist");
        }
        Thread.sleep(1000);
        lift.setCurrentFloor(sourceFloor);
        lift.setCurrentDirection(sourceDirection);
        return lift;
    }

    public Lift requestLift(int targetFloor) throws InterruptedException {
        if (!floorList.contains(targetFloor)) {
            throw new RuntimeException("Floor doest not exist");
        }
        Thread.sleep(1000);
        lift.setCurrentFloor(targetFloor);
        return lift;
    }
}
