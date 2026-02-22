package ZomatoDeliveryApp.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int nextRestaurantID=0;
    private int restaurantID;
    private String name;
    private String location;
    List<Menu> menu;

    public Restaurant(String name,String location) {
        this.restaurantID = ++nextRestaurantID;
        this.name = name;
        this.location = location;
        menu = new ArrayList<>();
    }

    public Restaurant(){
        System.out.println("Destroying Restaurant"+this.name+"and clearing the menu");
        menu.clear();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void addMenu(Menu menu) {
        this.menu.add(menu);
    }
    public List<Menu> getMenu() {
        return this.menu;
    }
}
