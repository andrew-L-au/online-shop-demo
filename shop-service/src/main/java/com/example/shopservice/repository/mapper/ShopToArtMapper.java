package com.example.shopservice.repository.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shopservice.model.connect.ShopToArt;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopToArtMapper extends BaseMapper<ShopToArt> {
    default ShopToArt selectByArtId(Long artId){
        return this.selectOne(new QueryWrapper<ShopToArt>().eq("art_id",artId));
    }
}
