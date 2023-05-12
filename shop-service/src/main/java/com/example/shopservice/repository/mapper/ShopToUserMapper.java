package com.example.shopservice.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shopservice.model.connect.ShopToUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopToUserMapper extends BaseMapper<ShopToUser> {
}
