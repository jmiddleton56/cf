package com.codetest;

import java.time.LocalDate;
import java.time.Month;

/**
 * Ceiling fan class to create the object and check the date to assign
 * the date locked boolean, as well as set the initial speed and direction
 */
public class ceilingFan {
    private final int DAY = 25;
    Speed speed;
    Direction direction;
    speedPullCord speedCord;
    directionPullCord dirCord;
    boolean dateLocked;
    LocalDate currentDate;

    public ceilingFan() {
        dateLocked = false;
        speed = Speed.OFF;
        direction = Direction.CLOCKWISE;
        speedCord = new speedPullCord(this);
        dirCord = new directionPullCord(this);
        currentDate = LocalDate.now();
    }
    /**
     * Check if the date is December 25th and if so, lock the fan to off so that 
     * pulling the fan cords will have no effect
     */
    public void checkDate() {
        if ((currentDate.getMonth() == Month.DECEMBER) && (currentDate.getDayOfMonth() == DAY)) {
            System.out.println("The current date is December 25th, the ceiling fan will be off all day today!");
            this.speed = Speed.OFF;
            this.dateLocked = true;
        }
    }
}