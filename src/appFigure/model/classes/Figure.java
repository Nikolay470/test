package appFigure.model.classes;

import appFigure.model.interfaces.FigureOptions;

public abstract class Figure {
    private float weight;
    private float height;

    public Figure(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }


    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
