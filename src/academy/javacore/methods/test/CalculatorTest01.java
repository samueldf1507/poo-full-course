package academy.javacore.methods.test;

import academy.javacore.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subTwoNumbers();
        System.out.println("Finalizando: CalculatorTest01 ");
    }
}
