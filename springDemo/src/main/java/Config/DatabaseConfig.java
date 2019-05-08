package Config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
@ComponentScan
@PropertySource("classpath:mysql-config.properties")
@MapperScan(value = "per.han.DB.mapper")
@EnableTransactionManagement
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("");
        dataSource.setUrl("");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean factoryBean() {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean;
    }
}

