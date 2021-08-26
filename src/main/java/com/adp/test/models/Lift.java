package com.adp.test.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Lift {

    int currentFloor;
    int destinationFloor;
    String direction;

}
