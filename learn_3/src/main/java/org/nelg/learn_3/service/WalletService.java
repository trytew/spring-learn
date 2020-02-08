package org.nelg.learn_3.service;

import org.nelg.learn_3.dao.WalletDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//如果注解中不填写值默认取类名，且首字母小写
//@Component
//亦可随意指定id值
@Component("walletService")
public class WalletService {

    @Autowired
    private WalletDao walletDao;

    public WalletService() {
        System.out.println("WalletService对象被创建");
    }

    public void getMoney() {
        this.walletDao.getMoney();
        System.out.println("get Money from service");
    }
}
