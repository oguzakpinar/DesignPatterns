package builderPattern.antipattern;

public class Menu {

    public Meal getChampionMenu() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        meal.setDiscount(15);
        meal.build();
        return meal;
    }

    public Meal getEkoMenu() {
        return new Meal().addItem(new VegBurger()).addItem(new Coke()).setDiscount(10).build();
    }

}
