package com.example.orderservice.model.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.orderservice.model.art.Art;
import com.example.orderservice.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @TableId(value = "order_id",type = IdType.ASSIGN_ID)
    private Long orderId;
    @TableField(exist = false)
    private Art art;
    @TableField(exist = false)
    private User user;
    private Integer price;
}
