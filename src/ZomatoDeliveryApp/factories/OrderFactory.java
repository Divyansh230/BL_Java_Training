package ZomatoDeliveryApp.factories;

import ZomatoDeliveryApp.model.*;
import ZomatoDeliveryApp.stratergies.PaymentStratergy;

import java.util.List;

public interface OrderFactory {

    Order createOrder(User user, Cart cart, Restaurant restaurant, List<Menu> menuItems, PaymentStratergy paymentStrategy, double totalCost, String orderType);
}
