package academy.javacore.methods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public double divideTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            return 0;
        }
        return number1 / number2;
    }

    public void divisionBetweenNumbers(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(number1 / number2);

    }
}
