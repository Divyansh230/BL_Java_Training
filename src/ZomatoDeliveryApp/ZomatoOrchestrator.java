package ZomatoDeliveryApp;
import ZomatoDeliveryApp.factories.NowOrderFactory;
import ZomatoDeliveryApp.factories.OrderFactory;
import ZomatoDeliveryApp.model.*;
import ZomatoDeliveryApp.managers.*;
import ZomatoDeliveryApp.services.NotificationService;
import ZomatoDeliveryApp.stratergies.PaymentStratergy;

import java.util.List;

public class ZomatoOrchestrator {

    public ZomatoOrchestrator(){
        initializeRestaurant();
    }
    private void initializeRestaurant(){
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenu(new Menu("P1", "Chole Bhature", 120));
        restaurant1.addMenu(new Menu("P2", "Samosa", 15));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenu(new Menu("P1", "Raj Kachori", 80));
        restaurant2.addMenu(new Menu("P2", "Pav Bhaji", 100));
        restaurant2.addMenu(new Menu("P3", "Dhokla", 50));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant3.addMenu(new Menu("P1", "Masala Dosa", 90));
        restaurant3.addMenu(new Menu("P2", "Idli Vada", 60));
        restaurant3.addMenu(new Menu("P3", "Filter Coffee", 30));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }

    public List<Restaurant> searchRestaurant(String search){
        return RestaurantManager.getInstance().searchByLocation(search);
    }

    public void selectRestaurant(User user, Restaurant restaurant) {
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user, String itemCode) {
        Restaurant restaurant = user.getCart().getRestaurant();
        if (restaurant == null) {
            System.out.println("Please select a restaurant first.");
            return;
        }
        for (Menu item : restaurant.getMenu()) {
            if (item.getCode().equals(itemCode)) {
                user.getCart().addItem(item);
                break;
            }
        }
    }

    public Order checkoutNow(User user, String orderType, PaymentStratergy paymentStrategy) {
        return checkout(user, orderType, paymentStrategy, new NowOrderFactory());
    }

    public Order checkout(User user, String orderType, PaymentStratergy paymentStrategy, OrderFactory orderFactory) {
        if (user.getCart().isEmpty()) return null;

        Cart userCart = user.getCart();
        Restaurant orderedRestaurant = userCart.getRestaurant();
        List<Menu> itemsOrdered = userCart.getItems();
        double totalCost = userCart.getTotalPrice();

        Order order = orderFactory.createOrder(user, userCart, orderedRestaurant, itemsOrdered, paymentStrategy, totalCost, orderType);
        OrderManager.getInstance().addOrder(order);
        return order;
    }

    public void payForOrder(User user, Order order) {
        boolean isPaymentSuccess = order.processPayment(order.getTotal());

        if (isPaymentSuccess) {
            NotificationService.notify(order);
            user.getCart().clear();
        }
    }
    public void printUserCart(User user) {
        System.out.println("Items in cart:");
        System.out.println("------------------------------------");
        for (Menu item : user.getCart().getItems()) {
            System.out.println(item.getCode() + " : " + item.getName() + " : ₹" + item.getPrice());
        }
        System.out.println("------------------------------------");
        System.out.println("Grand total : ₹" + user.getCart().getTotalPrice());
    }
}
