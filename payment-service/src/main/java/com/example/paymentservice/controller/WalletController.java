package com.example.paymentservice.controller;

import com.example.paymentservice.model.DTO.PayOrderDTO;
import com.example.paymentservice.model.user.User;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class WalletController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/open-wallet")
    public void openWallet(@RequestBody User user){
        paymentService.openWallet(user);
    }

    @PostMapping("/pay-order")
    public void payOrder(@RequestBody PayOrderDTO payOrderDTO){
        paymentService.payOrder(payOrderDTO.getUser().getUserId(),payOrderDTO.getOrder());
    }
}
