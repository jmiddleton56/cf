package com.codetest;

import java.util.Scanner;

 /** 
  * Main class for simple ceiling fan
  */
public final class App {
 /** 
  * @param args
  * Main runner method for simple ceiling fan
  */
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    int input;
    ceilingFan fan = new ceilingFan();
    fan.checkDate();
    printCommands();
    while (running) {
            input = scanner.nextInt();
            switch (input) {
                case 0:
                running = false;
                    break;
                case 1:
                    fan.speedCord.pull();
                    fan.speedCord.getState();
                    break;
                case 2:
                    fan.dirCord.pull();
                    fan.dirCord.getState();
                    break;
                case 3:
                    printCommands();
                    break;
                default:
                    System.out.println("Invalid command! Please try again.\n");
                    printCommands();
                    break;
            }

    }
    scanner.close();
}
    /** 
    * Prints the commands for the user
    */
    public static void printCommands() {
        System.out.println("Commands: \n1 = Pull speed cord\n2 = Pull direction cord\n3 = Command list\n0 = Exit\n");
    }
}