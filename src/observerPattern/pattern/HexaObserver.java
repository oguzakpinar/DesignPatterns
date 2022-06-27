package observerPattern.pattern;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer {
    public HexaObserver(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Hex String: " + Integer.toHexString( (Integer) arg ).toUpperCase() );
    }
}
