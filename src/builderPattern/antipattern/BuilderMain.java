package builderPattern.antipattern;

public class BuilderMain {
    public static void main(String[] args) {

        Menu menu = new Menu();
        System.out.println("\n\nChampions Meal");
        Meal ch = menu.getChampionMenu();
        ch.showItems();
        System.out.println("Total Cost: " + ch.getTotalPrice());

        System.out.println("\n\nEko Meal");
        Meal eko = menu.getEkoMenu();
        eko.showItems();
        System.out.println("Total Cost: " + eko.getTotalPrice());
    }
}
