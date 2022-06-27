package facadePattern.antipattern;

public class FacadeMain {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();
        circle.border("Red");
        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fill("Green");
        rectangle.border("Blue");
        System.out.println();

        Square square = new Square();
        square.draw();
    }
}
