package visitorPattern.pattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
