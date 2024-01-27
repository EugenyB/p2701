package org.example.p2701.logic;

public class Convertor {
    public double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
