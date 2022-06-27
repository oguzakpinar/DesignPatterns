package bridgePattern.antipattern;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new DrawOnNotebookCircle());
        Shape greenCircle = new Circle(100,100, 10, new DrawOnWallCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
