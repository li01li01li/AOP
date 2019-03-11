package com.spring.user;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class UserDaoImpl implements UserDao {
    private  static  final Logger logger = LoggerFactory.getLogger(BeforeAdvice.class);
    @Override
    public void insert(){
       logger.debug("开始进行插入操作");
    }
}

