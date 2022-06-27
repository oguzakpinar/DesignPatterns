package prototypePattern.antipattern;

public class Square extends Shape{

    public Square() {
        setName("square");
    }

    @Override
    protected ShapeEnum getType() {
        return ShapeEnum.SQUARE;
    }
}
