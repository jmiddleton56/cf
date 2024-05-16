package com.codetest;

public class directionPullCord implements pullCord{
    ceilingFan fan;
    public directionPullCord(ceilingFan fan) {
        this.fan = fan;
    }

    /** 
     * @param fan
     */
    public void pull() {
        if (fan.dateLocked) {
            System.out.println("The date is December 25th and the fan is off all day, the direction cannot be changed!");
            return;
        } else {
        fan.direction = fan.direction.changeDir();
    }
    }
    public void getState() {
        System.out.println("The current direction is: " + fan.direction + "\n");
    }

}
