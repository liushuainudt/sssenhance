package com.lius.sssenhance.mybatis.dao;

import org.apache.ibatis.jdbc.Null;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import com.lius.sssenhance.mybatis.domain.User;


@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectUserByIdTest() {
        User user = userDao.getUserById(1);
        assertThat(user.getUsername()).isEqualTo("刘帅");
        assertThat(user.getPasswd()).isEqualTo("passwd");
        assertThat(user.getLoginIp()==null);
    }



}
