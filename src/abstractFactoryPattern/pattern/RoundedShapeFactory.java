package abstractFactoryPattern.pattern;

public class RoundedShapeFactory extends AbstractShapeFactory{
    public ShapeRounded getShape(String type) {
        switch (type) {
            case "S":
                return new SquareRounded();
            case "R":
                return new RectangleRounded();
        }
        return null;
    }
}
