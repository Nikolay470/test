package calculator.controller;

import calculator.model.CalcModel;
import calculator.vuew.CalcVuew;

public class Controller {
    private CalcModel model = new CalcModel();
    private CalcVuew vuew = new CalcVuew();

    public void start() {
        String operation = vuew.getOperator();
        Float[] values = vuew.getValues();
        Float result = null;

        if (operation.equals("+")) {
            result = model.Sum(values[0], values[1]);
        } else if (operation.equals("-")) {
            result = model.Difference(values[0], values[1]);
        } else if (operation.equals("*")) {
            result = model.Solution(values[0], values[1]);
        } else if (operation.equals("/")) {
            result = model.Share(values[0], values[1]);
        }

        vuew.printResult(result);
    }
}


















