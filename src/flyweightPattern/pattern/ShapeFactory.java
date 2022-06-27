package flyweightPattern.pattern;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    private static int count = 0;

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            count++;
            System.out.println("Creating circle of color : " + color);
            System.out.println("CreatedCount = " + count);
        }
        return circle;
    }
}
