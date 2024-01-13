package appFigure.model.classes;

import appFigure.model.interfaces.FigureOptions;

public class Model {
    public Circle circle = null;
    public Rectangle rectangle = null;
    public Square square = null;
    public Triangle triangle = null;

    public void createCircle(float radius) {
        circle = new Circle(radius);
    }
    public void createRectangle(float weight, float height) {
        rectangle = new Rectangle(weight, height);
    }
    public void createSquare(float weight, float height) {
        square = new Square(weight, height);
    }
    public void createTriangle(float a, float b, float c) {
        triangle = new Triangle(a, b, c);
    }

    public FigureOptions getFigure() {
        if (circle != null) {
            return circle;
        } else if (rectangle != null) {
            return rectangle;
        } else if (square != null) {
            return square;
        } else {
            return triangle;
        }
    }

    public void resetStatus() {
        circle = null;
        rectangle = null;
        square = null;
        triangle = null;
    }
}


















