package com.example.paymentservice.repository;

import com.example.paymentservice.model.connect.WalletToUser;
import com.example.paymentservice.model.payment.Wallet;
import com.example.paymentservice.model.user.User;
import com.example.paymentservice.repository.mapper.WalletMapper;
import com.example.paymentservice.repository.mapper.WalletToUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WalletRepository {
    @Autowired
    private WalletMapper walletMapper;

    @Autowired
    private WalletToUserMapper walletToUserMapper;

    public void insertWallet(User user, Wallet wallet){
        walletMapper.insert(wallet);
        walletToUserMapper.insert(new WalletToUser(null, wallet.getWalletId(), user.getUserId()));
    }

    public void updateWalletBalanceOfUser(Long userId, Integer changeAmount){
        WalletToUser walletToUser = walletToUserMapper.selectByUserId(userId);
        Wallet wallet = walletMapper.selectById(walletToUser.getWalletId());
        wallet.setAmount(wallet.getAmount() + changeAmount);
        walletMapper.updateById(wallet);
    }
}
