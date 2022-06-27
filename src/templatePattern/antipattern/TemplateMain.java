package templatePattern.antipattern;

public class TemplateMain {
    public static void main(String[] args) {
        Cricket game = new Cricket();
        game.playCricket();
        System.out.println();
        Football football = new Football();
        football.playFootball();
    }
}
