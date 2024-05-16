package com.codetest;

import java.time.LocalDate;
import java.time.Month;

 /** 
  * Main class for simple ceiling fan
  */
public final class App {
 /** 
  * @param args
  * Main runner method for simple ceiling fan
  */
 public static void main(String[] args) {
        final int DAY = 25;
        ceilingFan fan = new ceilingFan();
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonth() == Month.DECEMBER) {
            if (currentDate.getDayOfMonth() == DAY) {
                System.out.println("The current date is December 25th, the ceiling fan will be off all day today!");
                fan.speed = Speed.OFF;
            }
        }
        

        System.out.println("The current speed is: " + fan.speed);
        fan.speedCord.pull();
        System.out.println("The current speed is: " + fan.speed);
    }
}
