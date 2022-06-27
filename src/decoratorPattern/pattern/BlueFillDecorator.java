package decoratorPattern.pattern;

public class BlueFillDecorator extends FillDecorator{

    public BlueFillDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueFill(decoratedShape);
    }

    private void setBlueFill(Shape decoratedShape){
        System.out.println("Fill Color: Blue");
    }
}
