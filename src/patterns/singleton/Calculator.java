package patterns.singleton;

public class Calculator {
    private static Calculator calculator;
    private double result;

    private Calculator() {

    }

    public static Calculator getCalculator() {
        if (calculator == null) {
            calculator = new Calculator();
            return calculator;
        } return calculator;
    }

    public void multiplication() {
        System.out.println("Выполнено умножение");
    }

    public void sum() {
        System.out.println("Выполнено сложение");
    }

    public void defference() {
        System.out.println("Выполнено вычитание");
    }

    public void division() {
        System.out.println("Выполнено деление");
    }
}
