package flyweightPattern.pattern;

import java.util.Date;

public class FlyweightMain {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        long milis = new Date().getTime();
        for(int i=0; i < 250; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
        milis = new Date().getTime() - milis;
        System.out.println("Total Time is " + milis);
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
