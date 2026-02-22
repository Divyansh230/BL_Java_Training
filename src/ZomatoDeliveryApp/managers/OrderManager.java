package ZomatoDeliveryApp.managers;

import ZomatoDeliveryApp.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders=new ArrayList<>();
    private static OrderManager instance=null;

    private OrderManager() {
        //private Constructor
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void listOrders() {
        System.out.println("\n--- All Orders ---");
        for (Order order : orders) {
            System.out.println(order.gettype() + " order for " + order.getUser().getName()
                    + " | Total: ₹" + order.getTotal()
                    + " | At: " + order.getSchedule());
        }
    }
}
