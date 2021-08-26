package com.adp.test.lift;

public class Lift {

    private int currentFloor;
    private static int MIN_FLOOR = 0;
    private static int MAX_FLOOR = 10;
    private int maxFloor;

    public Lift() {}

    public int goToFloor(int sourceFloor, int targetFloor){
        System.out.println("going to floor " + targetFloor);
        boolean isValidFloor = targetFloor >= MIN_FLOOR && targetFloor <= MAX_FLOOR;
        if (!isValidFloor) {
            throw new IllegalArgumentException("floor does not exist");
        }
        return targetFloor;
    }

}
