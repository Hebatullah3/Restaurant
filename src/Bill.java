public class Bill {

    private final double tax = 12.5;
    private double amount;


    Bill() {
        amount = 0.0;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotal() {
        return amount + (amount * (tax / 100));
    }

    public void increment(double price) {
        amount += price;
    }


}
