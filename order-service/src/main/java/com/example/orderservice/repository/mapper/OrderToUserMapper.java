package com.example.orderservice.repository.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.orderservice.model.connect.OrderToArt;
import com.example.orderservice.model.connect.OrderToUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface OrderToUserMapper extends BaseMapper<OrderToUser> {
    default List<Long> selectOrderIdsByUserId(Long userId){
        List<OrderToUser> orderToUsers = this.selectList(new QueryWrapper<OrderToUser>().eq("user_id",userId));
        List<Long> orderIds = new ArrayList<>();
        orderToUsers.forEach(e -> {orderIds.add(e.getOrderId());});
        return orderIds;
    }
}
