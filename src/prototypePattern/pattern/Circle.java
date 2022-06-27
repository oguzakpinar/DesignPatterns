package prototypePattern.pattern;


public class Circle extends Shape {
    private String name = "circle";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCode() {
        return "C";
    }
}
