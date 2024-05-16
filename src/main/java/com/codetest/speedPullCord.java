package com.codetest;

public class speedPullCord extends ceilingFan implements pullCord{
    public void pull() {
        this.speed = this.speed.nextSpeed();
    }
    public void getState() {
        System.out.println("The current speed is: " + this.speed);
    }
}
