package com.codetest;

public enum Direction {
    CLOCKWISE, COUNTER_CLOCKWISE;
    private static final Direction[] vals = values();
    public Direction changeDir() {
       return vals[(this.ordinal() + 1) % vals.length];
    }
}
