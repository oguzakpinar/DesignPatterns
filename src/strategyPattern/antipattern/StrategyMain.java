package strategyPattern.antipattern;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5, OperationEnum.ADD));
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5, OperationEnum.SUBTRACT));
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5, OperationEnum.MULTIPLY));
    }
}
