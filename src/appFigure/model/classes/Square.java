package appFigure.model.classes;

public class Square extends Rectangle {
    public Square(float weight, float height) {
        super(weight, height);
    }

    @Override
    public float getArea() {
        return this.getHeight() * this.getHeight();
    }

    @Override
    public float getPerimetr() {
        return this.getHeight() * 4;
    }
}
