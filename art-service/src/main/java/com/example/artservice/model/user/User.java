package com.example.artservice.model.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.artservice.model.order.Order;
import com.example.artservice.model.payment.Wallet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Long userId;
    private String username;
    @TableField(exist = false)
    private List<Order> orders;
    @TableField(exist = false)
    private Wallet wallet;
}
