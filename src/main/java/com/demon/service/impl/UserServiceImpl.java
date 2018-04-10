package com.demon.service.impl;

import com.demon.dao.UserDao;
import com.demon.entity.User;
import com.demon.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;

public class UserServiceImpl implements UserService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private UserDao UserDao;

    @Override
    public User getId(long id){
        return UserDao.queryId(id);
    }
}
