package appFigure.model.classes;

import appFigure.model.interfaces.FigureOptions;

public class Circle implements FigureOptions {
    private float radius;
    private final float PI = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (radius * radius) * PI;
    }

    @Override
    public float getPerimetr() {
        return 2 * PI * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPI() {
        return PI;
    }
}
