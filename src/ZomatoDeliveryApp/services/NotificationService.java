package ZomatoDeliveryApp.services;
import java.util.List;
import ZomatoDeliveryApp.model.*;

public class NotificationService {

    public static void notify(Order order) {
        System.out.println("\nNotification: New " + order.gettype() + " order placed!");
        System.out.println("---------------------------------------------");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getUser().getName());
        System.out.println("Restaurant: " + order.getRestaurant().getName());
        System.out.println("Items Ordered:");

        List<Menu> items = order.getMenu();
        for (Menu item : items) {
            System.out.println("   - " + item.getName() + " (₹" + item.getPrice() + ")");
        }

        System.out.println("Total: ₹" + order.getTotal());
        System.out.println("Scheduled For: " + order.getSchedule());
        System.out.println("Payment: Done");
        System.out.println("---------------------------------------------");
    }

}
