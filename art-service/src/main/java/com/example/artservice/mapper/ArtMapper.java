package com.example.artservice.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.artservice.model.art.Art;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArtMapper extends BaseMapper<Art> {
    default Art selectOneWithAllInfoByName(String name){
        return this.selectOne(new QueryWrapper<Art>().eq("name",name));
    }
}
