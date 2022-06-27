package observerPattern.antipattern;

import observerPattern.pattern.Subject;

import java.util.Observable;
import java.util.Observer;

public class BinaryObserver {
    public void update(Integer arg) {
        System.out.println( "Binary String: " + Integer.toBinaryString(arg) );
    }
}
