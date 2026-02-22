package ZomatoDeliveryApp.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Restaurant restaurant;
    private List<Menu> menu=new ArrayList<>();

    public Cart(){
        restaurant = null;
    }

    public void addItem(Menu item){
        if(restaurant==null){
           System.err.println("Cart:Set a restaurant before adding an item");
           return ;
        }
        menu.add(item);
    }

    public double getTotalPrice(){
        double sum=0;
        for (Menu it : menu) {
            sum += it.getPrice();
        }
        return sum;
    }

    public boolean isEmpty() {
        return restaurant == null || menu.isEmpty();
    }

    public void clear() {
        menu.clear();
        restaurant = null;
    }

    public void setRestaurant(Restaurant r) {
        restaurant = r;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Menu> getItems() {
        return menu;
    }
}
