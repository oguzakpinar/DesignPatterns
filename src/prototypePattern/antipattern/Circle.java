package prototypePattern.antipattern;

public class Circle extends Shape{
    public Circle() {
        setName("circle");
    }

    @Override
    protected ShapeEnum getType() {
        return ShapeEnum.CIRCLE;
    }
}
