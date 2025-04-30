package academy.javacore.methods.test;

import academy.javacore.methods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 1;
        int number2 = 2;
        calculator.changeTwoNumbers(number1, number2);
        System.out.println("Dentro do CalculatorTest04");
        System.out.println("Número 1: " + number1);
        System.out.println("Número 2: " + number2);

    }
}
