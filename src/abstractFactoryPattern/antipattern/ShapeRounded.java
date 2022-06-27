package abstractFactoryPattern.antipattern;

public interface ShapeRounded extends Shape{
    @Override
    default void draw() {
        System.out.println("This is rounded " + getName());
    }
}
