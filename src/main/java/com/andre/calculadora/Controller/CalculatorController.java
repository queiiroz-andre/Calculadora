package com.andre.calculadora.Controller;
import com.andre.calculadora.Service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("number1") double number1,
                            @RequestParam("number2") double number2,
                            @RequestParam("operation") String operation,
                            Model model) {
        double result = calculatorService.calculate(number1, number2, operation);
        model.addAttribute("result", result);
        return "index";
    }



}
