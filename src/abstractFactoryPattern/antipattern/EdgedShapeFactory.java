package abstractFactoryPattern.antipattern;

public class EdgedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeEnum shape) {
        switch (shape) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
        }
        return null;
    }
}
