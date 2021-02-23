package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double operator(double num1, double num2, String operator) {
        double result = 0;
        switch (operator){
            case "Add(+)":
                result = num1 + num2;
                break;
            case "Minus(-)":
                result = num1 - num2;
                break;
            case "Multi(*)":
                result = num1 * num2;
                break;
            case "Div(/)":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
