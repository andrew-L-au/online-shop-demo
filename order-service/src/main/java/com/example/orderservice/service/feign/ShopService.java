package com.example.orderservice.service.feign;


import com.example.orderservice.model.DTO.StorageDTO;
import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.shop.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@FeignClient("shop-service")
public interface ShopService {

    void decreaseStorage(StorageDTO storageDTO);

    void increaseStorage(StorageDTO storageDTO);
}
