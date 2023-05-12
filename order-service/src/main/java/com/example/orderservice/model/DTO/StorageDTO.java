package com.example.orderservice.model.DTO;

import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.shop.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageDTO {
    private Shop shop;
    private Art art;
}
