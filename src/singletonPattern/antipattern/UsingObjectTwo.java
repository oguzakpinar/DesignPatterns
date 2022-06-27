package singletonPattern.antipattern;

import java.util.Random;

public class UsingObjectTwo {

    public void generateNumber() {
        UsingObjectOne.cachedList.add(new Random().nextInt());
    }
}
