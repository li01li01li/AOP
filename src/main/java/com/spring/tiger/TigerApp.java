package com.spring.tiger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new
                ClassPathXmlApplicationContext("tiger.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }

}
