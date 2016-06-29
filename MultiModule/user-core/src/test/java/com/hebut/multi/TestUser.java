package com.hebut.multi;


import com.hebut.multi.dao.IUserDao;
import com.hebut.multi.dao.UserDao;
import com.hebut.multi.model.User;
import com.hebut.multi.util.HibernateUtil;
import junit.framework.Assert;
import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestUser {
    @Test
    public void testAdd(){
        Session session = HibernateUtil.openSession();
        session.beginTransaction();

        User user = new User();
        user.setUsername("admin1");
        user.setPassword("123");
        user.setNickname("超级管理员1");
        //session.save(user);
        //Assert.assertTrue(user.getId()>0);
        session.getTransaction().commit();
    }
    private IUserDao userDao;


    @Test
    public void testLoad(){
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        User user = (User) session.load(User.class, 1);
        Assert.assertEquals(1,user.getId());
        System.out.println(user);
        session.getTransaction().commit();
    }


}