package iteratorPattern.antipattern;

public class IteratorMain {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(String name : namesRepository.getNames()){
            System.out.println("Name : " + name);
        }
    }
}
