package com.healthycoderapp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void test () {
        assertTrue(BMICalculator.isDietRecommended(81.2, 1.65));
    }

}