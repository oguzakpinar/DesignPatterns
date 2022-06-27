package observerPattern.antipattern;

import observerPattern.pattern.Subject;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver ho = new HexaObserver();
        OctalObserver oo = new OctalObserver();
        BinaryObserver bo = new BinaryObserver();

        System.out.println("First state change: 15");
        subject.setState(15);
        ho.update(subject.getState());
        oo.update(subject.getState());
        bo.update(subject.getState());
        System.out.println("Second state change: 10");
        subject.setState(10);
        ho.update(subject.getState());
        oo.update(subject.getState());
        bo.update(subject.getState());
    }
}
