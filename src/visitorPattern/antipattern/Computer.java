package visitorPattern.antipattern;

import visitorPattern.pattern.ComputerPartVisitor;

public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    public ComputerPart[] getParts() {
        return parts;
    }
}
