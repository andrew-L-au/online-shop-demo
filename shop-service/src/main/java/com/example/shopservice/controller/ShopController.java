package com.example.shopservice.controller;

import com.example.shopservice.model.DTO.StorageDTO;
import com.example.shopservice.model.art.Art;
import com.example.shopservice.model.shop.Shop;
import com.example.shopservice.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping("/creat-shop")
    public void creatShop(@RequestBody Shop shop){
        shopService.creatShop(shop);
    }

    @PostMapping("/increase-storage")
    public void increaseStorage(@RequestBody StorageDTO storageDTO){
        shopService.increaseStorage(storageDTO.getShop(), storageDTO.getArt());
    }

    @PostMapping("/decrease-storage")
    public void decreaseStorage(@RequestBody StorageDTO storageDTO){
        shopService.decreaseStorage(storageDTO.getShop(), storageDTO.getArt());
    }
}
