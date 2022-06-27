package facadePattern.pattern;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawGreenFilledBlueBorderedRectangle();
        System.out.println();
        shapeMaker.drawRedBorderedCircle();
        System.out.println();
        shapeMaker.drawSquare();
    }
}
