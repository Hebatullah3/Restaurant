import java.util.ArrayList;
import java.util.Random;

public class Order {

    private int number;
    private ArrayList<Dish> items;
    private Bill orderBill;

    Order() {
        this.number = new Random().nextInt(100000);
        items = new ArrayList<>();
        orderBill = new Bill();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Dish> getItems() {
        return items;
    }

    public void setItems(ArrayList<Dish> items) {
        this.items = items;
    }

    public Bill getOrderBill() {
        return orderBill;
    }

    public void addItem(Dish dish) {
        System.out.println(dish.display());
        items.add(dish);
        orderBill.increment(dish.getPrice());
    }

    public void printOrderBill() {
        System.out.println("\n\n\n-----------------[Bill #" + number + "]-----------------");
        for (Dish dish : items) {
            System.out.println(dish.display());
        }
        System.out.println("---------------------------------------------");
        System.out.println("Amount: " + orderBill.getAmount() + "€");
        System.out.println("Taxes (12.5 %): " + (orderBill.getTotal() - orderBill.getAmount()) + "€");
        System.out.println("Total: " + orderBill.getTotal() + "€");
        System.out.println("---------------------------------------------");
        System.out.println("Thank You!");
    }

}
