package com.demoFirst_Spring_Project_023.service;

import com.demoFirst_Spring_Project_023.model.Order;
import com.demoFirst_Spring_Project_023.model.OrderRequest;
import com.demoFirst_Spring_Project_023.model.OrderResponse;

public interface OrderService {

    OrderResponse createOrder(OrderRequest orderRequest);
    void deleteOrder(int id);
    void updateOrderItemName(String newItemName, int orderId);
    Order getOrderById(int id);
}
