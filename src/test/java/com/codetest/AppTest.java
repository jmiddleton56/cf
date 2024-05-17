package com.codetest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit tests for simple ceiling fan implementation.
 */

class AppTest {
    private ceilingFan testFan;
    @BeforeEach
    void createFan() {
        testFan = new ceilingFan();
        testFan.checkDate();
    }

    @Test
    void testSpeed() {
        assertEquals (Speed.OFF, testFan.speed, "Speed should be off");
        assertEquals (Speed.LOW, testFan.speedCord.pull(), "Speed should be off");
    }

    @AfterEach
    void deleteFan() {
        ceilingFan testFan = null;
    }
  
}
