package decoratorPattern.antipattern;

public interface Shape {
    void draw();

    void border(String color);

    void fill(String color);
}
