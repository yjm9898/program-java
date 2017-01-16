package qb.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qb</a>
 * @description:
 * @date 2017-1-14 16:59
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"qb.name"})
public class MainServer {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(MainServer.class);
        application.run(args);
        System.out.println("MainServer server was started!");
    }
}
