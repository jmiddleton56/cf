package com.codetest;

public class directionPullCord implements pullCord{
    ceilingFan fan;
    public directionPullCord(ceilingFan fan) {
        this.fan = fan;
    }

    /**
     * Pull the direction cord to change the direction of the fan
     */
    public void pull() {
        if (fan.dateLocked) {
            System.out.println("The date is December 25th and the fan is off all day, the direction cannot be changed!");
            return;
        } else {
        fan.direction = fan.direction.changeDir();
    }
    }
    public void printState() {
        System.out.println("The current direction is: " + fan.direction + "\n");
    }

}
