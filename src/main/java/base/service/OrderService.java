package base.service;

import java.util.List;
import base.model.Order;
import base.model.ShoppingCart;
import base.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
