package bridgePattern.antipattern;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, DrawArea.NOTEBOOK);
        Shape greenCircle = new Circle(100,100, 10, DrawArea.WALL);
        redCircle.draw();
        greenCircle.draw();
    }
}
