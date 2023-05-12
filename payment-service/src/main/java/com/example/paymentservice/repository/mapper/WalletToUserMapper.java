package com.example.paymentservice.repository.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.paymentservice.model.connect.WalletToUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalletToUserMapper extends BaseMapper<WalletToUser> {
    default WalletToUser selectByUserId(Long userId){
        return this.selectOne(new QueryWrapper<WalletToUser>().eq("user_id",userId));
    }
}
