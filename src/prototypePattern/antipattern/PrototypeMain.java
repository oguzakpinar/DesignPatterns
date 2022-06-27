package prototypePattern.antipattern;

public class PrototypeMain {

    public static void main(String[] args) {
        for (ShapeEnum value : ShapeEnum.values()) {
            Shape s = ShapeCache.getShape(value);
            s.draw();
            s.setName(s.getName() + "1");
        }

        for (ShapeEnum value : ShapeEnum.values()) {
            Shape s = ShapeCache.getShape(value);
            s.draw();
        }
    }
}
