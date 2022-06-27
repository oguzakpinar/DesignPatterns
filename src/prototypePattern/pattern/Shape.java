package prototypePattern.pattern;

public abstract class Shape implements Cloneable{
    abstract String getName();
    abstract String getCode();

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
