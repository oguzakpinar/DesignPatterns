package abstractFactoryPattern.pattern;

public class SquareRounded implements ShapeRounded {
    private String name = "square";
    @Override
    public String getName() {
        return name;
    }
}
