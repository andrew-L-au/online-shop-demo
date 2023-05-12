package com.example.shopservice.service.feign;

import com.example.shopservice.model.art.Art;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("art-service")
public interface ArtService {
    @GetMapping("/art/add-one-art")
    void addOneArt(Art art);

    @GetMapping("/art/delete-one-art")
    void deleteOneArt(Art art);

}
