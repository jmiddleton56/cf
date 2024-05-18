package com.codetest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

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
        assertEquals(Speed.OFF, testFan.speed, "Speed should be OFF");
        testFan.speedCord.pull();
        assertEquals(Speed.LOW, testFan.speed, "Speed should be LOW");
        testFan.speedCord.pull();
        assertEquals(Speed.MEDIUM, testFan.speed, "Speed should be MEDIUM");
        testFan.speedCord.pull();
        assertEquals(Speed.HIGH, testFan.speed, "Speed should be HIGH");
        testFan.speedCord.pull();
        assertEquals(Speed.OFF, testFan.speed, "Speed should be OFF");
    }
    @Test
    void testDirection() {
        assertEquals (Direction.CLOCKWISE, testFan.direction, "Direction should be CLOCKWISE");
        testFan.dirCord.pull();
        assertEquals (Direction.COUNTER_CLOCKWISE, testFan.direction, "Direction should be COUNTER_CLOCKWISE");
    }

    @Test
    void testDate() {
        assertEquals (false, testFan.dateLocked, "It is not december 25th, so the fan should work normally");
    }

    @Test
    void testDateSpoof() {
        // Spoof the currentDate to December 25th
        testFan.currentDate = LocalDate.of(2024, 12, 25);
        testFan.checkDate();
        assertEquals (true, testFan.dateLocked, "It is December 25th, so the fan should be off all day");
    }
    @AfterEach
    void deleteFan() {
        ceilingFan testFan = null;
    }
  
}