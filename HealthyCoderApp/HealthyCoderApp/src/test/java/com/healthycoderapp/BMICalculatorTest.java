package com.healthycoderapp;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @Test
    public void Should_ReturnTrue_When_DietRecommended () {

        // given
        double weight = 81.2;
        double height = 1.65;

        // when (invoke method under test and store result in variable)
        boolean recommonded = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(recommonded);
    }

    @Test
    public void Should_ReturnFalse_When_DietNotRecommended () {

        // given
        double weight = 50;
        double height = 1.92;

        // when (invoke method under test and store result in variable)
        boolean recommonded = BMICalculator.isDietRecommended(weight, height);

        // then
        assertFalse(recommonded);
    }

    @Test
    public void Should_ThrowArithmeticException_When_HeightZero () {

        // given
        double weight = 50;
        double height = 0.0;

        // when (invoke method under test and store result in variable)
        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

        // then
        assertThrows(ArithmeticException.class, executable);
    }

}