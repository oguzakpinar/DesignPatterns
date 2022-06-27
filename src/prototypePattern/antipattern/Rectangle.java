package prototypePattern.antipattern;

public class Rectangle extends Shape {
    public Rectangle() {
        setName("rectangle");
    }

    @Override
    protected ShapeEnum getType() {
        return ShapeEnum.RECTANGLE;
    }
}
