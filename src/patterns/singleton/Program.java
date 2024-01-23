package patterns.singleton;

import java.util.concurrent.Callable;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getCalculator();
        calculator.multiplication();
        calculator.defference();
        calculator.sum();
        calculator.division();

        Calculator calculator2 = Calculator.getCalculator();

        if (calculator.equals(calculator2)) {
            System.out.println("calculator == calculator2");
        }
    }
}
