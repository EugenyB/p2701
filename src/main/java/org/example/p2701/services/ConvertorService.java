package org.example.p2701.services;

import org.example.p2701.logic.Convertor;
import org.springframework.stereotype.Service;

@Service
public class ConvertorService {
    public double celsiusToFahrenheit(double c) {
        return new Convertor().celsiusToFahrenheit(c);
    }

    public double fahrenheitToCelsius(double f) {
        return new Convertor().fahrenheitToCelsius(f);
    }
}
