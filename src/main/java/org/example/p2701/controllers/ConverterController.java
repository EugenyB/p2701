package org.example.p2701.controllers;

import lombok.AllArgsConstructor;
import org.example.p2701.logic.Res;
import org.example.p2701.services.ConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ConverterController {

    private final ConvertorService convertorService;

    @GetMapping("/ctof")
    public String ctof(@RequestParam double celsius, Model model) {
        double fahrenheit = convertorService.celsiusToFahrenheit(celsius);
        model.addAttribute("res", new Res(celsius, fahrenheit));
        return "ctof";
    }

    @GetMapping("/ftoc")
    public String ftoc(@RequestParam double fahrenheit, Model model) {

        return "ftoc";
    }
}
