package observerPattern.antipattern;

import java.util.Observable;

public class Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
