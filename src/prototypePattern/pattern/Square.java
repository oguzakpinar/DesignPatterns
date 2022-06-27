package prototypePattern.pattern;


public class Square extends Shape {
    private String name = "square";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCode() {
        return "S";
    }
}
