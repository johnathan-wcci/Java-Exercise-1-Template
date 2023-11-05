package com.wecancodeit;

import java.util.Arrays;

public class Exercises {

    /* Question 1
    You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
    If they are all the value 2, the result is 10. Otherwise, if they are all the same,
    the result is 5. Otherwise, if both b and c are different from a, the result is 1.
    Otherwise, the result is 0.

    redTicket(2, 2, 2) → 10
    redTicket(2, 2, 1) → 0
    redTicket(0, 0, 0) → 5
    */  
    public int redTicket(int a, int b, int c) {

    }

    /* Question 2
    The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
    is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. 
    Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

    squirrelPlay(70, false) → true
    squirrelPlay(95, false) → false
    squirrelPlay(95, true) → true
    */
    public boolean squirrelPlay(int temp, boolean isSummer) {

    }



    /* Question 3
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
    return true if 1 or more of them are teen.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
    */
    public boolean hasTeen(int a, int b, int c) {
        
    }

    /* Question 4
    Given two int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
    */
    public boolean posNeg(int a, int b, boolean negative) {
        
    }



    /* Question 5
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
    */
    public boolean icyHot(int temp1, int temp2) {
        
    }

    /* Question 6
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    diff21(22) → 2
    diff21(-10) → 31
    */
    public int diff21(int n) {

    }

    /* Question 7
    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    However, if we are on vacation, on weekdays it should be "10:00" and weekends it should be "off".

    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"
    */
    public String alarmClock(int day, boolean vacation) {

    }

    /* Question 8
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b, so (7 % 3) is 1.

    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
    */
    public boolean nearTen(int num) {
        
    }

    /* Question 9
    Given a string str, if the string starts with "f" return "Fizz".
    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
    In all other cases, return the string unchanged.

    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
    */
    public String fizzString(String str) {

    }

    /* Question 10
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
    */
    public String notString(String str) {

    }

    /* Question 11
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
    */
    public boolean parrotTrouble(boolean talking, int hour) {
       
    }

    /* Question 12
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
    */
    public boolean makes10(int a, int b) {
        
    }

    /* Question 13
    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
    */
    public String makeAbba(String a, String b) {
        
    }

}

