package abstractFactoryPattern.pattern;

public class RectangleRounded implements ShapeRounded {
    private String name = "rectangle";
    @Override
    public String getName() {
        return name;
    }
}
