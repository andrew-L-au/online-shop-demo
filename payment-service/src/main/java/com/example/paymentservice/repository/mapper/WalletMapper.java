package com.example.paymentservice.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.paymentservice.model.payment.Wallet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalletMapper extends BaseMapper<Wallet> {
}
