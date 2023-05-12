package com.example.userservice.model.shop;

import com.example.userservice.model.art.Art;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Long shopId;
    private List<Art> arts;
}
