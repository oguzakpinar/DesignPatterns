package commandPattern.antipattern;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        quantity = quantity + 1;
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        if(quantity <= 0)
            throw new RuntimeException("There is no item to sell");
        quantity = quantity - 1;
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
