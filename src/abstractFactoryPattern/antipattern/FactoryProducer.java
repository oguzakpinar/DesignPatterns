package abstractFactoryPattern.antipattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(EdgeEnum edge) {
        switch (edge){
            case EDGED:
                return new EdgedShapeFactory();
            case ROUNDED:
                return new RoundedShapeFactory();
        }
        return null;
    }
}
