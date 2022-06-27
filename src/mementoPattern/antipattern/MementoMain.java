package mementoPattern.antipattern;

public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("State #1");
        originator.setState("State #2");
        originator.saveState();

        originator.setState("State #3");
        originator.saveState();

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getState(0);
        System.out.println("First saved State: " + originator.getState());
        originator.getState(1);
        System.out.println("Second saved State: " + originator.getState());
    }
}
