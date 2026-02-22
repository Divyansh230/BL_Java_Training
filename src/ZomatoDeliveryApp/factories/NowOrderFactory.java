package ZomatoDeliveryApp.factories;

import ZomatoDeliveryApp.model.*;
import ZomatoDeliveryApp.stratergies.PaymentStratergy;
import ZomatoDeliveryApp.utils.TimeUtils;

import java.util.List;

public class NowOrderFactory implements OrderFactory {

    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<Menu> menuItems, PaymentStratergy paymentStrategy, double totalCost, String orderType) {
        Order order=null;
        if(orderType.equalsIgnoreCase("Delivery")){
            Delivery deliveryOrder=new Delivery();
            deliveryOrder.setUser_Add(user.getAddress());
            order=deliveryOrder;
        }
        else{
            PickupOrder pickupOrder=new PickupOrder();
            pickupOrder.setRes_Add(restaurant.getLocation());
            order=pickupOrder;
        }
        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setMenu(menuItems);
        order.setPaymentStratergy(paymentStrategy);
        order.setSchedule(TimeUtils.getCurrentTime());
        order.setTotal(totalCost);
        return order;
    }
}
