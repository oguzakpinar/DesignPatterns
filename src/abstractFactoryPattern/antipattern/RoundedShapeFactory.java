package abstractFactoryPattern.antipattern;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    ShapeRounded getShape(ShapeEnum shape) {
        switch (shape) {
            case SQUARE:
                return new SquareRounded();
            case RECTANGLE:
                return new RectangleRounded();
            case TRIANGLE:
                return new TriangleRounded();
        }
        return null;
    }
}
