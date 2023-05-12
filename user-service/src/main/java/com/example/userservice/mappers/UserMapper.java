package com.example.userservice.mappers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.userservice.model.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    default User searchUserWithAllInfoByUsername(String username){
        return this.selectOne(new QueryWrapper<User>().eq("username",username));
    }
}
