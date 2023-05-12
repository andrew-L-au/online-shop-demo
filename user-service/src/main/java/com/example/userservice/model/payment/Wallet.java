package com.example.userservice.model.payment;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
public class Wallet {
    @TableId(value = "wallet_id",type = IdType.ASSIGN_ID)
    private Long walletId;
    private Integer amount;
}
