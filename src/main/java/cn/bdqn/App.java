package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("cn.bdqn.dao")
@EnableTransactionManagement
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
