package com.example.orderservice.service.feign;

import com.example.orderservice.model.DTO.PayOrderDTO;
import com.example.orderservice.model.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("payment-service")
public interface PaymentService {
    @PostMapping("/open-wallet")
    void openWallet(User user);

    @PostMapping("/pay-order")
    void payOrder(PayOrderDTO payOrderDTO);
}
