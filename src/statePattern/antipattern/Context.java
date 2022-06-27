package statePattern.antipattern;

import statePattern.pattern.State;

public class Context {
    private StateEnum state;

    public Context(){
        state = null;
    }

    public void setState(StateEnum state){
        this.state = state;
    }

    public StateEnum getState(){
        return state;
    }

    public void doAction() {
        switch (state) {
            case STOP:
                System.out.println("Player is in stop state");
                break;
            case START:
                System.out.println("Player is in start state");
                break;
        }
    }
}
