package prototypePattern.antipattern;

public class PrototypeMain {

    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Rectangle r = new Rectangle();

        c.drawCircle();
        r.drawRectangle();
        s.drawSquare();
    }
}
