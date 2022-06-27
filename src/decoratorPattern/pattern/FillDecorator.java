package decoratorPattern.pattern;

public abstract class FillDecorator implements Shape{
    protected Shape decoratedShape;

    public FillDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
