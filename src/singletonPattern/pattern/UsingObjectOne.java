package singletonPattern.pattern;

import java.util.ArrayList;
import java.util.Random;

public class UsingObjectOne {
    public void generateNumber() {
        CachedValue.getValue().getCachedList().add(new Random().nextInt());
    }

    public void readGeneratedNumbers() {
        CachedValue.getValue().getCachedList().forEach(System.out::println);
    }
}
