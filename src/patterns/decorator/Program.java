package patterns.decorator;

public class Program {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        circle.draw();
        triangle.draw();
        System.out.println("------------");

        Shape circleGreen = new GreenShapeDecorator(new Circle());
        Shape triangleGreen = new GreenShapeDecorator(new Triangle());

        circleGreen.draw();
        triangleGreen.draw();
    }
}
