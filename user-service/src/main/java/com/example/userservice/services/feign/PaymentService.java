package com.example.userservice.services.feign;

import com.example.userservice.model.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("payment-service")
public interface PaymentService {
    @PostMapping("/open-wallet")
    void openWallet(User user);
}
