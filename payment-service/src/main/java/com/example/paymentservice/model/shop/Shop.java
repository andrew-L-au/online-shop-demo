package com.example.paymentservice.model.shop;

import com.example.paymentservice.model.art.Art;
import com.example.paymentservice.model.user.User;
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
