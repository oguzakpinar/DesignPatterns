package decoratorPattern.pattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();


        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        Shape blueFill = new BlueFillDecorator((redRectangle));
        System.out.println("\nRectangle of red border fill blue");
        blueFill.draw();
    }
}
