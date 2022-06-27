package facadePattern.antipattern;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeCreator creator = new ShapeCreator();
        creator.getRedBorderedCircle();
        creator.getGreenFilledBlueBorderedRectangle();
    }
}
