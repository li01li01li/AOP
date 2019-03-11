package com.spring.hello;

public class HelloImpl implements Hello{
    @Override
    public String hello() {
        return "Hello,Spring AOP";
    }
}
