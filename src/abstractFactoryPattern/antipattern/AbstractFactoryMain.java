package abstractFactoryPattern.antipattern;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        for (EdgeEnum value : EdgeEnum.values()) {
            for (ShapeEnum shape : ShapeEnum.values()) {
                AbstractFactory f = FactoryProducer.getFactory(value);
                if(f != null) {
                    Shape s = f.getShape(shape);
                    if(s != null) {
                        s.draw();
                    }
                }
            }
        }
    }
}
