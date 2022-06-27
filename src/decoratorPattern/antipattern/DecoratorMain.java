package decoratorPattern.antipattern;

public class DecoratorMain {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        BorderDecorator border = new BorderDecorator(circle, "Red");
        border.draw();


        Shape redRectangle = new Rectangle();
        System.out.println("\nRectangle of purple border");
        redRectangle.draw();
        border = new BorderDecorator(redRectangle, "Purple");
        border.draw();

        System.out.println("\nRectangle of red border fill blue");
        new FillDecorator(new BorderDecorator(new Rectangle(), "Blue"), "Green").draw();
    }
}
