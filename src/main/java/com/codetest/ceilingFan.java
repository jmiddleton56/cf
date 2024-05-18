package com.codetest;

import java.time.LocalDate;
import java.time.Month;


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
    public void checkDate() {
        if (currentDate.getMonth() == Month.DECEMBER) {
            if (currentDate.getDayOfMonth() == DAY) {
                System.out.println("The current date is December 25th, the ceiling fan will be off all day today!");
                this.speed = Speed.OFF;
                this.dateLocked = true;
            }
        }
    }
}