package com.healthycoderapp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void Should_ReturnTrue_When_DietRecommended () {

        // given
        double weight = 81.2;
        double height = 1.65;

        // when (invoke method under test and store result in variable)
        boolean recommonded = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(recommonded);
    }

}