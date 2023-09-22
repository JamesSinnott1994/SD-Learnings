package com.healthycoderapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BMICalculatorTest {

    private String environment = "dev";

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all unit tests.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all unit tests.");
    }

    @Nested
    class IsDietRecommended {
        @ParameterizedTest(name = "weight={0}, height={1}")
        @CsvFileSource(resources = "/diet-recommended-input-data.csv", numLinesToSkip = 1)
        public void Should_ReturnTrue_When_DietRecommended (Double coderWeight, Double coderHeight) {

            // given
            double weight = coderWeight;
            double height = coderHeight;

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
    }

    @Nested
    @DisplayName("{{}} sample inner class display name")
    class FindCoderWithWorstBMI {
        @Test // If annotation is not added, method will not be executed as a unit test
        @DisplayName(">>>> sample method display name")
        @DisabledOnOs(OS.WINDOWS)
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
        void should_ReturnCoderWithWorstBMIIn1Ms_When_CoderListHas10000Elements() {

            // given
            assumeTrue(BMICalculatorTest.this.environment.equals("prod"));
            List<Coder> coders = new ArrayList<>();
            for (int i=0; i < 10000; i++) {
                coders.add(new Coder(1.0 + i, 10.0 + i));
            }

            // when
            Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

            // then
            assertTimeout(Duration.ofMillis(500), executable);

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
    }

    @Nested
    class GetBMIScoresTest {
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
}