package org.nelg.learn_3.controller;

import org.nelg.learn_3.config.SpringConfiguration;
import org.nelg.learn_3.service.WalletService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

    public static void main(String[] args) {

        //获取IOC容器对象
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //更加id获取bean对象
        WalletService walletService = (WalletService) ac.getBean("walletService");
        walletService.getMoney();
    }
}
