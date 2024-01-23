package patterns.decorator;

public class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.shape.draw();
        System.out.println("Теперь граница зеленая");
    }
}
