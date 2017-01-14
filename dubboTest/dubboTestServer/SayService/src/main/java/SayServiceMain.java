import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description:
 * author: qb
 * date:  2016-7-14  17:33
 * version: 1.0.0
 */
public class SayServiceMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sayService_context.xml");
        context.start();
        System.out.println("Say service had been started!");
        System.in.read();
    }
}
