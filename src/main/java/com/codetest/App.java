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
    /**
     * Main input loop for the program, continues running until user inputs 0
     */
    while (running) {
            input = scanner.nextInt();
            switch (input) {
                case 0:
                // Exit the program
                running = false;
                    break;
                case 1:
                // Pull speedCord
                    fan.speedCord.pull();
                    fan.speedCord.printState();
                    break;
                case 2:
                // Pull directionCord
                    fan.dirCord.pull();
                    fan.dirCord.printState();
                    break;
                case 3:
                // Reprint the commands
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