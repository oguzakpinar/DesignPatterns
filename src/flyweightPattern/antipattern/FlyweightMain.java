package flyweightPattern.antipattern;

import java.util.Date;

public class FlyweightMain {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        int count = 0;
        long milis = new Date().getTime();
        for(int i=0; i < 250; ++i) {
            Circle circle = new Circle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
            count++;
        }
        milis = new Date().getTime() - milis;
        System.out.println("Total Time is " + milis);
        System.out.println("CreatedCount = " + count);
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
