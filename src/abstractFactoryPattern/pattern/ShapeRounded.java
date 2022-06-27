package abstractFactoryPattern.pattern;

public interface ShapeRounded extends Shape{
    default void draw() {
        System.out.println("This is rounded " + getName());
    }
}
