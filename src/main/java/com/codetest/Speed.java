package com.codetest;

public enum Speed {
 OFF, LOW, MEDIUM, HIGH; // 4 different speed values
 private static final Speed[] vals = values(); // Array of enum values
   /**
    * Get the next speed value
    * @return the next speed value
    */
 public Speed nextSpeed() {
    return vals[(this.ordinal() + 1) % vals.length];
 }
}
