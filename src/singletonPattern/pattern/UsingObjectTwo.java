package singletonPattern.pattern;

import java.util.Random;

public class UsingObjectTwo {

    public void generateNumber() {
        CachedValue.getValue().getCachedList().add(new Random().nextInt());
    }
}
