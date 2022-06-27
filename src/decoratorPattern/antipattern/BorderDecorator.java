package decoratorPattern.antipattern;

public class BorderDecorator extends ShapeDecorator{

    private String color;
    public BorderDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Border Color: " + color);
    }
}
