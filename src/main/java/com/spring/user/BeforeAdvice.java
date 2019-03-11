package com.spring.user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class BeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(BeforeAdvice.class);

    public void beforeAdvice(){
        logger.debug("连接数据库操作...");
    }
}
