package com.demoFirst_Spring_Project_023.service;

public interface OrderService {

    OrderResponse createOrder(OrderRequest orderRequest);
    void deleteOrder(int id);
    void updateOrderItemName(String newItemName, int orderId);
    Order getOrderById(int id);
}
