package com.example.orderservice.service;

import com.example.orderservice.model.DTO.PayOrderDTO;
import com.example.orderservice.model.DTO.StorageDTO;
import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.order.Order;
import com.example.orderservice.model.shop.Shop;
import com.example.orderservice.model.user.User;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.service.feign.PaymentService;
import com.example.orderservice.service.feign.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ShopService shopService;

    @Autowired
    private PaymentService paymentService;

    public void placeOneOrder(Shop shop,Order order,User user,Art art){
        shopService.decreaseStorage(new StorageDTO(new Shop(),art));
        orderRepository.insertOrder(order,user,art);
    }

    public void cancelOneOrder(Shop shop,Order order){
        Art art = order.getArt();
        shopService.increaseStorage(new StorageDTO(shop,art));
    }

    public void confirmOneOrder(Order order,User user){
        payOneOrder(order,user);
    }

    public void payOneOrder(Order order,User user){
        paymentService.payOrder(new PayOrderDTO(user,order));
    }

    public List<Order> getOrderOfUser(User user){
        return orderRepository.selectOrdersOfUser(user.getUserId());
    }
}
