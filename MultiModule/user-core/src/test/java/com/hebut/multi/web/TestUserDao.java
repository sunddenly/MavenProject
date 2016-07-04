package com.hebut.multi.web;


import com.hebut.multi.web.dao.IUserDao;
import com.hebut.multi.web.model.User;
import com.hebut.multi.web.util.HibernateUtil;
import junit.framework.Assert;
import org.hibernate.Session;
import org.junit.Test;

public class TestUserDao {
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