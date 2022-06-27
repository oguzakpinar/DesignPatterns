package abstractFactoryPattern.pattern;

public class FactoryMethodMain {

    public static void main(String[] args) {
        drawShape(FactoryProducer.getFactory(false).getShape("R"));
        drawShape(FactoryProducer.getFactory(false).getShape("S"));
        drawShape(FactoryProducer.getFactory(true).getShape("R"));
        drawShape(FactoryProducer.getFactory(true).getShape("S"));
    }

    private static void drawShape(Shape s){
        s.draw();
    }
}
