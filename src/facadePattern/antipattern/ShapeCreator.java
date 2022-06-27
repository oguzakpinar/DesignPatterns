package facadePattern.antipattern;

public class ShapeCreator {
    public Shape getRedBorderedCircle() {
        Circle circle = new Circle();
        circle.draw();
        circle.border("Red");
        System.out.println();
        return circle;
    }

    public Shape getGreenFilledBlueBorderedRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fill("Green");
        rectangle.border("Blue");
        System.out.println();
        return rectangle;
    }
}
