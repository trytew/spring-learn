package org.nelg.learn_1.service;

import org.nelg.learn_1.dao.WalletDao;

import java.util.List;
import java.util.Map;

public class WalletService {

    private int money;

    private List<String> myList;

    private Map<String, String> myMap;

    private WalletDao walletDao;

    public WalletService() {
        System.out.println("WalletService对象被创建");
    }

    /**
     * 构造函数注入
     *
     * @param money
     */
    public WalletService(int money) {
        this.money = money;
    }

    /**
     * set方法注入
     *
     * @param money
     * @return
     */
    public WalletService setMoney(int money) {
        this.money = money;
        return this;
    }

    /**
     * 集合数据注入
     *
     * @param myList
     * @return
     */
    public WalletService setMyList(List<String> myList) {
        this.myList = myList;
        return this;
    }

    /**
     * 集合数据注入
     *
     * @param myMap
     * @return
     */
    public WalletService setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
        return this;
    }

    /**
     * bean注入
     *
     * @param walletDao
     * @return
     */
    public WalletService setWalletDao(WalletDao walletDao) {
        this.walletDao = walletDao;
        return this;
    }

    public void getMoney() {
        this.walletDao.getMoney();
        System.out.println("get Money("+ this.money +") from service");
        System.out.println(this.myList);
        System.out.println(this.myMap);
    }
}
