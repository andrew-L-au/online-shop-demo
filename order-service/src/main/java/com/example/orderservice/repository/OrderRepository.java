package com.example.orderservice.repository;

import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.connect.OrderToArt;
import com.example.orderservice.model.connect.OrderToUser;
import com.example.orderservice.model.order.Order;
import com.example.orderservice.model.user.User;
import com.example.orderservice.repository.mapper.OrderMapper;
import com.example.orderservice.repository.mapper.OrderToArtMapper;
import com.example.orderservice.repository.mapper.OrderToUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Repository
public class OrderRepository {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderToArtMapper orderToArtMapper;

    @Autowired
    private OrderToUserMapper orderToUserMapper;

    public void insertOrder(Order order, User user, Art art){
        orderMapper.insert(order);
        orderToUserMapper.insert(new OrderToUser(null, order.getOrderId(), user.getUserId()));
        orderToArtMapper.insert(new OrderToArt(null, order.getOrderId(), art.getArtId()));
    }

    public List<Order> selectOrdersOfUser(Long userId){
        List<Long> orderIds =  orderToUserMapper.selectOrderIdsByUserId(userId);
        List<Order> orders = new ArrayList<>();
        orderIds.forEach(e -> {
            orders.add(orderMapper.selectById(e));
        });
        return orders;
    }
}
