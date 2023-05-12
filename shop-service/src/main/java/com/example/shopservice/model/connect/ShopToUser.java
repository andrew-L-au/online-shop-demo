package com.example.shopservice.model.connect;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopToUser {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long shopId;
    private Long userId;
}
