package com.codetest;

public enum Direction {
    CLOCKWISE, COUNTER_CLOCKWISE; // Two directions for the fan
    private static final Direction[] vals = values();
    /**
    * Get the next direction value
    * @return the next direction value
    */
    public Direction changeDir() {
       return vals[(this.ordinal() + 1) % vals.length];
    }
}
