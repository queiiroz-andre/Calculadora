package com.andre.calculadora.Service;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculate(double number1, double number2, String operation) {
        switch (operation) {
            case "add":
                return number1 + number2;
            case "subtract":
                return number1 - number2;
            case "multiply":
                return number1 * number2;
            case "divide":
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}

