package builderPattern.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();
    private int discount = 0;
    private float totalPrice;

    public float getTotalPrice() {
        return totalPrice;
    }

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public Meal build() {
        if(items.isEmpty()) {
            throw new RuntimeException("Please add item to menu");
        }
        totalPrice = getCost();
        return this;
    }

    public Meal setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    private float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost - (cost * ((float) discount / 100F));
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
