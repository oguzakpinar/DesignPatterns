package bridgePattern.antipattern;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawArea) {
        super(drawArea);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
