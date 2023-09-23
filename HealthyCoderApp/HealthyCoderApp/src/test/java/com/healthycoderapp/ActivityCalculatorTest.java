package com.healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ActivityCalculatorTest {

    // Based on business requirements create test methods
    @Test
    public void should_Bad_When_AvgBelow20() {
        // given
        int weeklyCardioMins = 40;
        int weeklyWorkouts = 1;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMins, weeklyWorkouts);

        // then
        assertEquals("bad", actual);
    }

    @Test
    public void should_ReturnAverage_When_AvgBetween20And40() {
        // given
        int weeklyCardioMins = 40;
        int weeklyWorkouts = 3;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMins, weeklyWorkouts);

        // then
        assertEquals("average", actual);
    }

    @Test
    public void should_ReturnGood_When_AvgAbove40() {
        // given
        int weeklyCardioMins = 40;
        int weeklyWorkouts = 7;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMins, weeklyWorkouts);

        // then
        assertEquals("good", actual);
    }

    @Test
    public void should_ThrowException_When_InputBelowZero() {
        // given
        int weeklyCardioMins = -40;
        int weeklyWorkouts = 1;

        // when
        Executable executable = () -> ActivityCalculator.rateActivityLevel(weeklyCardioMins, weeklyWorkouts);

        // then
        assertThrows(RuntimeException.class, executable);
    }

}