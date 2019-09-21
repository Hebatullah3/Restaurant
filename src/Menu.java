import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {

    private int numberOfDishes;
    private ArrayList<MainCourse> mainCourses;
    private ArrayList<Dessert> desserts;
    private ArrayList<Starter> starters;


    Menu() {
        this.numberOfDishes = 0;
        this.starters = new ArrayList<>();
        this.mainCourses = new ArrayList<>();
        this.desserts = new ArrayList<>();
    }

    Menu(ArrayList<MainCourse> mainCourses, ArrayList<Dessert> desserts, ArrayList<Starter> starters) {
        this.starters = starters;
        this.mainCourses = mainCourses;
        this.desserts = desserts;
    }

    public ArrayList<MainCourse> getMainCourses() {
        return mainCourses;
    }

    public void setMainCourses(ArrayList<MainCourse> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<Dessert> desserts) {
        this.desserts = desserts;
    }

    public ArrayList<Starter> getStarters() {
        return starters;
    }

    public void setStarters(ArrayList<Starter> starters) {
        this.starters = starters;
    }


    void addDish(Dish dish) {
        if (dish instanceof Starter) {
            numberOfDishes += 1;
            dish.setNumber(numberOfDishes);
            starters.add((Starter) dish);
        } else if (dish instanceof MainCourse) {
            numberOfDishes += 1;
            dish.setNumber(numberOfDishes);
            mainCourses.add((MainCourse) dish);
        } else if (dish instanceof Dessert) {
            numberOfDishes += 1;
            dish.setNumber(numberOfDishes);
            desserts.add((Dessert) dish);
        } else {
            System.out.println("Invalid Dish Type!");
        }

    }

    public Dish getDishByNumber(int dishNumber) {
        ArrayList<Dish> MenuDishes = new ArrayList<>();
        MenuDishes.addAll(this.starters);
        MenuDishes.addAll(this.mainCourses);
        MenuDishes.addAll(this.desserts);
        for (Dish dish : MenuDishes) {
            if (dish.getNumber() == dishNumber) return dish;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder MenuDisplay
                = new StringBuilder();

        MenuDisplay.append("\n\nStarters");
        MenuDisplay.append("\n------------------------------------");
        for (Starter starter : starters) {
            MenuDisplay.append("\n" + starter.display());
        }

        MenuDisplay.append("\n\nMain Courses");
        MenuDisplay.append("\n------------------------------------");
        for (MainCourse mainCourse : mainCourses) {
            MenuDisplay.append("\n" + mainCourse.display());
        }

        MenuDisplay.append("\n\nDesserts");
        MenuDisplay.append("\n------------------------------------");
        for (Dessert dessert : desserts) {
            MenuDisplay.append("\n" + dessert.display());
        }

        return MenuDisplay.toString();
    }
}

