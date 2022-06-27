package prototypePattern.antipattern;

public abstract class Shape implements Cloneable{

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract ShapeEnum getType();

    public void draw() {
        System.out.println("This is " + getName());
    }

    @Override
    public Shape clone() {
        Shape clone = null;

        try {
            clone = (Shape) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
