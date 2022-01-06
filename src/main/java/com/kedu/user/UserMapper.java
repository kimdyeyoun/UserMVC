package com.kedu.user;

import com.kedu.user.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int joinUser(UserEntity entity);
    UserEntity loginUser(UserEntity entity);
}
