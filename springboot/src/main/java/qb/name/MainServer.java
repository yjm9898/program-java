package qb.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qb
 * @description:
 * @date 2017-1-14 16:59
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"qb.name"})
@ServletComponentScan(basePackages = {"qb.name.filter"})
public class MainServer {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(MainServer.class);
        application.run(args);
        System.out.println("MainServer server was started!");
    }
}
