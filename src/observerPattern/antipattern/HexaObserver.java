package observerPattern.antipattern;

import observerPattern.pattern.Subject;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver {
    public void update(Integer arg) {
        System.out.println( "Hex String: " + Integer.toHexString(arg).toUpperCase() );
    }
}
