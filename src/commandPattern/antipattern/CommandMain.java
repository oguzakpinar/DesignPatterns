package commandPattern.antipattern;

public class CommandMain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock();
        SellStock sellStockOrder = new SellStock();

        buyStockOrder.buy(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        buyStockOrder.buy(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
        sellStockOrder.sell(abcStock);
    }
}
