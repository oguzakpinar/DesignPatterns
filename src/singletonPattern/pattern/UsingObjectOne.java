package singletonPattern.pattern;

import java.util.ArrayList;
import java.util.Random;

public class UsingObjectOne implements Runnable{
    public void generateNumber() {
        Integer i = new Random().nextInt(1000);
        while (i < 100)
            i = i + 100;
        CachedValue.getValue().addCache(i);
    }

    @Override
    public void run() {
        generateNumber();
        try {
            Thread.sleep(1000);
            generateNumber();
            Thread.sleep(2000);
            generateNumber();
            Thread.sleep(1000);
            System.out.println("***********************Object One****************");
            CachedValue.getValue().readGeneratedNumbers();
            System.out.println("***********************Object One****************");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
