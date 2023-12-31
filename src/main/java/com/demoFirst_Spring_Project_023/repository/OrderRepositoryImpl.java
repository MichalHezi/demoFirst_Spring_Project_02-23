package com.demoFirst_Spring_Project_023.repository;

import com.demoFirst_Spring_Project_023.model.Order;
import com.demoFirst_Spring_Project_023.repository.mapper.OrderMapper;
import com.demoFirst_Spring_Project_023.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createOrder(Order order){
        String sql = "INSERT INTO " + Constants.ORDER_TABLE_NAME + "(item_name,item_price,customer_id) VALUES (?,?,?)";
        jdbcTemplate.update(sql,order.getItemName(),order.getPrice(),order.getCustomerId());
    }
    @Override
    public void deleteOrder(int id) {
        String sql = "DELETE FROM " + Constants.ORDER_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void updateOrderItemName(String newItemName, int orderId) {
        String sql = "UPDATE " + Constants.ORDER_TABLE_NAME + " SET item_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,newItemName,orderId);
    }

    @Override
    public void updateOrderItemPrice(double newPrice, int orderId) {
        String sql = "UPDATE " + Constants.ORDER_TABLE_NAME + " SET item_price = ? WHERE id = ?";
        jdbcTemplate.update(sql,newPrice,orderId);
    }

    @Override
    public void updateOrderCustomerId(int newCustomerId, int orderId) {
        String sql = "UPDATE " + Constants.ORDER_TABLE_NAME + " SET customer_id = ? WHERE id = ?";
        jdbcTemplate.update(sql,newCustomerId,orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        String sql = "SELECT * FROM " + Constants.ORDER_TABLE_NAME;
        return jdbcTemplate.query(sql,new OrderMapper());
    }

    @Override
    public Order getOrderById(int id) {
        String sql = "SELECT * FROM " + Constants.ORDER_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new OrderMapper(),id);
    }

    @Override
    public List<Order> getOrdersByCustomerId(int id) {
        String sql = "SELECT * FROM " + Constants.ORDER_TABLE_NAME + " WHERE customer_id = ?";
        return jdbcTemplate.query(sql, new OrderMapper(), id);
    }

    @Override
    public List<String> getItemNames() {
        String sql = "SELECT item_name FROM " + Constants.ORDER_TABLE_NAME;
        return jdbcTemplate.queryForList(sql,String.class);
    }

    @Override
    public Integer getSumOfPrice() {
        String sql = "SELECT sum(item_price) FROM " + Constants.ORDER_TABLE_NAME;
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
