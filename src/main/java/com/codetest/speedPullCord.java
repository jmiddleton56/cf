package com.codetest;

public class speedPullCord implements pullCord{
    ceilingFan fan;
    public speedPullCord(ceilingFan fan) {
        this.fan = fan;
    }
    public void pull() {
        if (fan.dateLocked) {
            System.out.println("The date is December 25th and the fan is off all day, the speed cannot be changed!");
            return;
        } else {
        fan.speed = fan.speed.nextSpeed();
        }
    }
    public void getState() {
        System.out.println("The current speed is: " + fan.speed + "\n");
    }
}
