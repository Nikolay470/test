package appFigure.model.classes;

import appFigure.model.interfaces.FigureOptions;

public class Triangle implements FigureOptions {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float a, float b, float c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public float getPerimetr() {
        return sideA + sideB + sideC;
    }
    @Override
    public float getArea() {
        float p = getPerimetr() / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
