package com.codetest;

public class ceilingFan {
    Speed speed;
    Direction direction;
    speedPullCord speedCord;
    public ceilingFan() {
    speed = Speed.OFF;
    direction = Direction.CLOCKWISE;
    speedCord = new speedPullCord();
    }
}