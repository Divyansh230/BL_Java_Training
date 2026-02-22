package ZomatoDeliveryApp.factories;

import ZomatoDeliveryApp.model.*;
import ZomatoDeliveryApp.stratergies.PaymentStratergy;

import java.util.List;

public class ScheduleOrderFactory implements OrderFactory{

    private String schedule;

    public ScheduleOrderFactory(String schedule){
        this.schedule=schedule;
    }

    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<Menu> menuItems, PaymentStratergy paymentStrategy, double totalCost, String orderType) {
        Order order=null;
        if(orderType.equalsIgnoreCase("delivery")){
            Delivery deliveryOrder = new Delivery();
            deliveryOrder.setUser_Add(user.getAddress());
            order = deliveryOrder;
        } else {
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setRes_Add(restaurant.getLocation());
            order = pickupOrder;
        }

        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setMenu(menuItems);
        order.setPaymentStratergy(paymentStrategy);
        order.setSchedule(schedule);
        order.setTotal(totalCost);
        return order;
    }
}
