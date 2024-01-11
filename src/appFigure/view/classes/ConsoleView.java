package appFigure.view.classes;

import appFigure.model.interfaces.FigureOptions;
import appFigure.view.interfaces.View;

import java.util.HashMap;
import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner input = new Scanner(System.in);
    private HashMap<String, Float> result = new HashMap<>();

    @Override
    public int getTypeFigure() {
        System.out.println(
                "Выберите фигуру:\n"
                + "1. Квадрат\n2. Тругольник\n"
                + "3. Прямоугольник.\n4. Круг\n"
        );
        int choice = input.nextInt();
        input.close();
        return choice;
    }

    @Override
    public HashMap<String, Float> getParametres(int choice) {
        if (choice == 1 || choice == 3) {
            System.out.println("Введите ширину");
            float weight = input.nextFloat();
            System.out.println("Введите высоту");
            float height = input.nextFloat();

            result.put("height", height);
            result.put("weight", weight);
            input.close();
            return result;
        } else if (choice == 2) {
            System.out.println("Введите длинну стороны а");
            float sideA = input.nextFloat();
            System.out.println("Введите длинну стороны b");
            float sideB = input.nextFloat();
            System.out.println("Введите длинну стороны c");
            float sideC = input.nextFloat();

            result.put("sideA", sideA);
            result.put("sideB", sideB);
            result.put("sideC", sideC);
            input.close();
            return result;
        } else {
            System.out.println("Введите радиус");
            float radius = input.nextFloat();
            input.close();
            result.put("radius", radius);
            return result;
        }
    }

    @Override
    public int choiceOperation() {
        System.out.println(
                "Введите действие"
                + "1. Вычислить площадь\n"
                + "2. Вычислить периметр\n"
        );
        int choice = input.nextInt();
        input.close();
        return choice;
    }

    @Override
    public void printResult(FigureOptions figure, int operation) {
        if (operation == 1) {
            System.out.printf(
                    "Площадь фигуры равна %.2f см2\n",
                    figure.getArea()
            );
        } else if (operation == 2){
            System.out.printf(
                    "Периметр фигуры равен %.2f см\n",
                    figure.getPerimetr()
            );
        }
    }
}













