package com.example;

import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin("*")
public class CalculatorController {

    @GetMapping("/calculate")
    public double calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam String op) {
        return switch (op) {
            
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num2 != 0 ? num1 / num2 : 0;
            case "+" -> num1 + num2;
            default -> 0;
        };
    }
}
