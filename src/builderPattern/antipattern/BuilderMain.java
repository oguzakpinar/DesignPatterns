package builderPattern.antipattern;

public class BuilderMain {
    public static void main(String[] args) {

        Meal vegMeal = new Meal(new VegBurger(), new Coke());
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = new Meal(new ChickenBurger(), new Pepsi());
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
