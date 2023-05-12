package com.example.shopservice.repository;

import com.example.shopservice.model.art.Art;
import com.example.shopservice.model.connect.ShopToUser;
import com.example.shopservice.model.shop.Shop;
import com.example.shopservice.model.user.User;
import com.example.shopservice.repository.mapper.ShopMapper;
import com.example.shopservice.repository.mapper.ShopToUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShopRepository {
    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private ShopToUserMapper shopToUserMapper;

    public void insertShop(Shop shop, User owner){
        shopMapper.insert(shop);
        shopToUserMapper.insert(new ShopToUser(null, shop.getShopId(), owner.getUserId()));
    }
}
