package com.codetest;

public class speedPullCord implements pullCord{
    ceilingFan fan;
    public speedPullCord(ceilingFan fan) {
        this.fan = fan;
    }

    /**
     * Pull the speed cord to change the speed of the 
     * fan by calling the nextSpeed() function
     */
    public void pull() {
        if (fan.dateLocked) {
            System.out.println("The date is December 25th and the fan is off all day, the speed cannot be changed!");
            return;
        } else {
        fan.speed = fan.speed.nextSpeed();
        }
    }

    /**
     * Print the current state of the speed of the fan
     */
    public void printState() {
        System.out.println("The current speed is: " + fan.speed + "\n");
        
    }
}
