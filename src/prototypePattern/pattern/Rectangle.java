package prototypePattern.pattern;


public class Rectangle extends Shape {
    private String name = "rectangle";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCode() {
        return "R";
    }
}
