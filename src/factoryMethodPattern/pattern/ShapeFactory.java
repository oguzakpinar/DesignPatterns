package factoryMethodPattern.pattern;

public class ShapeFactory {
    public Shape getShape(String type) {
        switch (type) {
            case "S":
                return new Square();
            case "R":
                return new Rectangle();
            case "C":
                return new Circle();
        }
        return null;
    }
}
