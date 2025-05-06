package academy.javacore.methods.test;

import academy.javacore.methods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] v = {1, 2, 3, 4, 5};
        calculator.sumArray(v);
        calculator.sumArrayArgs(v);
    }
}
