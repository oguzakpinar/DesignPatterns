package bridgePattern.pattern;

public class DrawOnNotebookCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle on Notebook[ radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
