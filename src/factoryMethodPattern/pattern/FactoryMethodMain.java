package factoryMethodPattern.pattern;

public class FactoryMethodMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        for (ShapeEnum value : ShapeEnum.values()) {
            drawShape(factory.getShape(value));
        }
    }

    private static void drawShape(Shape s){
        s.draw();
    }
}
