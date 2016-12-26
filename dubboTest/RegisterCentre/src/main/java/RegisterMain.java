import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description:
 * author: <a href="qiaotaosheng@wxchina.com">TaoSheng.Qiao</a>
 * date:  2016-7-14  17:20
 * version: 1.0.0
 */
public class RegisterMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider_context.xml");
        context.start();
        System.out.println("RegisterMain service started!!!");
        System.in.read();
    }
}
