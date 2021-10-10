package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Mybatis {

    private InputStream in;
    private SqlSession session;
    private IUserDao userDao;

    @Before//用于测试之前
    public void init() throws Exception {
//        1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//        3.使用工厂生产SqlSession对像
        session = factory.openSession();
//        4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(IUserDao.class);
    }

    @After//用于测试之后
    public void destroy() throws Exception {
//        提交事务
        session.commit();
//        6.释放资源
        session.close();
        in.close();
    }

//    查询所有用户
    @Test
    public void testFindall(){
//        5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

//    存储用户
    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("mybatis saveuser");
        user.setAddress("北京市顺义区");
        user.setSex("男");
        user.setBirthday(new Date());
//        5.使用代理对象执行方法
        userDao.saveUser(user);

    }

//    修改用户
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(50);
        user.setUsername("mybatis update user");
        user.setAddress("北京市顺义区");
        user.setSex("女");
        user.setBirthday(new Date());
//        5.使用代理对象执行方法
        userDao.updateUser(user);
    }

//  删除用户
    @Test
    public void testDelete(){
//        5.使用代理对象执行方法
        userDao.deleteUser(48);
    }
//  根据ID查询用户
    @Test
    public void testFindOne(){
//        5.使用代理对象执行方法
       User user = userDao.findById(50);
        System.out.println(user);
    }
}
