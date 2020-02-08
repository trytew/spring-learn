package org.nelg.learn_3.config;

import org.nelg.learn_3.dao.MysqlDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class JdbcConfiguration {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.passwd}")
    private String passwd;

    @Bean("mysqlDao")
    public MysqlDao createMysqlDao() {
        return new MysqlDao(this.username, this.passwd);
    }
}
