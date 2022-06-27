package prototypePattern.antipattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    public static Map<ShapeEnum, Shape> cache = new HashMap<>();

    public static Shape getShape(ShapeEnum type) {
        if(cache.isEmpty()) {
            loadCache();
        }
        return cache.get(type).clone();
    }

    public static void loadCache() {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        cache.put(c.getType(), c);
        cache.put(r.getType(), r);
        cache.put(s.getType(), s);
    }
}
