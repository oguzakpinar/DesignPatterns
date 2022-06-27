package facadePattern.pattern;

public class DecoratorMain {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        circle.border("Red");


        Shape redRectangle = new Rectangle();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        redRectangle.border("Red");

        System.out.println("\nRectangle of red border fill blue");
        redRectangle.draw();
        redRectangle.border("Red");
        redRectangle.fill("Blue");
    }
}
