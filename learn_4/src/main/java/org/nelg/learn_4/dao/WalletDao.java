package org.nelg.learn_4.dao;

import org.springframework.stereotype.Component;

@Component("walletDao")
public class WalletDao {

    public WalletDao() {
        System.out.println("Wallet Dao 对象被创建");
    }

    public void getMoney() {
        System.out.println("get Money from dao");
    }
}
