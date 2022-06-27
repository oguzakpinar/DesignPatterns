package observerPattern.pattern;

import observerPattern.ObserverMain;

import java.util.Observable;
import java.util.Observer;

public class BinaryObserver implements Observer {
    public BinaryObserver(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Binary String: " + Integer.toBinaryString( (Integer) arg ) );
    }
}
