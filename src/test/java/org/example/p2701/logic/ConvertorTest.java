package org.example.p2701.logic;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    final static double EPS = 0.000001;

    Convertor convertor;

    @BeforeEach
    void setUp() {
        convertor = new Convertor();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCelsiusToFahrenheit() {
        double x = 40;
        double expected = 104;
        double actual = convertor.celsiusToFahrenheit(x);
        assertEquals(expected, actual, EPS, "40 C -> 104 F");
    }

    @ParameterizedTest
    @CsvSource(value = {
            "40, 104",
            "10, 50",
            "37.777778, 100"
    })
    void testCelsiusToFahrenheitParametrized(double value, double expected) {
        double actual = convertor.celsiusToFahrenheit(value);
        assertEquals(expected, actual, EPS);
    }

    @Test
    void testFahrenheitToCelsius() {
        double x = 100;
        double expected = 37.777778;
        double actual = convertor.fahrenheitToCelsius(x);
        assertEquals(expected, actual, EPS);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "100, 37.777777",
            "104, 40",
            "50, 10"
    })
    void testFahrenheitToCelsiusParametrized(double value, double expected) {
        double actual = convertor.fahrenheitToCelsius(value);
        //assertEquals(expected, actual, EPS);
        assertThat(actual)
                .as("conversion " + value + " to " + expected)
                .isCloseTo(expected, Percentage.withPercentage(0.001));
    }
}