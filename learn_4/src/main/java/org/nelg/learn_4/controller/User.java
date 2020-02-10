package org.nelg.learn_4.controller;

import org.nelg.learn_4.service.WalletService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

    public static void main(String[] args) {

        //获取IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //更加id获取bean对象
        WalletService walletService = (WalletService) ac.getBean("walletService");
        walletService.getMoney();
    }
}
