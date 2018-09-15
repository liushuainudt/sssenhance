package com.lius.sssenhance.user.service;

import com.lius.sssenhance.mybatis.dao.UserDao;
import com.lius.sssenhance.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDao userdao;

    public User getUserById(int id) {
        return userdao.getUserById(id);
    }

    public Boolean loginByUserIdAndPasswd(int id,String passwd) {
        User user =userdao.getUserByIdAndPasswd(id,passwd);
        return user==null?false:true;
    }
}
