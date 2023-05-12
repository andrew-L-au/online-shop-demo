package com.example.shopservice.model.art;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.shopservice.model.shop.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Art{
    @TableId(value = "art_id",type = IdType.ASSIGN_ID)
    private Long artId;
    private String name;
    private Shop shop;
    private Integer price;
}
