package mementoPattern.antipattern;

import mementoPattern.pattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private String state;

    private List<String> historyState = new ArrayList<>();

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void saveState(){
        historyState.add(state);
    }

    public void getState(int index){
        state = historyState.get(index);
    }
}
