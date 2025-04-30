package academy.javacore.methods.test;

import academy.javacore.methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(100, 0);
        System.out.println(result);
        calculator.divisionBetweenNumbers(40, 0);

    }
}
