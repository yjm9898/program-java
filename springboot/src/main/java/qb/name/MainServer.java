package qb.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qb
 * @version 1.0.0
 * @description:
 * @date 2017-1-14 16:59
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"qb.name.controller"})
public class MainServer {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(MainServer.class);
        application.run(args);
    }
}
