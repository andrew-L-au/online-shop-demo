package com.example.orderservice.model.DTO;

import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.order.Order;
import com.example.orderservice.model.shop.Shop;
import com.example.orderservice.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceOneOrderDTO {
    private Shop shop;
    private Order order;
    private User user;
    private Art art;
}
