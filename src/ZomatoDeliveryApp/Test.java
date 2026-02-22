package ZomatoDeliveryApp;

import ZomatoDeliveryApp.model.Order;
import ZomatoDeliveryApp.model.Restaurant;
import ZomatoDeliveryApp.model.User;
import ZomatoDeliveryApp.stratergies.UPI;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ZomatoOrchestrator orchestrator = new ZomatoOrchestrator();
        User user=new User(101,"Divyansh","Lucknow");

        List<Restaurant> restaurants=orchestrator.searchRestaurant("Lucknow");
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants found!");
            return;
        }

        System.out.println("Found Restaurants:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(" - " + restaurant.getName());
        }

        // User selects a restaurant
        orchestrator.selectRestaurant(user, restaurants.get(0));
        System.out.println("Selected restaurant: " + restaurants.get(0).getName());

        // User adds items to the cart
        orchestrator.addToCart(user, "P1");
        orchestrator.addToCart(user, "P2");

        orchestrator.printUserCart(user);

        // User checkout the cart
        Order order = orchestrator.checkoutNow(user, "Delivery", new UPI("1234567890"));

        // User pays for the cart. If payment is successful, notification is sent.
        orchestrator.payForOrder(user, order);
    }
}
