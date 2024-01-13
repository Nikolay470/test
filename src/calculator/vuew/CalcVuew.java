package calculator.vuew;
import java.util.Scanner;
public class CalcVuew {
    private Scanner input = new Scanner(System.in);

    public String getOperator() {
        System.out.println("Введите действие ");
        return input.nextLine();
    }

    public Float[] getValues() {
        Float[] result = new Float[2];
        System.out.println("Введите первое число");
        result[0] = input.nextFloat();
        System.out.println("Введите второе число");
        result[1] = input.nextFloat();
        return result;
    }

    public void printResult(Float res) {
        System.out.printf("Результат: %.1f\n", res);
    }
}
