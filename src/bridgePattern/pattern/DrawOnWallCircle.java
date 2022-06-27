package bridgePattern.pattern;

public class DrawOnWallCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle on Wall[radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
