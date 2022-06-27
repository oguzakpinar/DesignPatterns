package abstractFactoryPattern.pattern;

public class Square implements Shape {
    private String name = "square";
    @Override
    public String getName() {
        return name;
    }
}
