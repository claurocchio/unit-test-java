package com.adp.test.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Floor {
    Integer floorCurrentNumber;
    Integer destinationFloor;
    Integer totalFloors;
    List<Integer> floorNumbers;
}
