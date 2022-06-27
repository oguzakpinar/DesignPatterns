package factoryMethodPattern.pattern;

public class ShapeFactory {
    public Shape getShape(ShapeEnum type) {
        switch (type) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
        }
        return null;
    }
}
