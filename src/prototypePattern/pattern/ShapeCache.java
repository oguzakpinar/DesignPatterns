package prototypePattern.pattern;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeCode) {
        Shape cachedShape = shapeMap.get(shapeCode);
        return cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put(circle.getCode(),circle);

        Square square = new Square();
        shapeMap.put(square.getCode(),square);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getCode(), rectangle);
    }
}
