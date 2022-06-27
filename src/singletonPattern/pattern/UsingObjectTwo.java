package singletonPattern.pattern;

import java.util.Random;

public class UsingObjectTwo implements Runnable{

    public void generateNumber() {
        Integer i = new Random().nextInt(100);
        while (i < 0) {
            i = i + 100;
        }
        CachedValue.getValue().addCache(i);
    }

    @Override
    public void run() {
        generateNumber();
        try {
            Thread.sleep(100);
            generateNumber();
            Thread.sleep(2000);
            generateNumber();
            Thread.sleep(100);
            generateNumber();
            Thread.sleep(2000);
            System.out.println("***********************Object Two****************");
            CachedValue.getValue().readGeneratedNumbers();
            System.out.println("***********************Object Two****************");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
