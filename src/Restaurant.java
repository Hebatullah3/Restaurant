public class Restaurant {
    String name;
    Menu menu;

    Restaurant(String name) {
        this.name = name;
    }

    Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String restName) {
        this.name = restName;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

}
