package com.codetest;

public enum Speed {
 OFF, LOW, MEDIUM, HIGH;
 private static final Speed[] vals = values();
 public Speed nextSpeed() {
    return vals[(this.ordinal() + 1) % vals.length];
 }
}
