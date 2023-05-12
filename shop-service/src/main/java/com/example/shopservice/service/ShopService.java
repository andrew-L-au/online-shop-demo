package com.example.shopservice.service;

import com.example.shopservice.model.art.Art;
import com.example.shopservice.model.connect.ShopToArt;
import com.example.shopservice.model.shop.Shop;
import com.example.shopservice.model.user.User;
import com.example.shopservice.repository.ShopRepository;
import com.example.shopservice.repository.mapper.ShopToArtMapper;
import com.example.shopservice.service.feign.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ArtService artService;

    @Autowired
    private ShopToArtMapper shopToArtMapper;

    public void creatShop(Shop shop){
        User owner = shop.getOwner();
        shopRepository.insertShop(shop, owner);
    }

    public void decreaseStorage(Shop shop ,Art art){
        ShopToArt shopToArt = shopToArtMapper.selectByArtId(art.getArtId());
        shopToArtMapper.deleteById(shopToArt.getId());
        artService.deleteOneArt(art);
    }

    public void increaseStorage(Shop shop ,Art art){
        artService.addOneArt(art);
        shopToArtMapper.insert(new ShopToArt(null , shop.getShopId(), art.getArtId()));
    }
}
