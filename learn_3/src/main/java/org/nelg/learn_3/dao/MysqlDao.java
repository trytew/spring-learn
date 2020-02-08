package org.nelg.learn_3.dao;

public class MysqlDao {

    private String username;

    private String passwd;

    public MysqlDao() {
    }

    public MysqlDao(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public void getInfo() {
        System.out.println(this.username + ":" + this.passwd);
    }
}
