package com.wecancodeit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExercisesTest {

    Exercises exercises = new Exercises();

    @Test
    public void testRedTicket() {
        assertEquals(10, exercises.redTicket(2, 2, 2));
        assertEquals(0, exercises.redTicket(2, 2, 1));
        assertEquals(5, exercises.redTicket(0, 0, 0));
    }

    @Test
    public void testSquirrelPlay() {
        assertTrue(exercises.squirrelPlay(70, false));
        assertFalse(exercises.squirrelPlay(95, false));
        assertTrue(exercises.squirrelPlay(95, true));
    }

    @Test
    public void testHasTeen() {
        assertTrue(exercises.hasTeen(13, 20, 10));
        assertTrue(exercises.hasTeen(20, 19, 10));
        assertTrue(exercises.hasTeen(20, 10, 13));
    }

    @Test
    public void testPosNeg() {
        assertTrue(exercises.posNeg(1, -1, false));
        assertTrue(exercises.posNeg(-1, 1, false));
        assertTrue(exercises.posNeg(-4, -5, true));
    }

    @Test
    public void testIcyHot() {
        assertTrue(exercises.icyHot(120, -1));
        assertTrue(exercises.icyHot(-1, 120));
        assertFalse(exercises.icyHot(2, 120));
    }

    @Test
    
    public void testDiff21() {
        assertEquals(2, exercises.diff21(19));
        assertEquals(11, exercises.diff21(10));
        assertEquals(0, exercises.diff21(21));
        assertEquals(2, exercises.diff21(22));
        assertEquals(31, exercises.diff21(-10));
    }

    @Test
  
    public void testAlarmClock() {
        assertEquals("7:00", exercises.alarmClock(1, false));
        assertEquals("7:00", exercises.alarmClock(5, false));
        assertEquals("10:00", exercises.alarmClock(0, false));
    }

    @Test
   
    public void testNearTen() {
        assertTrue(exercises.nearTen(12));
        assertFalse(exercises.nearTen(17));
        assertTrue(exercises.nearTen(19));
    }

    @Test

    public void testFizzString() {
        assertEquals("Fizz", exercises.fizzString("fig"));
        assertEquals("Buzz", exercises.fizzString("dib"));
        assertEquals("FizzBuzz", exercises.fizzString("fib"));
    }

    @Test
    
    public void testNotString() {
        assertEquals("not candy", exercises.notString("candy"));
        assertEquals("not x", exercises.notString("x"));
        assertEquals("not bad", exercises.notString("not bad"));
    }

    @Test

    public void testParrotTrouble() {
        assertTrue(exercises.parrotTrouble(true, 6));
        assertFalse(exercises.parrotTrouble(true, 7));
        assertFalse(exercises.parrotTrouble(false, 6));
    }

    @Test

    public void testMakes10() {
        assertTrue(exercises.makes10(9, 10));
        assertFalse(exercises.makes10(9, 9));
        assertTrue(exercises.makes10(1, 9));
    }

    @Test
   
    public void testMakeAbba() {
        assertEquals("HiByeByeHi", exercises.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", exercises.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", exercises.makeAbba("What", "Up"));
    }
}
