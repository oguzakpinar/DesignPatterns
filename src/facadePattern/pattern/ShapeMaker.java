package facadePattern.pattern;

public class ShapeMaker {

    public void drawRedBorderedCircle(){
        Circle circle = new Circle();
        circle.draw();
        circle.border("Red");
    }
    public void drawGreenFilledBlueBorderedRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fill("Green");
        rectangle.border("Blue");
    }
    public void drawSquare(){
        Square square = new Square();
        square.draw();
    }
}
