package appFigure.model.classes;

import appFigure.model.interfaces.FigureOptions;

public class Rectangle extends Figure implements FigureOptions{
    public Rectangle(float weight, float height) {
        super(weight, height);
    }

    @Override
    public float getArea() {
        return this.getWeight() * this.getHeight();
    }

    @Override
    public float getPerimetr() {
        return (this.getWeight() + this.getHeight()) * 2;
    }
}
