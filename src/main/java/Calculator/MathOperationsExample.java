package Calculator;

public class MathOperationsExample implements Calculator {
    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println("Sum :"+mathOperationsExample.sum(3,4));

        Calculator calculator = (num1, num2)-> num1 % num2;

        System.out.println("Calculator use override lambda "+calculator.sum(3,2));
        System.out.println("Subtract " + calculator.subtract(9,2));

    }



    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int divide(int num1, int num2) {
        return 0;
    }
}
