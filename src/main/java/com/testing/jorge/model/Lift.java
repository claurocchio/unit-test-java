package com.testing.jorge.model;

public class Lift {

    private int currentFloor;
    private String currentDirection;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
}
