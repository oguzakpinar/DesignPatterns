package decoratorPattern.antipattern;

public class FillDecorator extends ShapeDecorator{

    private String color;
    public FillDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        fillShape();
    }

    private void fillShape() {
        System.out.println("Fill Color: " + color);
    }
}
