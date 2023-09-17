package com.healthycoderapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all unit tests.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all unit tests.");
    }

    @ParameterizedTest
    @ValueSource(doubles = {89.0, 95.0, 110.0})
    public void Should_ReturnTrue_When_DietRecommended (Double coderWeight) {

        // given
        double weight = coderWeight;
        double height = 1.72;

        // when (invoke method under test and store result in variable)
        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(recommended);
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

    @Test // If annotation is not added, method will not be executed as a unit test
    public void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty() {

        // given (create list of coders)
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));

        // when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        // then (matches coder with worst bmi score)
        assertAll(
            () -> assertEquals(1.82, coderWorstBMI.getHeight()),
            () -> assertEquals(98.0, coderWorstBMI.getWeight())
        );

    }

    @Test
    public void should_ReturnNullWorstBMICoder_When_CoderListEmpty() {

        // given
        List<Coder> coders = new ArrayList<>();

        // when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        // then
        assertNull(coderWorstBMI);

    }

    @Test
    public void should_ReturnCorrectBMIScoreArray_When_CoderListNotEmpty() {

        // given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));
        double[] expected = {18.52, 29.59, 19.53};

        // when
        double[] bmiScores = BMICalculator.getBMIScores(coders);

        // then
        assertArrayEquals(expected, bmiScores);

    }

}