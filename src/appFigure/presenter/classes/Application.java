package appFigure.presenter.classes;
import appFigure.model.classes.Model;
import appFigure.model.interfaces.FigureOptions;
import appFigure.presenter.interfaces.App;
import appFigure.view.classes.Check;
import appFigure.view.classes.ConsoleView;
import appFigure.view.classes.IncorrectValueException;

import java.util.HashMap;

public class Application implements App{
    private Model model = new Model();
    private ConsoleView console = new ConsoleView();
    private int command;
    private HashMap<String, Float> params;

    @Override
    public void start() throws IncorrectValueException {
        boolean iteration = true;
        while (iteration) {
            command = console.getTypeFigure();
            if (Check.checkType(command)) {
                params = console.getParametres(command);
                if (Check.checkParams(params)) {
                    if (command == 1 || command == 3) {
                        if (command == 1) {
                            model.createSquare(params.get("weight"), params.get("height"));
                        }
                        model.createRectangle(params.get("weight"), params.get("height"));
                    } else if (command == 2) {
                        model.createTriangle(
                                params.get("sideA"),
                                params.get("sideB"),
                                params.get("sideC")
                        );
                    } else if (command == 4) {
                        model.createCircle(params.get("radius"));
                    }
                    command = console.choiceOperation();
                    if (Check.checkOperation(command)) {
                        console.printResult(model.getFigure(), command);
                    }
                }
            } else {
                throw new IncorrectValueException(
                        "Передана"
                );
            }
        }
    }
}

















