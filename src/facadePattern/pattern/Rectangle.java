package facadePattern.pattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public void border(String color) {
        System.out.println("Border Color: " + color);
    }

    @Override
    public void fill(String color) {
        System.out.println("Fill Color: " + color);
    }
}
