package abstractFactoryPattern.antipattern;

public abstract class AbstractFactory {
    abstract Shape getShape(ShapeEnum shape);
}
