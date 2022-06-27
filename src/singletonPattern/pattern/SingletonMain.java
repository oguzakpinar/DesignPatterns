package singletonPattern.pattern;

public class SingletonMain {

    public static void main(String[] args) {
        Thread t = new Thread(new UsingObjectOne());
        Thread t2 = new Thread(new UsingObjectTwo());
        t.start();
        t2.start();
        CachedValue.getValue().readGeneratedNumbers();
    }
}
