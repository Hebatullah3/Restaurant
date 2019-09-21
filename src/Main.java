import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create Restaurant
        Restaurant MyRestaurant = new Restaurant("My Restaurant");

        // create Menu
        Menu RestaurantMenu = new Menu();
        MyRestaurant.setMenu(RestaurantMenu);

        // Create Starters
        RestaurantMenu.addDish(new Starter("Tomato Soup", 4));
        RestaurantMenu.addDish(new Starter("Green Salad", 5.5));
        RestaurantMenu.addDish(new Starter("Fried Mozzarella Sticks", 2.5));
        RestaurantMenu.addDish(new Starter("Mixed Salad", 3));
        RestaurantMenu.addDish(new Starter("Mushroom Soup", 2));

        // Create MainCourses
        RestaurantMenu.addDish(new MainCourse("Grilled Chicken with rice", 9.5));
        RestaurantMenu.addDish(new MainCourse("Steak  with saute", 11));
        RestaurantMenu.addDish(new MainCourse("Lasagna", 5.5));
        RestaurantMenu.addDish(new MainCourse("Sushi ", 7));
        RestaurantMenu.addDish(new MainCourse("Salmon with broccoli", 12));


        // Create Desserts
        RestaurantMenu.addDish(new Dessert("Tramisu", 2.5));
        RestaurantMenu.addDish(new Dessert("Tartufo", 2));
        RestaurantMenu.addDish(new Dessert("choco Milk Chack", 2.5));
        RestaurantMenu.addDish(new Dessert("Vanilla Ice Cream", 2));
        RestaurantMenu.addDish(new Dessert("Strawberry Waffle", 3));


        // Print Menu
        System.out.print(MyRestaurant.getName());
        System.out.println(RestaurantMenu);
        System.out.println("\n\n");

        // Place Order
        System.out.println("***********************************************************************");
        System.out.println("Please enter your order by item number");
        System.out.println("Enter # to place the order");
        System.out.println("***********************************************************************");

        Scanner scanner = new Scanner(System.in);
        Order customerOrder = new Order();
        String input = "";
        while (scanner.hasNext()) {
            int dishNumber = 0;
            input = scanner.nextLine();
            if (input.equals("#")) break;
            try {
                dishNumber = Integer.parseInt(input);
                Dish dishByNumber = RestaurantMenu.getDishByNumber(dishNumber);
                if (dishByNumber != null) {
                    customerOrder.addItem(dishByNumber);
                } else {
                    System.out.println("Could not find a menu item with number " + dishNumber + ", please try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input (Order item should be an integer!)");
            }
        }
        scanner.close();

        // Print Bill
        customerOrder.printOrderBill();

    }
}

