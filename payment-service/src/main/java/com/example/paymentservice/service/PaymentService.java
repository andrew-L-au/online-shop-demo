package com.example.paymentservice.service;

import com.example.paymentservice.model.order.Order;
import com.example.paymentservice.model.payment.Wallet;
import com.example.paymentservice.model.user.User;
import com.example.paymentservice.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WalletRepository walletRepository;

    public void openWallet(User user){
        walletRepository.insertWallet(user,new Wallet(null, 0));
    }

    public void decreaseBalance(Long userId, Integer changeAmount){
        walletRepository.updateWalletBalanceOfUser(userId, -1 * changeAmount);
    }

    public void addBalance(Long userId, Integer changeAmount){
        walletRepository.updateWalletBalanceOfUser(userId, changeAmount);
    }

    public void payOrder(Long userId, Order order){
        this.decreaseBalance(userId,order.getPrice());
    }
}
