package observerPattern.pattern;

import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {
    public OctalObserver(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Octal String: " + Integer.toOctalString((Integer)arg));
    }
}
