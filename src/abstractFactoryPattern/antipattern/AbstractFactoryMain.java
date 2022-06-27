package abstractFactoryPattern.antipattern;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();

        SquareRounded sr = new SquareRounded();
        RectangleRounded rr = new RectangleRounded();

        r.drawRectangle();
        s.drawSquare();

        sr.drawSquare();
        rr.drawRectangle();
    }
}
