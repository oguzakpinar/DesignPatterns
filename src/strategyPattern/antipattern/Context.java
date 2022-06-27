package strategyPattern.antipattern;


public class Context {
    public int executeStrategy(int num1, int num2, OperationEnum operation){
        switch (operation){
            case ADD:
                return num1 + num2;
            case MULTIPLY:
                return num1 * num2;
            case SUBTRACT:
                return num1 - num2;
        }
        return 0;
    }
}
