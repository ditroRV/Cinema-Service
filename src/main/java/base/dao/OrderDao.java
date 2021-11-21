package base.dao;

import java.util.List;
import base.model.Order;
import base.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
