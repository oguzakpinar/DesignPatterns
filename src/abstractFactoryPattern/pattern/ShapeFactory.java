package abstractFactoryPattern.pattern;

public class ShapeFactory extends AbstractShapeFactory {
    public Shape getShape(String type) {
        switch (type) {
            case "S":
                return new Square();
            case "R":
                return new Rectangle();
        }
        return null;
    }
}
