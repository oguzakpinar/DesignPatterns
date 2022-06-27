package singletonPattern.antipattern;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class UsingObjectOne {

    public static final ArrayList<Integer> cachedList = new ArrayList<>();

    public void generateNumber() {
        cachedList.add(new Random().nextInt());
    }

    public void readGeneratedNumbers() {
        cachedList.forEach(System.out::println);
    }
}
