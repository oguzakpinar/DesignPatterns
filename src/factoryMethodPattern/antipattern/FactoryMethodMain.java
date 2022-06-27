package factoryMethodPattern.antipattern;

public class FactoryMethodMain {

    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Rectangle r = new Rectangle();

        c.drawCircle();
        r.drawRectangle();
        s.drawSquare();
    }
}
