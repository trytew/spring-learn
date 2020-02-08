package org.nelg.learn_3.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class WalletDao {

    @Autowired
    private MysqlDao mysqlDao;

    public WalletDao() {
        System.out.println("Wallet Dao 对象被创建");
    }

    public void getMoney() {
        mysqlDao.getInfo();
        System.out.println("get Money from dao");
    }
}
