package abstractFactoryPattern.pattern;

public abstract class AbstractShapeFactory {
    abstract Shape getShape(String type);
}
