package com.spring.hello;

import com.spring.user.BeforeAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBeforeAdvice {
    @Autowired
    public String myBeforeAdvice(){
        return "this is a mybeforeadvice";
    }
}
