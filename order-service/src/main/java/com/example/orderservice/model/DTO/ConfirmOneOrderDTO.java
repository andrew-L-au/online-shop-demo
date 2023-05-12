package com.example.orderservice.model.DTO;

import com.example.orderservice.model.order.Order;
import com.example.orderservice.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmOneOrderDTO {
    private Order order;
    private User user;
}
