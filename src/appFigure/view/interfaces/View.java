package appFigure.view.interfaces;

import appFigure.model.interfaces.FigureOptions;

import java.util.HashMap;

public interface View {
    int getTypeFigure();
    HashMap<String, Float> getParametres(int choice);
    int choiceOperation();
    void printResult(FigureOptions figure, int operation);
}
