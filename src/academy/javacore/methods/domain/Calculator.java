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

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 999;
        number2 = 33;

        System.out.println("Dentro do método: changeTwoNumbers");
        System.out.println("Número 1: " + number1);
        System.out.println("Número 2: " + number2);

    }

    public void sumArray(int[] vector) {
        int sum = 0;
        for (int num: vector) {

            sum += num;
        }
        System.out.println(sum);
    }

    public void sumArrayArgs(int... vector) {
        int sum = 0;
        for (int num: vector) {

            sum += num;
        }
        System.out.println(sum);
    }
}
