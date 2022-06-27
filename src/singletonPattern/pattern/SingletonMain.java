package singletonPattern.pattern;

public class SingletonMain {

    public static void main(String[] args) {
        UsingObjectOne one = new UsingObjectOne();
        UsingObjectTwo two = new UsingObjectTwo();

        one.generateNumber();
        one.generateNumber();
        two.generateNumber();
        one.readGeneratedNumbers();
    }
}
