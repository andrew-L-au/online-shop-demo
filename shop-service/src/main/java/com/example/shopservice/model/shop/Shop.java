package com.example.shopservice.model.shop;

import com.example.shopservice.model.art.Art;
import com.example.shopservice.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Long shopId;
    private User owner;
    private List<Art> arts;
}
