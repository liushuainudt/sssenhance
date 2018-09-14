package com.lius.sssenhance.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import com.lius.sssenhance.mybatis.domain.User;


@Mapper
public interface UserDao {

    User getUserById(@Param("id") int id);

    int updateUser(@Param("user") User user);

    int insertUser(@Param("user") User user);

    int deleteUserById(@Param("id") int id);

}

