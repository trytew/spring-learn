package org.nelg.learn_3.config;

import org.nelg.learn_3.dao.WalletDao;
import org.springframework.context.annotation.*;

//表明当前是一个配置类
@Configuration
//配置IOC容器的扫描路径
@ComponentScan(basePackages = {"org.nelg.learn_3"})
//添加配置类
@Import(JdbcConfiguration.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

    @Bean(name = "walletDao")
    public WalletDao createWalletDao() {
        return new WalletDao();
    }
}
