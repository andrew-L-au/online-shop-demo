package com.example.orderservice.controller;

import com.example.orderservice.model.DTO.CancelOneOrderDTO;
import com.example.orderservice.model.DTO.PlaceOneOrderDTO;
import com.example.orderservice.model.order.Order;
import com.example.orderservice.model.user.User;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/get-order-of-user")
    public List<Order> getOrderOfUser(@RequestBody User user){
        return orderService.getOrderOfUser(user);
    }

    @PostMapping("/place-one-order")
    public void placeOneOrder(@RequestBody PlaceOneOrderDTO placeOneOrderDTO){
        orderService.placeOneOrder(placeOneOrderDTO.getShop(), placeOneOrderDTO.getOrder(), placeOneOrderDTO.getUser(), placeOneOrderDTO.getArt());
    }

    @PostMapping("/cancel-one-order")
    public void cancelOneOrder(@RequestBody CancelOneOrderDTO cancelOneOrderDTO){
        orderService.cancelOneOrder(cancelOneOrderDTO.getShop(),cancelOneOrderDTO.getOrder());
    }

    @PostMapping("/confirm-one-order")
    public void confirmOneOrder(@RequestBody PlaceOneOrderDTO placeOneOrderDTO){
        orderService.confirmOneOrder(placeOneOrderDTO.getOrder(),placeOneOrderDTO.getUser());
    }
}
