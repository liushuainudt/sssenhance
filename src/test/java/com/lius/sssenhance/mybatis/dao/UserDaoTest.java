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
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


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


    @Test
    public void updateUser() {
        User user = userDao.getUserById(1);

        //get ip
        String ip1 =null;
        String ip2 =null;
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            ip1 = socket.getLocalAddress().getHostAddress();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
             ip2 =InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.out.println(ip1);
        System.out.println(ip2);

        user.setLoginIp(ip2);

        int i =userDao.updateUser(user);
        assertThat(i==1);


    }



}
