package com.example.paymentservice.model.DTO;

import com.example.paymentservice.model.order.Order;
import com.example.paymentservice.model.user.User;
import lombok.Data;

@Data
public class PayOrderDTO {
    private User user;
    private Order order;
}
