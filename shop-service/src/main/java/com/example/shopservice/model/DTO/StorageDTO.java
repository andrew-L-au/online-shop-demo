package com.example.shopservice.model.DTO;

import com.example.shopservice.model.art.Art;
import com.example.shopservice.model.shop.Shop;
import lombok.Data;

@Data
public class StorageDTO {
    private Shop shop;
    private Art art;
}
