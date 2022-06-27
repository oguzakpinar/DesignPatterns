package prototypePattern.pattern;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        drawShape(ShapeCache.getShape("R"));
        drawShape(ShapeCache.getShape("S"));
        drawShape(ShapeCache.getShape("C"));
    }

    private static void drawShape(Shape s){
        s.draw();
    }
}
