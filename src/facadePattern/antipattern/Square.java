package facadePattern.antipattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Square");
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
