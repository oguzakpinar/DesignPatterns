package factoryMethodPattern.pattern;

public interface Shape {
    String getName();
    default void draw() {
        System.out.println("This is " + getName());
    }
}
