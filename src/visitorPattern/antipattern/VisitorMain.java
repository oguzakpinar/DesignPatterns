package visitorPattern.antipattern;

public class VisitorMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartDisplay display = new ComputerPartDisplay();
        display.visit(computer);
        for (ComputerPart part : computer.getParts()) {
            if(part instanceof Mouse)
                display.visit((Mouse) part);
            if(part instanceof Monitor)
                display.visit((Monitor) part);
            if(part instanceof Keyboard)
                display.visit((Keyboard) part);
        }
    }
}
