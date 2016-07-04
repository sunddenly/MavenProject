package com.hebut.mutil.service;

import com.hebut.multi.web.dao.UserDao;
import com.hebut.multi.web.model.User;
import com.hebut.multi.web.service.UserService;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by jxy on 2016/7/4.
 */
public class TestUserService {
    UserService userService = new UserService(new UserDao());
    @Test
    public void loadUser(){
        User admin1 = userService.loadByUsername("admin1");
        System.out.println(admin1);
    }

/*    @Test
    public void addUser(){
        User user = new User();
        long l = System.currentTimeMillis();
        user.setUsername("manager"+l);
        user.setPassword("123");
        user.setNickname("普通管理员");
        userService.add(user);
    }*/
}
