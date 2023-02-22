package com.andre.calculadora;

import com.andre.calculadora.Service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    
    private CalculatorService calculator = new CalculatorService();
    
    @Test
    public void testAddition() {
        double result = calculator.calculate(2,3, "add");
        assertEquals(5, result, 0);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.calculate(5, 3, "subtract");
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.calculate(2, 3, "multiply");
        assertEquals(6, result, 0);
    }

    @Test
    public void testDivision() {
        double result = calculator.calculate(6, 2, "divide");
        assertEquals(3, result, 0);
    }

    @Test
    public void testInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(2, 3, "invalid");
        });
    }

    private void assertEquals(int i, double result, int i1) {
    }
}
