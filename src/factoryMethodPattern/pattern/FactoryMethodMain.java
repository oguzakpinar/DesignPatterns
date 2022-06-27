package factoryMethodPattern.pattern;

public class FactoryMethodMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        drawShape(factory.getShape("C"));
        drawShape(factory.getShape("R"));
        drawShape(factory.getShape("S"));
    }

    private static void drawShape(Shape s){
        s.draw();
    }
}
