public abstract class Dish {
    private int number;
    private String name;
    private double price;

    Dish() {
    }

    Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String display() {
        return "[" + this.number + "] " + this.name + " (" + this.price + "€)";
    }

}
