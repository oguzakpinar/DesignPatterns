package observerPattern.antipattern;

import observerPattern.pattern.Subject;

import java.util.Observable;
import java.util.Observer;

public class OctalObserver {
    public void update(Integer arg) {
        System.out.println( "Octal String: " + Integer.toOctalString(arg));
    }
}
