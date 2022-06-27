package statePattern.antipattern;

public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(StateEnum.START);
        context.doAction();

        System.out.println(context.getState().toString());

        context.setState(StateEnum.STOP);
        context.doAction();

        System.out.println(context.getState().toString());
    }
}
