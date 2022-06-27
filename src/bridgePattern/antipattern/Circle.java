package bridgePattern.antipattern;

public class Circle extends Shape {
    private int x, y, radius;
    private DrawArea drawArea;

    public Circle(int x, int y, int radius, DrawArea drawArea) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawArea = drawArea;
    }

    public void draw() {
        switch (drawArea) {
            case WALL:
                drawOnWall();
                break;
            case NOTEBOOK:
                drawOnNotebook();
                break;
        }
    }

    private void drawOnNotebook() {
        System.out.println("Drawing Circle on Notebook[ radius: " + radius + ", x: " + x + ", " + y + "]");
    }

    private void drawOnWall() {
        System.out.println("Drawing Circle on Wall[radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
